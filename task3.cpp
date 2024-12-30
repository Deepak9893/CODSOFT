#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    vector<string> tasks;
    int choice;
    string task;
    int taskNumber;

    while (true) {
        cout << "\n1. Add Task" << endl;
        cout << "2. Remove Task" << endl;
        cout << "3. Display Tasks" << endl;
        cout << "4. Exit" << endl;
        cout << "Choose an option: ";
        cin >> choice;

        if (choice == 4) {
            cout << "Exit" << endl;
            break;
        }

        switch (choice) {
            case 1:
                cout << "Enter the task: ";
                cin.ignore();
                getline(cin, task);
                tasks.push_back(task);
                cout << "Task added!" << endl;
                break;
            case 2:
                cout << "Enter the task number to remove: ";
                cin >> taskNumber;
                if (taskNumber > 0 && taskNumber <= tasks.size()) {
                    tasks.erase(tasks.begin() + taskNumber - 1);
                    cout << "Task removed" << endl;
                } else {
                    cout << "Invalid number" << endl;
                }
                break;
            case 3:
                if (tasks.empty()) {
                    cout << "to-do list is empty" << endl;
                } else {
                    cout << "to-do list:" << endl;
                    for (size_t i = 0; i < tasks.size(); ++i) {
                        cout << i + 1 << ". " << tasks[i] << endl;
                    }
                }
                break;
            default:
                cout << "Invalid option" << endl;
        }
    }

    return 0;
}
