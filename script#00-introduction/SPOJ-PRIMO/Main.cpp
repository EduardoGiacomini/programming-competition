// URL: https://br.spoj.com/problems/PRIMO/

#include <iostream>

using namespace std;

int main()
{
    
    int number, dividers = 0;

    cin >> number;

    if (number == 1 || number == 0) {
        cout << "nao\n";
    } else {
        for (int i = 1; i <= number; i++)
        if (number % i == 0)
            dividers += 1;

        if (dividers > 2)
            cout << "nao\n";
        else
            cout << "sim\n";
    }

    return 0;
}
