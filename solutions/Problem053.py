#!/usr/bin/python3

# Created by Max Muth on 04. December 2014
# kontakt@maxi-muth.de

''' Combinatoric selection
How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?
'''

from euler_helper import *

print(len([1 for n in range(22, 101) for r in range(1, n) if binomial(n, r) > 1000000]))