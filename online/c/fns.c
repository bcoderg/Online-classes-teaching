#include <stdio.h>
int mystrlen(char *str) {
    int counter = 0;
    while(*str++)
        counter++;
    return counter;
} 

int main()
{
    char str[] = "hello";
    int len = mystrlen(str);
    printf("Length of string is: %d\n", len);
    return 0;
}