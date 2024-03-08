#include <stdio.h>
#include <string.h>

void swap(char *ch1, char *ch2);

int main(int argc, char const *argv[])
{

    char arr[] = {"WOULD YOU LIKE SOME COFFEE?"};

     printf("%s\n", arr);

    short arr_length = strlen(arr);
    
    for (int i = 0; i < arr_length / 2; i++)
    {
        swap(&arr[i], &arr[arr_length - i - 1]);
    }

    printf("%s\n", arr);

    return 0;
}

void swap(char *ch1, char *ch2) {
    char temp = *ch1;
    *ch1 = *ch2;
    *ch2 = temp;
}
