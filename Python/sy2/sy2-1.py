pm = int(input("请输入当日PM2.5的值："))
if 35 > pm >= 0:
    print("当日空气质量为优。")
elif pm <= 75:
    print("当日空气质量为良。")
else:
    print("当日空气污染严重。")
