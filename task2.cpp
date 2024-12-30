#include <iostream>
using namespace std;

int main() {
    char op;
    double a,b;

    cout << "Enter an operator (+, -, *, /): ";
    cin >> op;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    switch (op) {
        case '+':
            cout <<"The sum is: "<<a+b<< endl;
            break;
        case '-':
            cout <<"The Diff is: "<<a-b << endl;
            break;
        case '*':
            cout <<"The multi is: "<< a*b << endl;
            break;
        case '/':
            if (b!= 0)
                cout <<"The Divi is: "<< a/b << endl;
            else
                cout << "Division by zero is not allowed." << endl;
            break;
        default:
            cout << "Invalid operator." << endl;
            break;
    }

    return 0;
}
