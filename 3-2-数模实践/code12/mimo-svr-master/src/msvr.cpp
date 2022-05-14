/**
 * @file msvr.cpp
 * @author  Bill Brouwer <whiskeyjulietb@gmail.com>
 * @version 1.0
 *
 * @section LICENSE
 * Copyright 2013 William J. Brouwer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @section DESCRIPTION
 *
 * A port of code developed by Fernando Pérez-Cruz; please cite:
 *
 * Sánchez-Fernández, M. and dePrado-Cumplido, M. and Arenas-García, J. and Pérez-Cruz, F.
 * SVM multiregression for nonlinear channel estimation in multiple-input multiple-output systems
 * IEEE Trans. Signal Proc., 52(8), 2298-2307, 2004
 */




#include "msvr.hpp"

namespace mimo_svr{


	msvr::msvr(mat Xtrain, mat Ytrain,string ker,double C,double epsi, double param, double tol){

		// kernel matrix from samples
		H = k_mat(trans(Xtrain),trans(Xtrain),ker,param);


		int n_m 	= size(Xtrain,0);
		int n_k 	= size(Ytrain,1);

		// the regression parameters
		Beta 		= zeros(n_m,n_k);
		// prediction error
		mat E		= Ytrain - H*Beta;
		
		mat u		= sqrt(sum(pow(E,2),1));

		mat RMSE	= zeros(MX_ITS,1);
		RMSE(0,0)	= sqrt(mean_all(pow(u,2)));
		

		// points outside epsilon tube
		i1		= find(u>=epsi);
		mat alpha	= 2*C*(u-epsi)/u;

		int L_r		= size(u,0);
		mat L		= zeros(L_r,1);

		mat Lp		= zeros(MX_ITS,1);

		// optimize outside epsilon
		L(i1) 		= pow(u(i1),2)-2*epsi*u(i1)+epsi*epsi;


		mat tmp		= Beta.t()*H*Beta;

		// minimize
		Lp(0,0)		= sum(tmp.diag())/2 + C*accu(L)/2;


		double eta	= 1.0f,k = 1;
		int nconv	= 1;

		mat Beta_a, E_a, u_a, M1,sal1;
		uvec i1_a;

		while ((nconv) && (k<MX_ITS)){

			//cout << RMSE(k,0) << endl;

			Beta_a		= Beta;
			E_a		= E;
			u_a		= u;
			i1_a		= i1;


			mat tmp		= 1/alpha(i1);
			int ln		= size(tmp,0);
			ln		*= size(tmp,1);



			M1		= (H(i1,i1) +diagmat(tmp)) + 1e-10*eye(ln,ln);	
			sal1		= inv(M1)*Ytrain.rows(i1);

			eta		= 1.0f;
			Beta 		= zeros(n_m,n_k);
			Beta.rows(i1)	= sal1;

			//cout << k << endl;
			//cout << Beta << endl;


			E		= Ytrain - H*Beta;
			u		= sqrt(sum(pow(E,2),1));
			i1		= find(u>=epsi);

			L		= zeros(L_r,1);
			L(i1) 		= pow(u(i1),2)-2*epsi*u(i1)+epsi*epsi;
			mat tmp2	= Beta.t()*H*Beta;
			Lp(k,0)		= sum(tmp2.diag())/2.0f+C*accu(L)/2.0f;

			while (Lp(k,0) > Lp(k-1,0)){

				eta 		/= 10.0;
				i1		= i1_a;
				Beta 		= zeros(n_m,n_k);
				Beta.rows(i1)	= eta*sal1 + (1-eta)*Beta_a.rows(i1);


				E		= Ytrain - H*Beta;
				u		= sqrt(sum(pow(E,2),1));
				i1		= find(u>=epsi);
				L		= zeros(L_r,1);
				L(i1) 		= pow(u(i1),2)-2*epsi*u(i1)+epsi*epsi;
				tmp2		= Beta.t()*H*Beta;
				Lp(k,0)		= sum(tmp2.diag())/2.0f+C*accu(L)/2.0f;



				if (eta < 1e-16f){

					Lp(k,0)		= Lp(k-1,0)-1e-15f;
					Beta		= Beta_a;
					u		= u_a;
					i1		= i1_a;

					nconv		= 0;
				}

			}



			alpha		= 2*C*(u-epsi)/u;
			RMSE(k,0)	= sqrt(mean_all(pow(u,2)));

			//cout << alpha << endl;
			//cout << Beta << endl;

			if((Lp(k-1,0)-Lp(k,0))/Lp(k-1,0) < tol){



				nconv		= 0;

			}


			k++;


			if (size(i1,0)==0){

				nconv	= 0;
				Beta 	= zeros(n_m,n_k);


			}

		}


	};

};
