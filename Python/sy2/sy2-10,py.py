sentense = input("请输入一个英文句子：")
word_count = {}
current_word = ""
for char in sentense:
    if char != " ":
        current_word = current_word + char
    else:
        if current_word != "":
            if current_word in word_count:
                word_count[current_word] += 1
            else:
                word_count[current_word] = 1
            current_word = ""
if current_word != "":
    if current_word in word_count:
        word_count[current_word] += 1
    else:
        word_count[current_word] = 1
print("\n单词统计结果：")
for word, count in word_count.items():
    print(f"'{word}': {count} 次")
