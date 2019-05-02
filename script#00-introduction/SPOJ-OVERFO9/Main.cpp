#include <iostream>

using namespace std;

int main()
{
    	int max_value, value_a, value_b;
	string operation;

	cin >> max_value >> operation >> value_a >> value_b;

	if (operation.compare("+") == 0)
		if (max_value >= (value_a + value_b))
			cout << (value_a + value_b) << "\n";
		else
			cout << "OVERFLOW\n";
	else
		if (max_value >= (value_a * value_b))
			cout << (value_a * value_b) << "\n";
		else
			cout << "OVERFLOW\n";

	return 0;
}
