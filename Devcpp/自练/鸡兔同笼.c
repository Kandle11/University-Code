#include <stdio.h>

int main() {
	int head, foot;
	int chicken, rabbit;

	printf("请输入头的数量：");
	scanf("%d", &head);
	printf("请输入脚的数量：");
	scanf("%d", &foot);

	rabbit = (foot - 2 * head) / 2;
	chicken = head - rabbit;

	printf("鸡的数量：%d\n", chicken);
	printf("兔的数量：%d\n", rabbit);

	return 0;
}

