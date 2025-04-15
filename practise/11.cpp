#include <iostream>
#include <vector>
#include <algorithm>
#include <bits/stdc++.h>

using namespace std;

// Function to find the minimum possible maximum working time
int minimumTimeRequired(int k, vector<int> files) {
    // Step 2: Sort files in descending order
    sort(files.begin(), files.end(), greater<int>());

    // Step 3: Initialize machine loads
    vector<int> machineLoads(k, 0);

    // Step 4: Assign files to machines
    for (int time : files) {
        // Find the machine with the minimum load
        int minLoadMachine = 0;
        for (int i = 1; i < k; i++) {
            if (machineLoads[i] < machineLoads[minLoadMachine]) {
                minLoadMachine = i;
            }
        }
        // Assign the file to this machine
        machineLoads[minLoadMachine] += time;
    }

    // Step 5: Find the maximum value in the machine loads
    int maxLoad = *max_element(machineLoads.begin(), machineLoads.end());

    return maxLoad;
}

int main() {
    int k; // Number of printers
    cin >> k;
    int n; // Number of files
    cin >> n;
    vector<int> files(n);
    for (int i = 0; i < n; i++) {
        cin >> files[i];
    }

    cout << minimumTimeRequired(k, files) << endl;
    return 0;
}
