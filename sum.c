#include <stdio.h>

int main(int argc, char const *argv[])
{
    int index = 13, sum  = 0, k = 0;

    while (k < index)
    {
        k += 1;
        sum += k;
    }

    printf("%d\n", sum);
    
    return 0;
}
