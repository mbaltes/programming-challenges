/* 
    Problem: https://www.hackerrank.com/challenges/find-digits
    Status: Working.
    Todo: Refine. Try the modulus approach.

*/

#include <cmath>
//#include <cstdio>
#include <vector>
#include <iostream>
#include <assert.h>
//#include <algorithm>
using namespace std;

int main() 
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 

    int number_of_cases{0}, counter{0}, zero_count{0};
    string temp;
    char temp_char;
    vector<string> case_vector;

    /* Get inputs, and store in vector. */
    cin >> number_of_cases;
    assert(number_of_cases > 0 and number_of_cases < 16);
    for (int i = 0; i < number_of_cases; i++) {
        cin >> temp;
        assert(stoi(temp) >= 0 and stoi(temp) < pow(10, 10));
        case_vector.push_back(temp);
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