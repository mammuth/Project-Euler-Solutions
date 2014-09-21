#!/usr/bin/python3

# Created by Max Muth on 21. September 2014
# kontakt@maxi-muth.de

# base < 10
# exponent < 22

print(len(list("yeah" for b in range(1, 10) for e in range(1, 22) if len(str(b ** e)) == e)))