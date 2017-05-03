#!/usr/bin/python3

# Created by Max Muth on 05.08.14.
# kontakt@maxi-muth.de

# Paths through a 20x20 grid



# binomial coefficient using multiplicative formula
def binomial(n,k):
    a = 1
    for i in range(1,k+1):
        a *= (n - (k - i))
        a /= i
    return a

gridSize = 20

print("There are "+`binomial(2*gridSize, gridSize)`+" ways to go through a "+`gridSize`+"x"+`gridSize`+" grid.")