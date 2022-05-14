/**
 * @file utilities.cpp
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



#include "utilities.hpp"


namespace mimo_svr{

	mat k_mat(mat inputA, mat inputB, string type, double param){

		mat result;

		if (!strcmp(type.c_str(),"lin")){
			mat tmp = trans(inputA) * inputB;

			result = tmp / norm(tmp,2) + param;

		}

		else if (!strcmp(type.c_str(),"poly")){
			mat tmp = trans(inputA) * inputB;

			result = pow((tmp / norm(tmp,2) + 1.0),param);

		}

		else{
			mat n2sq = sum(pow(inputB,2));
			double n1 = size(inputA,1);
			double n2 = size(inputB,1);
			mat n1sq = sum(pow(inputA,2));	
			mat tmp = trans(ones(n2,1)*n1sq) + ones(n1,1)*n2sq - 2.0*trans(inputA)*inputB;


			result = exp(-pow(tmp,2) / (2.0*param*param));			
		}

		return result;


	}



	mat pdist(mat input){

		int num = (input.n_rows*(input.n_rows-1))/2;	
		mat foo(1,num); int k=0;

		for (unsigned int i=0; i<input.n_rows-1; i++){
			for (unsigned int j=i+1; j<input.n_rows; j++){

				foo(k) = norm((input.row(i)-input.row(j)),2);	
				k++;
			}

		}



		return foo;

	};


	double mean_all(mat input){

		return accu(input) / input.n_rows / input.n_cols;	

	};
};
