import math
for i in range(100,150):
    found = True
    for j in range(2,int(math.sqrt(i)) + 1):
        if i % j == 0:
            found = False
            break
    if found:
        print(i,end='\t')
