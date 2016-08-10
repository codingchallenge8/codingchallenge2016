#include <iostream>
#include <string>
#include <vector> 

using namespace std;

int main() {
    
    // String
    string input;
    getline(cin, input);
    cout << "String input: " << input << "\n";

    // Integer
    int i;
    cin >> i;
    cout << "Integer: " << i << "\n";

    // Float 
    float f;
    cin >> f;
    cout << "Float: " << f << "\n";

    // Char
    char c;
    cin >> c;
    cout << "Char: " << c << "\n";

    // Auto for loop for vector
    vector<int> v = {0, 1, 2, 3, 4, 5};
    for (auto i : v) { cout << i << " "; }
    cout << "\n";
}
