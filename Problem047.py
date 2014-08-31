#!/usr/bin/python3

# Created by Max Muth on 31. August 2014
# kontakt@maxi-muth.de

from EulerLibrary import *

for i in range(1, 1000000):
    if len(distinctPrimeFactors(i)) == 4 \
            and len(distinctPrimeFactors(i + 1)) == 4 \
            and len(distinctPrimeFactors(i + 2)) == 4 \
            and len(distinctPrimeFactors(i + 3)) == 4:
        print(i)
        break
