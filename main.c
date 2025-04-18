#include<stdio.h>
int main()
{
    char s[100][100];
    for(int i = 0 ;i < 5 ; i++ )
        scanf("%s",&s[i]);
    for(int i = 0 ;i < 5 ; i++ )
        printf("%s\n",s[i]);
    return 0;
}