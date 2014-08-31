#!/usr/bin/python

# Created by Max Muth on 31. August 2014
# kontakt@maxi-muth.de

from functools import reduce
from math import *


def pentagonal(n):
    """
    Returns the n-th pentagonal number
    """
    return n * (3 * n - 1) / 2


def isPrime(n):
    """
    Checks whtere n is prime.
    """
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False

    for i in range(3, sqrt(n), 2):
        if n % i == 0:
            return False

    return True


def factorial(n):
    return reduce(lambda x, y: x * y, range(1, n + 1))


def fibonacci(n):
    """
    Returns the n-th term of the fibonacci sequence
    """
    return int(((1 + sqrt(5)) ** n - (1 - sqrt(5)) ** n) / (2 ** n * sqrt(5)))