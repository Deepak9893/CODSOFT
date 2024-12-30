#include <iostream>
using namespace std;
void Game() {
    int myNumber = rand() % 100 + 1;
    int userNumber=0;
    do
    {

    cout << "Guess the number between 1 and 100: ";
    cin >> userNumber;

    if (userNumber == myNumber) {
        cout << "Correct" << endl;
        break;
    } else if (userNumber < myNumber) {
        cout << "Too low" << endl;
    } else {
        cout << "Too high" << endl;
    }
}
while(userNumber>=0);
cout<<"The Correct number is: "<<myNumber<<endl;
}

int main() {
    Game();
    return 0;
}
