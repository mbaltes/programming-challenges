/* 
    Problem: https://www.hackerrank.com/challenges/find-digits
    Status: not working
    Todo: fix while loop.
    Notes: I like my solution better, but learning this modulus trick was useful.

*/

#include <cmath>
//#include <cstdio>
#include <string>
#include <vector>
#include <iostream>
#include <assert.h>
//#include <algorithm>
using namespace std;

int main() 
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 

    int number_of_cases, entry, temp, counter, size, tens{10};
    string length;

    cin >> number_of_cases;
    while (number_of_cases > 0) {
        cin >> entry;
        length = to_string(entry);
        size = length.length();
        for (int i = 0; i < size; i++) {
            temp = entry % 10;
            if (temp != 0 and entry % temp == 0) {
                counter++;
            }
            entry /= tens;
            tens *= 10;
        }
        cout << counter << "\n";
        counter = 0;

        number_of_cases--;
    }

    return 0;
}