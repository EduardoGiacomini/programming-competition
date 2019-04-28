// URL: https://br.spoj.com/problems/BAFO/

#include <iostream>

using namespace std;

int main()
{
    
    int number_test, rounds, points_a, read_a, points_b, read_b; // points_a: Aldo, points_b: beto

    scanf("%d", &rounds);
    
    number_test = 1;
    while (rounds > 0) {
        points_a = 0;
        points_b = 0;
        
        for (int i = 0; i < rounds; i++) {
            scanf("%d", &read_a);
            scanf("%d", &read_b);
        	points_a += read_a;
        	points_b += read_b;
        }

        printf("Teste %d\n", number_test);

        if (points_b > points_a) // Beto e o vencedor
        	printf("Beto\n\n");
        else // Aldo e o vencedor
        	printf("Aldo\n\n");

        number_test++;
        scanf("%d", &rounds);
    }

    return 0;
}
