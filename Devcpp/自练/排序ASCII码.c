#include <stdio.h>
#include <ctype.h>

int main() {
    char a, b, c, tmp;
    int ch;
    // 循环读取，直到EOF
    while (1) {
    	
    	
        // 步骤1：跳过所有空白字符（换行/空格/制表符，兼容OJ的任意空白格式）
        while ((ch = getchar()) != EOF && isspace(ch));
        if (ch == EOF) break; // 输入结束，退出
        ungetc(ch, stdin);    // 把非空白字符塞回缓冲区
        
        
        // 步骤2：读取3个有效字符（严格匹配题目要求）
        if (scanf("%c%c%c", &a, &b, &c) != 3) break;
        
        
        // 步骤3：排序（ASCII升序，无逻辑漏洞）
        if (a > b) { tmp = a; a = b; b = tmp; }
        if (a > c) { tmp = a; a = c; c = tmp; }
        if (b > c) { tmp = b; b = c; c = tmp; }
        
        
        // 步骤4：严格按格式输出（单个空格分隔，行尾换行，无多余空格/空行）
        printf("%c %c %c\n", a, b, c);
        
        
        // 步骤5：清理当前行剩余字符（避免残留字符干扰下一次读取）
        while ((ch = getchar()) != EOF && ch != '\n');
        
    }
    return 0;
}
