#include <stdio.h>

int main()
{
	int c = 0x67;
	printf("%d\n", c | 0xFF + 3);
}