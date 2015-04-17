/* 
    Problem: https://www.hackerrank.com/challenges/flipping-bits
    Status: Working.
    Todo: 

*/

#include <vector>
#include <iostream>
using namespace std;

int main() 
{
    int count; 
    unsigned num;
    vector<unsigned> v;

    cin >> count;

    for (int i = 0; i < count; i++) {
        cin >> num;
        v.push_back(num);
    }

    for (auto& x : v) {
        cout << ~x << "\n";
    }

    return 0;
}
