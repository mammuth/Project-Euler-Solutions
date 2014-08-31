#!/usr/bin/python

# Created by Max Muth on 05.08.14.
# kontakt@maxi-muth.de

# First term in Fibonacci with 1000 digits


def nextFibonacci(a, b):
    global p1,p2
    p1 = b
    p2 = a+b
    return a+b

# previous fibonaccis
p1 = 1
p2 = 1

f = 0 # next fibonacci
term = 2 # number of current term
while(len(str(f)) < 1000):
    f = nextFibonacci(p1,p2)
    term+=1

print(str(term)+"th: "+str(f))
