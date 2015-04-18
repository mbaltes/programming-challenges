/* 
    Problem: https://www.hackerrank.com/challenges/identify-smith-numbers
    Status: Working.
    Todo: 

*/

#include <iostream>
#include <string>
#include <vector>
using namespace std;

void smith_numbers(int n, const vector<int> & factors) 
{
    int factors_sum{0}, digits_sum{0};

    for (auto& x : factors) {
        string digit = to_string(x);
        if (digit.length() > 1) {
            for (int i = 0; i < digit.length(); i++) {
                char temp_char = digit.at(i);
                string temp_string = string(1, temp_char);
                factors_sum += stoi(temp_string);
            }
        } else {
            factors_sum += x;
        }
    }

    string value_string = to_string(n);
    for (int i = 0; i < value_string.length(); i++) {
        char temp_char = value_string.at(i);
        string temp_string = string(1, temp_char);
        digits_sum += stoi(temp_string);
    }

    if (factors_sum == digits_sum) {
        cout << 1 << "\n";
    } else {
        cout << 0 << "\n";
    }
}

vector<int> prime_factors(int n) 
{
    vector<int> factors;
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

bool is_prime(int n)
{
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}


int main() 
{
    int number;
    cin >> number;

    if (is_prime(number)) {
        cout << 0 << "\n";
    } else {
        vector<int> prime_list = prime_factors(number);
        smith_numbers(number, prime_list);
    }

    return 0;
}