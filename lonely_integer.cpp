#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int lonelyinteger(vector <int> a) {
    sort(a.begin(), a.end());

    vector<int>::iterator first = a.begin();
    vector<int>::iterator next = a.begin() + 1;
    
    for (; first != a.end(); ) { 
        if (next == a.end()) {
            return *first;
        } else if(*first != *next) {
            return *first;
        } else {
            first += 2;
            next = first + 1;
        }
    }
    return 0;
}

int main() 
{
    int res;
    
    int _a_size;
    cin >> _a_size;
    cin.ignore (std::numeric_limits<std::streamsize>::max(), '\n'); 
    vector<int> _a;
    int _a_item;
    for(int _a_i=0; _a_i<_a_size; _a_i++) {
        cin >> _a_item;
        _a.push_back(_a_item);
    }
    
    res = lonelyinteger(_a);
    cout << res;
    
    return 0;
}
