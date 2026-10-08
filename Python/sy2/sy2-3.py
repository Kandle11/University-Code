login = True
count = 3
while login:
    username = input("请输入您的用户名：")
    password = input("请输入您的密码：")
    if username == 'admin' and password == '123456':
        login = False
        print("登录成功！")
    else:
        count-=1
        if count == 0:
            print('您已经登录失败三次，请稍后重试！')
            login = False
        else:
            print(f'登录失败，用户名或密码错误，请重新输入,您还剩{count}次机会')
