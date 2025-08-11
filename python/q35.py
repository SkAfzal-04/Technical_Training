a="abc"
b="12345"
l=max(len(a),len(b))
m=min(len(a),len(b))
r=""
i=0
j=0
while i < m:
    r+=a[i]
    r+=b[i]
    i+=1

while i<l:
    if l==len(a):
        r+=a[i]
    elif l==(len(b)):
        r+=b[i]
    i+=1

print(r)
