/* 
    Problem: https://www.hackerrank.com/challenges/identify-smith-numbers
    Status: Working.
    Todo: Refine.

*/

#include <iostream>
#include <string>
#include <list>
using namespace std;

void smith_numbers(int n, const list<int> & factors) 
{
    char temp_char;
    string temp_string, digit;
    int factors_sum = 0;
    int digits_sum = 0;

    for (auto& x : factors) {
        digit = to_string(x);
        if (digit.length() > 1) {
            for (int i = 0; i < digit.length(); i++) {
                temp_char = digit.at(i);
                temp_string = string(1, temp_char);
                factors_sum += stoi(temp_string);
            }
        } else {
            factors_sum += x;
        }
    }

    string value_string = to_string(n);
    for (int i = 0; i < value_string.length(); i++) {
        temp_char = value_string.at(i);
        temp_string = string(1, temp_char);
        digits_sum += stoi(temp_string);
    }

    if (factors_sum == digits_sum) {
        cout << 1 << "\n";
    } else {
        cout << 0 << "\n";
    }
}

list<int> prime_factors(int n) {
    list<int> factors;
    int z = 2;
    while (z * z <= n) {
        if (n % z == 0) {
            factors.push_back(z);
            n /= z;
        } else {
            z++;
        }
    }
    if (n > 1) {
        factors.push_back(n);
    }

    return factors;
}


int main() {
    int number;
    cin >> number;

    list<int> prime_list = prime_factors(number);
    smith_numbers(number, prime_list);
    
    return 0;
}