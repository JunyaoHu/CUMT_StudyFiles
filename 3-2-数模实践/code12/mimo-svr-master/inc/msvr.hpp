/**
 * @file msvr.hpp
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



#ifndef _MSVR
#define _MSVR

#include <iostream>
#include <fstream>
#include <stdexcept>

#include "armadillo"
#include "utilities.hpp"

using namespace std;
using namespace arma;




namespace mimo_svr{

	class msvr{


		private:


			mat Beta;
			mat H;
			uvec i1;

		public:


			msvr(mat Xtrain, 
				mat Ytrain,
				string ker,
				double C,
				double epsi, 
				double par, 
				double tol);

			mat getBeta(){
				return Beta;
			}

			mat getH(){
				return H;
			}

			uvec geti1(){
				return i1;
			}

			~msvr(){};

	};
};
#endif
