#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fptr1, *fptr2;
    char filename[100], c;

    printf("Adja meg az olvasando fajl nevet! \n");
    scanf("%s", filename);

    fptr1 = fopen(filename, "r");
    if (fptr1 == NULL)
    {
        printf("Nem sikerult megnyitni a fajlt. %s \n", filename);
        exit(0);
    }

    printf("Adja meg az irando fajl nevet! \n");
    scanf("%s", filename);

    fptr2 = fopen(filename, "w");
    if (fptr2 == NULL)
    {
        printf("Nem sikerult megnyitni a fajlt. %s \n", filename);
        exit(0);
    }

    c = fgetc(fptr1);
    while (c != EOF)
    {
        fputc(c, fptr2);
        c = fgetc(fptr1);
    }

    printf("\n Adatok atmasolva %s", filename);

    fclose(fptr1);
    fclose(fptr2);
    return 0;
}

