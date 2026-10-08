import math
a = 1
b = -10
c = 16
delta = b**2 - 4*a*c
x1 = (-b + math.sqrt(delta))/2*a
x2 = (-b - math.sqrt(delta))/2*a
print('一元二次方程x2-10x+16=0的解为:{},{}'.format(x1,x2))
