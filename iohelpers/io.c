#include <stdio.h>

// Extra defines as helpers
#define vi vector<int>
#define forv(i, n) for (int i=0; i<n; i++)

#define nl "\n"
#define tab "\t"
#define sp " "

int main() {

    // Integer 
    int a;
    scanf("%d", &a);
    printf("Integer: %d\n", a);

    // Float
    float f;
    scanf("%f", &f);
    printf("Float: %lf\n", f);

    // Char
    char c;
    scanf(" %c", &c);
    printf("Char: %c\n", c);

    // String
    char str[100];
    scanf("%s", str);
    printf("String: %s\n", str);

    // Print a string
    printf("Hello World!\n");

    // Using defined for loop
    int i;
    forv(i, 5) {
        printf("%d ", i);
     }
     printf("\n");
}
