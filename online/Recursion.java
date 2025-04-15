class Recursion{
    //memoization 
    

    public static int factorial(int n)
    {
        //base case 
        //boundary case 
        if(n==0){
            return 1;
        }

        if(value is already stored/known values)
        {
            return value;
        }

        int cur_value=n * factorial(n-1);
        //store the value
        return cur_value;
    }
    public static int fibanocci(int n)
    {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibanocci(n-1) + fibanocci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(10));


        //fibanosci 
        System.out.println("Fibanocci of 6 is: " + fibanocci(6));
    }

}


//some code 
//function calling it self
//recursion can be appplied in many concepts , to solve the questions effectivvely,easily


// fact(5)=5*fact(4)
// fact(4)=4*fat(3)

// function call 
// function definition 
// function declaration 




// factorial(-2)=
// factorial(-1)=
// factorial(0)=
// 0*factorial(-1)=1 
// 0* any number = 0 



// factorial(1)=1
// factorial(2)=2*1=2 
// factorial(3)=3*2 = 6 
// 3*fact(2)=
// factorial(4)=4*6=24
// factorial(5)=5*24=120


// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
// 0 1 2 3 4 5 6 7 8 9 10 


// fibo(n)=fibo(n-1)+fibo(n-2)



//elements added to the stack , while caculting fibanosci(100)
stack:
100 , 99 , 98 , 98 , 97 , 97 , 96 , 97 , 96 , 96 , 95 , 



//
given an array of numbers print all array elements , without using looping statements, 



public static void recursion(int[] arr,int i) {
    if(i>=arr.length) {
        return;
    }
    System.out.print(arr[i]);
    recursion(arr,i+1);
} 

recursion(0) 
0 , 1 , 2 , 3 , 4 

public static void recursion(int[] arr,int i) {
    if(i<0) {
        return;
    }
    recursion(arr,i-1);    
    System.out.print(arr[i]);
}

// 4 - 
// 3 - 
// 2 - 
// 1 - 
// 0 - 

0 , 1 , 2 , 3 , 4

// 4 , 3 , 2 , 1 , 0 , 


2^6 
2=10
6=110 
1

p=4*4=16
ans=1*4 = 4 , 64



//sum of elements in array , using recursion

//iterative code
int sum=0;
for(int i:arr)sum+=i; 
SOP(sum);


//sum of first n elements 
n=5 
5+4+3+2+1 

===>n=6
6+5+4+3+2+1
6+sum(5)
sum(5)=5+4+3+2+1    
5+sum(4) 
sum(4)=4+3+2+1
4+sum(3)
sum(3)=3+2+1
3+sum(2)
2+sum(1)
1+sum(0) 
0+sum(-1)
-1+sum(-2)...


when dealing with natural numbers , 
we should ignore 0,-1,...

//sum of first n numbers , using recursion 
int sum(int n)
{
    //base case / boundary case
    if(n==1)return 1;
    if(n==0)return 0;

    return n+sum(n-1);
}


SOP("sum of first n numbers is",+sum(n));



//removed the return value

def recur(n):
  global Sum  
  if n == 0:
    return
  else:
    recur(n - 1)
    Sum += arr[n - 1]

arr = [1, 2, 3]
n = len(arr)
Sum = 0
recur(n)
print("Sum:", Sum)




print array without using loop 
print array in reverse order without using loop
print your name , without using loops

sum of array elements 
product of array elements

all such questions of 1D array , using recursion 
you will be able to solve


//given a 1D array , reverse the array using recursion 
no inbuilt functions 

//given a 1D array , sort the array using recursion 
no inbuilt functions 



arr[]
1 2 4 5 
0 1 2 3 
i     j 

5 2 4 1 
  i j 

5 4 2 1 
  j i 



rev: 
5 4 2 1 
0 1 2 3 


public static void reverse(int[] arr,int i) {
        if(i>=n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }


    i , n-i-1 
reverse(i+1);



//sorting array using recursion 

//recursive Algorithm to sort an array 
1.ignore the starting element , 
and call sort() function recursively for rest of the array 

2. after getting the sorted part of the rest of array , 
then insert the starting element at its correct position 

//code

sort(arr,0,n);

//recursive sort function 
public static void sort(ArrayList<Integer>,int i , int n) {

    //base case / boundary case 

    int cur_element=arr[i];

    //another function call 
    sort(arr,i+1,n);

    //inserting the element at its correct position 
    //do this iteratively 

    //recursively , using another function
}










ideas===> code (a bit difficult)

idea ===> simple steps and write it in english words
words ===> algorithm 
algorithm ===> code 









Given a stack of integers , 
reverse the stack using recursion. 

(Note: directly putting them in another stack is not alowed)




//Subset Sum Problem 

arr=[1,2,8]
1,2,8      

1
2
8
1,2
2,8
1,8
1,2,8 
[]





iterative:

we will use for loop , while loop , do while loop 

or any such logic

===> a function will be called , only once

recursive approach:

same function will be called , again and again , 
until the base case is reached








