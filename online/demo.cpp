

#include<bits/stdc++.h>
using namespace std;
#define int long long

void badhri(){

string s="nello abcb";

//count frequency of each character
//use hashmap / set / dictionary   


//only using array 

// cout<<"s[0] = "<<s[0]<<"\n";

// cout<<"s[0] as int is "<<(int)s[0]<<"\n";


int freq[26]={0};


//0 1 2 ... 25

for(int i=0;i<s.size();i++)
{
    freq[s[i]-'a']++;
}

for(int i=0;i<26;i++)
{
    cout<<(char)(i+'a')<<" "<<freq[i]<<"\n";
}

}

signed main(){

        badhri();
}



//java code

import java.util.*;

public class Main {
    public static void main(String[] args) {
        badhri();
    }

    static void badhri() {
        String s = "nello abcb";

        // Count frequency of each character using array
        int[] freq = new int[26]; // Array to store frequencies of 'a' to 'z'

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // Process only lowercase alphabets
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " " + freq[i]);
            }
        }
    }
}




//python code

def badhri():
    s = "nello abcb"

    # Count frequency of each character using an array
    freq = [0] * 26  # Array to store frequencies of 'a' to 'z'

    for ch in s:
        if 'a' <= ch <= 'z':  # Process only lowercase alphabets
            freq[ord(ch) - ord('a')] += 1

    for i in range(26):
        if freq[i] > 0:
            print(f"{chr(i + ord('a'))} {freq[i]}")

badhri()


