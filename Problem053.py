#!/usr/bin/python3

# Created by Max Muth on 04. December 2014
# kontakt@maxi-muth.de

from EulerLibrary import *

print(len([1 for n in range(22, 101) for r in range(1, n) if binomial(n, r) > 1000000]))