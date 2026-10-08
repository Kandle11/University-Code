count = 0
for i in range( 20 // 1 + 1 ):
    for j in range( (20 - i * 1) // 5 + 1 ):
        for k in range( (20 - j * 5 - i * 1) // 10 + 1):
            if i * 1 + j * 5 + k * 10 == 20:
                print(f'10元={k}张  5元={j}张  1元={i}张')
                count += 1
print( '钱币兑换情况有%d钟' % count )
