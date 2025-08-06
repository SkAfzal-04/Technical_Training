import math

def Armstrong(num):
    original = num
    power = len(str(num))
    result = 0
    while num > 0:
        digit = num % 10
        result += math.pow(digit, power)
        num //= 10
    return result == original

inp = int(input("Enter the number: "))
print("YES" if Armstrong(inp) else "NO")
