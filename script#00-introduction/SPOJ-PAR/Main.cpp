// URL: https://br.spoj.com/problems/PAR/

#include <iostream>

using namespace std;

int main()
{
    
    int number_test, rounds, points_a, points_b, sum_points; // points_a: primeiro jogador, points_b: segundo jogador
    string name_a, name_b; // name_a: primeiro jogador, name_b: segundo_jogador

    cin >> rounds;
    
    number_test = 1;
    while (rounds > 0) {
        cin >> name_a >> name_b;

        cout << "Teste " << number_test << "\n";

        for (int i = 0; i < rounds; i++) {
            points_a = 0;
            points_b = 0;
            
            cin >> points_a >> points_b;

            sum_points = points_a + points_b;

            if (sum_points % 2 == 0)
                cout << name_a << "\n";
            else
                cout << name_b << "\n";
        }

        number_test++;
        cin >> rounds;
    }

    return 0;
}
