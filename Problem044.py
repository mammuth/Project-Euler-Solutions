#!/usr/bin/python3

# Created by Max Muth on 31. August 14
# kontakt@maxi-muth.de
#
# Pentagonal Numbers

from itertools import *
from operator import *

from EulerLibrary import *


pentagonals = set(pentagonal(n) for n in range(1, 3000))
c = combinations(pentagonals, 2)

for p in c:
    if add(*p) in pentagonals and abs(sub(*p)) in pentagonals:
        print(int(abs(sub(*p))))