#include <iostream>
#include <string>
#include <conio.h>

using namespace std;

int main() {
    string Organization , Abbreviation;
    bool Exit = false;
    char prev = ' ';
    cout << "Enter the name of Organization: ";
    getline(cin, Organization);
    while(!Exit) {
        cout << "1.Find Length" << endl;
        cout << "2.Find Abbreviation" << endl;
        cout << "3.Print Abbreviation" << endl;
        cout << "4.Exit" << endl;
        cout << "Enter your choice : ";
        switch (_getch()) {
            case '1':
                cout << "Total characters in string are : " << Organization.length();
                break;
            case '2':
                for(int i = 0 ; i < Organization.length() ; i++){
                    if(prev == ' ') Abbreviation += toupper(Organization[i]);
                    prev = Organization[i];
                }
                cout << "To check abbreviation of " << Organization << " please select option 3." << endl;
                break;
            case '3':
                if(Organization.empty())
                    cout << "Please find abbreviation first." << endl;
                else
                    cout << "The abbreviation of " << Organization << " is " << Abbreviation;
                break;
            case '4':
                Exit = true;
                break;
        }
    }
}