def Merge(arr1, arr2):
    i = j = 0
    r = []
    while i < len(arr1) and j < len(arr2):
        if arr1[i] < arr2[j]:
            r.append(arr1[i])
            i += 1
        else:
            r.append(arr2[j])
            j += 1
    while i < len(arr1):
        r.append(arr1[i])
        i += 1

    while j < len(arr2):
        r.append(arr2[j])
        j += 1

    return r


a = [7, 1, 3, 5, 3]
b = [6, 4, 2, 8, 9, 6]


a = sorted(set(a))
b = sorted(set(b))


print(Merge(a, b))
