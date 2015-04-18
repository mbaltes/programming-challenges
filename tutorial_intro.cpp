#include <vector>
#include <iostream>
using namespace std;

int main() 
{
    int value, length;
    vector<int> v;
    cin >> value;
    cin >> length;
    
    for (int i = 0; i < length; i++) {
        int temp;
        cin >> temp;
        v.push_back(temp);
    }
    
    for (int i = 0; i < length; i++) {
        if (v[i] == value) {
            cout << i << "\n";
        }
    }
    
    return 0;
}
