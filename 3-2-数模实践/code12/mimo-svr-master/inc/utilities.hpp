/**
 * @file utilities.hpp
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


#ifndef _UTILITIES
#define _UTILITIES

#define MX_ITS	10000
#include <iostream>
#include <fstream>
#include <stdexcept>

#include "armadillo"

using namespace std;
using namespace arma;




namespace mimo_svr{

	/// the kernel matrix
	mat k_mat(mat inputA, mat inputB, string type, double param);
	/// euclidean distance between all rows
	mat pdist(mat input);
	/// a mean over all elements
	double mean_all(mat input);
};
#endif
