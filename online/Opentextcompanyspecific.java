import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Opentextcompanyspecific{
    public static void main(String[] args) {
        System.out.println("Open Text!");
    }
}


Online Aseessment Round:
1. 2 coding questions

60 minutes of time - for 2 coding questions 

1 easy to medium level 

1 medium level 

1.5 problems ===> mostly you might get shortlisted 

1. 10 testscases 
10/10 testcases passed 

2. 10 testcases 
5/10 testcases passed

1.5 questions 


//most problems are easy medium level 


reverse a string  , 
Q 1.1)
given a string s of size n , 
reverse the string the return the new string.

Q 1.2)
//do it in place , return type is void 
reverse the string in place 



abc 

//string manipulations 
//and make the string as cba 


String reverseString(String s){
    //logic to reverse a string and return the new string 


    return newReversedString;
}

//prohibited keys 
// for , while , do while
// ::

"abc"
//into a list 
'a' , 'b' , 'c'  

"cba"


//main function
{
    String s="abc";
    System.out.println(reverseString(s));
}



in online assesment 
//it should work for all testcases 
//it should work for all edge cases example, null , single character 

solution should be submitted in very less time===> 
you will be ranked higher 


//it should be optimal , 
time taken to get to the solution also matters 

//penalty rules for wrong answers , TLE , MLE , RTE

1st submitter is at 5 minutes 
(5 minutes)
2nd submitter is at 10 minutes 
(10 minutes)


1 hour time 

55 minutes ==> you submitted 1st question again 
then it considers you submitted 1st question after 55 minutes
time taken 55 minutes 

//your friend 
did it in 30 minutes 


//most optimal solution 
//most optimal solution in terms of time complexity
//most optimal solution in terms of space complexity

//inbuilt functions take more time to execute

so time required may be more 
hidden testcases , will be run internally 



//in worst case 
when 300-400 students submitted 2/2 question
verify the solutions submitted 

//check for optimal codes 
10 sulutions 

6 out of them used :: , reverse() , 


reverse(s.begin() , s.end()) //inbuilt function


4 students used 
2 pointer technique 



1s 


5s 


//fibanosci series
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
0 1 2 3 4 5 6  7 8  9  10



def fib(i)
If i<1
Return i
Else return fib(i-1)+fib(i-2)


int fibo(int n){
    if(n<1){
        return n;
    }
    return fibo(n-1)+fibo(n-2);
}
most of you will write this code 



0 1 1 2 3 5 8 ... 
        a b c

        1 for loop of 0 to n-2 
        O(n) 

        3 variables a,b,c 




1.Question
Given a number n , find the next smallest number whose sum of digits is same as n. 

26

2+6=8 
27
28
29...
 
35=3+5=8 
 
answer=35



number 12 

sum of digits of n 
1+2 = 3 

next smallest number whose sum of digits is 3
12=1+2=3------>3
13=1+3=4
14=1+4=5
15=1+5=6
16=1+6=7
17=1+7=8
18=1+8=9
19=1+9=10
20=2+0=2    
21=2+1=3----->


print all such 2 digit numbers , whose sum is equal to the sum of digits of the number itself

08
17
26 2+6=8 
35 3+5=8
44 4+4=8
53 5+3=8
62 6+2=8
71 7+1=8
80 8+0=8


123=6 
132=6
213=6
231=6
312
321 
222
033


//check for all numbers , till you get the answer 

12 

sumofdigits(12)=3 

13 , 
14
15
16
17
18
19
20
21




// n=20 
// 20 
// 3
// ?

// 91

92 9+2=11 = 1+1 = 2 

we dont do it multiple times like this


int sumOfDigits(int n)
{
    int sum=0;
    while(n>0){
        sum+=(n%10);
        n=n/10; //n>>=1;
    }
    return sum;
}
//check for all numbers
main{
    int n=20;
    int sum=sumOfDigits(n);
    int new_number=n+1;
    while(sumOfDigits(new_number)!=sum){
        new_number++;
    }
    return new_number
}


n value max , <10^8



Sum function:
While true N+=1
 If sum==target sum
 Return n









 //Question 4 
