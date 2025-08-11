arr = list(map(int, input("Enter the array elements: ").split()))
k=int(input("Enter the kth term: "))
arr.sort()
s=set(arr)
arr=list(s)
print(f"{k}th smallest element is :{arr[k-1]}")


