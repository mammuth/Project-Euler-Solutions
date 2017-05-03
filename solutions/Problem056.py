#!/usr/bin/python3

# Created by Max Muth on 05. December 2014
# kontakt@maxi-muth.de

maxSum = 0

for a in range(2, 100):
    for b in range(2, 100):
        digitSum = sum(int(digit) for digit in str(a ** b))
        if digitSum > maxSum:
            maxSum = digitSum

print(maxSum)