Q4) QuestionOpenText: Count set bits in /**
 * @return
 */
an integer (A*B), given two numbers A and B.
if A=2 , B = 3 , then output is ____

decimal system , binary system 
2 - 10 
3 - 11 

6 - 110



//give a number n , find the set bits in n
n= 15 
15=1111

n=21
21=10101
21/2=10

n=20 
20=10100


(21%2==0)?0:1

a,b
calculate product=a*b 
convert product to binary 
count no.of 1s in product

main{
    int a=5;
    int b=3;
    int product=a*b;
    
    }


    a=5 
    b=3 
    a*b = 5*3 = 15 


& , | , ^ , ~ , << , >> , >>>

110 
101  & 
_______ 
100

110 
101 | 
_______ 
111
//n=12 


n=12 
12=1100

1100| value=12 
0110| value=6
0011| value=3   
0001| value=1
0000|  

while(n>0){
    if(n&1==1){//check 0th bit is set or not
        count++;
    }
    n=n>>1; //right shift
}

int bc=Integer.bitCount(n);

n&(1<<i)



right shift on it
left shift on it

right shift , value is divided by 2 
left shift , value is multiplied by 2




//inbuilt function for builtin function:
//Integer.bitCount(n)

//cpp
//__builtin_popcount(n)

//python
//bin(n).count('1')





//give string s , some questions related to string manipulation

//count anagrams ===> words with same frequency of characters 
//count palindromes
//count vowels
//count consonants
//count words
//count characters
//count digits
//count special characters


//largest window with all vowels 

s="abcdexcaeilfoioia"

window size = 1


//largest window with all consonants


largest window with 
at most K consonants allowed 

we can use as many as vowels , we want 

//logic / algorithm 
//keep adding characters to the window
//maintain the count of consonants in the window
//if count of consonants in the window > K: 
        //remove some characters from window , untill the consonants count<=k 
        //update the max window size


keep track of max size of window out of all cases 


int maxLengthWindowWithAtMostKConsonants(String s,int k){
    int n=s.length();
    int left=0;
    int right=0;
    int maxWindowSize=0;
    int consonants_count=0;
    while(right<n){
       if(isConsonant(s.charAt(right))){
           consonants_count++;
       }
       //incase consonant count > k , 
       //keep removing characters until consonant count<=k
       while(consonants_count>k){
           if(isConsonant(s.charAt(left))){
               consonants_count--;
           }
           left++;
       }
       int curWindowSize=right-left+1;
       maxWindowSize=Math.max(maxWindowSize , curWindowSize);
         right++;
    }
    return maxWindowSize;
}


//common coding template for all sliding window questions

//set or map defined 
//2 pointers / variables left and right defined 

while(condition is true)
{
    //keep checking the condition

    //if it is invali , then prune fromthe other end
    //cut down frm other end , untill the condition is valid 


    //get current window size

    //update the max window size
}

//first repeating character 
//first non repeating character

String 
Set , Map ,
2 pointer , Sliding window 
String manipulation 



a=2
b=3

s=set()
defaultdict()


//c++ , java 

set<int>s;
s.insert()
s.size()
s.remove()
s.begin()
s.end()


java:
Set<Integer>s=new HashSet<>()
s.add()
s.remove()


//map 

//map in c++
key - value pairs
map<datatype , datatype>

map<int,int>mp;
mp[key]++;
mp[key]=value;

mp[key] 

mp[key]--;

map<string , int>mp;
map<char , string>mp;

mp[key]=value;

//java
HashMap<Character , Integer>mp=new HashMap<>();
mp.put(null, null)
mp.get(null)
mp.remove(null)
mp.containsKey(mp)




3 -3 
5 -5 
// +0 -0 



if found any answer 
return answer 

else 
return -1




//we need both 
//+ve , -ve 

if num is +ve: 
    if it is first occurence:
        set the value as 1 
    if already -ve is there:
        set the value as 2 
        update the max 


else if num is -ve:
    if it is first occurence:
        set the value as -1 
    if already +ve is there:
        set the value as 2 
        update the max








