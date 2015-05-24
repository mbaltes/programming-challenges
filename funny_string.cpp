/**
    Problem: https://www.hackerrank.com/challenges/funny-string
    Status: Working
    Todo:
*/

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>

int main()
{
    std::vector<std::string> strings;
    std::vector<std::string> r;
    int n;
    std::cin >> n;

    for (int i = 0; i < n; i++) {
        std::string temp;
        std::cin >> temp;

        strings.push_back(temp);
        std::reverse(temp.begin(), temp.end());
        r.push_back(temp);
    }

    for (int i = 0; i < n; i++) {
        bool answer = true;
        for (int k = 1; k < strings[i].length(); k++) {
            std::string s_temp = strings[i];
            std::string r_temp = r[i];
            if (abs(s_temp[k] - s_temp[k - 1]) != abs(r_temp[k] - r_temp[k - 1])) {
                answer = false;
                std::cout << "Not Funny\n";
                break;
            }
        }
        if (answer) {
            std::cout << "Funny\n";
        }
    }
}