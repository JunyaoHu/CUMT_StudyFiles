mimo-svr
========

multiple input, multiple output support vector regression.


A port of code developed by Fernando Pérez-Cruz; please cite:


William J. Brouwer, James D. Kubicki, Jorge O. Sofo, C. Lee Giles
An Investigation of Machine Learning Methods Applied to Structure Prediction in Condensed Matter
arXiv:1405.3564 [cond-mat.mtrl-sci]
http://arxiv.org/abs/1405.3564


Sánchez-Fernández, M. and dePrado-Cumplido, M. and Arenas-García, J. and Pérez-Cruz, F. SVM multiregression for nonlinear channel estimation in multiple-input multiple-output systems IEEE Trans. Signal Proc., 52(8), 2298-2307, 2004

A small train/test set is in the inc directory, corresponding to compressed NMR data (x) and unit cell parameters (y) for the corresponding atomic structures that give rise to the spectra.

To run after 'make', from bin directory: 

./msvr.x ../inc/trainx_0.txt ../inc/testx_0.txt ../inc/trainy_0.txt ../inc/testy_0.txt rbf 2 8 0.1

and the output should be the average relative errors for the tests. For an explanation of relevant parameters please read the source code or the article referenced -wjb 03/14
