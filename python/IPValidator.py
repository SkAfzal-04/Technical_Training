def Validate(st):
    st = st.split(".")
    try:
        if len(st) != 4:
            return 0
        for i in range(len(st)):
            part = st[i]
            if not part.isdigit():
                return 0
            num = int(part)
            if num < 0 or num > 255:
                return 0
            if (len(part) > 1 and part[0] == '0'): 
                return 0
        return 1
    except Exception as e:
        return 0

st =input("Enter the string: ")
output = Validate(st)
if output == 0:
    print("NO")
else:
    print("YES")
