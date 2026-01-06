#include <stdio.h>
#include <fcntl.h>

int main()
{
    int fd = 0;

    fd = creat("PPA.text", 0777);

    if (fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File sucessfully created \n");
    }
    return 0;
}