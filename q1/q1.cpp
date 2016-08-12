#include <iomanip>
#include <iostream>
#include <map>
#include <string>

using namespace std;

const map<string, unsigned int> thous {
    {"thou",           1}, {"th",          1},
    {"inch",        1000}, {"in",       1000},
    {"foot",       12000}, {"ft",      12000},
    {"yard",       36000}, {"yd",      36000},
    {"chain",     792000}, {"ch",     792000},
    {"furlong",  7920000}, {"fur",   7920000},
    {"mile",    63360000}, {"mi",   63360000},
    {"league", 190080000}, {"lea", 190080000}
};


int main()
{

    cout << fixed << setprecision(12);

    double u;

    string f;
    string t;
    string in;

    cin >> u >> f >> in >> t;

    cout << u * thous.at(f) / thous.at(t) << '\n';

    return 0;
}
