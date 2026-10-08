import math
r = float(input("请输入球的半径:"))
pi = math.pi
S = 4*pi*r*r
V = 4/3*r*r*r*pi
print(f'球的表面积为:{S:.2f},体积为:{V:.2f}')
