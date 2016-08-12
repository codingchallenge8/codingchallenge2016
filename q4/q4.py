import math

N = int(input())
coord = []
coord_xy = []
for i in range(1,N+1):
    coord = input()
    coord_xy.append(coord.split(' '))

for i in range(0,N):    
    x = float(coord_xy[i][0])
    x = x + 0.00001
    y = float(coord_xy[i][1])
    m1 = (2*y*x + math.sqrt(4*(y**2)*(x**2) - 4*(x**2-1)*(y**2-1)))/(2*(x**2-1))
    c1 = y - m1*x
    m2 = (2*y*x - math.sqrt(4*(y**2)*(x**2) - 4*(x**2-1)*(y**2-1)))/(2*(x**2-1))
    c2 = y - m2*x
    print('(' + str(-1*m1) + ',' + str(1) + ',' + str(c1) + ',' + str(-1*m2) + ',' + str(1) + ',' + str(c2) + ')')