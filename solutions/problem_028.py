#!/usr/bin/python3

# Created by Max Muth on 03.05.17.
# kontakt@maxi-muth.de

# Number spiral diagonals
# https://projecteuler.net/problem=28


def spiral_diag_numbers(gridsize):
    numbers = [1]
    # number of result numbers is < 2*gridsize - 1
    incrementor = 2
    while len(numbers) < 2*gridsize - 1:
        for _ in range(4):
            numbers.append(numbers[-1] + incrementor)
        incrementor += 2  # incrementor increases with 2 every 4 elements
    return numbers

print(sum(spiral_diag_numbers(1001)))
