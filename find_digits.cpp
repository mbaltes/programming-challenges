/* 
    Problem: https://www.hackerrank.com/challenges/find-digits
    Status: Working.
    Todo: Refine.

*/

#include <cmath> // for pow()
#include <vector>
#include <iostream>
#include <stdexcept> // for invalid_argument()
using namespace std;

int main() 
{
    int number_of_cases{0}, counter{0}, zero_count{0};
    string temp;
    char temp_char;
    vector<string> case_vector;

    /* Get inputs, and store in vector. */
    cin >> number_of_cases;
    try {
        if (number_of_cases < 1 or number_of_cases > 15) {
            throw invalid_argument("Error: Invalid input.");
        } else {
            for (int i = 0; i < number_of_cases; i++) {
                cin >> temp;
                try {
                    if (stoi(temp) < 0 or stoi(temp) > pow(10, 10)) {
                        throw invalid_argument("Error: Invalid number.");
                    } else {
                        case_vector.push_back(temp);
                    }
                } catch (const invalid_argument& e) {
                    cout << e.what() << "\n";
                }
            }
        }
    } catch (const invalid_argument& e) {
        cout << e.what() << "\n";
    }

    /* Calculations. */
    for (auto& x : case_vector) {
        for (int i = 0; i < x.length(); i++) {
            temp_char = x.at(i);
            temp = string(1, temp_char);
            if (stoi(temp) != 0 and stoi(x) % stoi(temp) == 0) {
                counter++;
            }
        }

        cout << counter << "\n";
        counter = 0;
    }
    return 0;
}