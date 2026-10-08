for i in range(1,10):
    for j in range(1,10):
        print('{}*{}={}\t'.format(i,j,i*j),end='')
    print("")
print()
for i in range(1, 10):
    print("        " * (i - 1), end="")
    for j in range(i, 10):
        print(f"{i}*{j}={i*j:2d}", end="  ")
    print()
print()
for i in range(1,10):
    for j in range(1,i+1):
        print('{}*{}={}\t'.format(i, j, i * j), end='')
    print()
