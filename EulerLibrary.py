#!/usr/bin/python

# Created by Max Muth on 31. August 2014
# kontakt@maxi-muth.de

from math import *


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


def primes(n):
    """
    Returns an array containing primes < n.

    Uses sieve of Eratosthenes.
    """
    numbers = list(range(2, n + 1))
    p = 2
    j = 0
    done = False
    while not done:
        for i, n in enumerate(numbers):
            if n % p == 0 and n != p:
                numbers.pop(i)
        j += 1
        p = numbers[j]
        if p ** 2 > n:
            done = True
    return numbers


def binomial(n, k):
    f = factorial
    return int(f(n) / f(k) / f(n - k))


def primeFactors(n):
    factors = list()
    for i in range(2, n):
        while n % i == 0:
            factors.append(i)
            n /= i
    return factors


def distinctPrimeFactors(n):
    factors = set()
    for i in range(2, n):
        while n % i == 0:
            factors.add(i)
            n /= i
    return factors


def isEven(n):
    return n % 2 == 0


def isOdd(n):
    return n % 2 != 0


"""
Special Numbers / Sequences
"""


def fibonacci(n):
    """
    Returns the n-th term of the fibonacci sequence.
    """
    return int(((1 + sqrt(5)) ** n - (1 - sqrt(5)) ** n) / (2 ** n * sqrt(5)))


def pentagonal(n):
    """
    Returns the n-th pentagonal number.
    """
    return int(n * (3 * n - 1) / 2)


def triangle(n):
    """
    Returns the n-th triangle number.
    """
    return int(n * (n + 1) / 2)


def hexagonal(n):
    """
    Returns the n-th hexagonal number.
    """
    return int(n * (2 * n - 1))