// stack with 2 queues 

// Queue with stacks ???

//implemented such questions 


//Question 1: Implement a stack using two queues
//Question 2: Implement a queue using two stacks

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Stacks{
    public static void main(String[] args) {
            Stack<Integer> stack1 = new Stack<>();
    }
}


// CtrlZ - undo 
// Ctrly - redo 

// abc 



// postfix expression 

// infix expression 


(
for)   () ()  //some code (

(([{} (){()}]))  //valid




//input has only ( , )

(( ())())  yes
()()) no 
(())) no 
(()()) yes 
()()() yes


open=0 
close=0 


rules:
length of string should be even 
open == close 
for every open bracket there is a close bracket 

before using any closing bracket ,
there needs to be an existing open bracket

(())



)(   - valid 
()() - valid 
(()) - valid 


)(
.  
close=1 
open=0 


((())))

//followup question 
//input has ( , ) , { , } , [ , ]

example:
([{}])
circular_open=0
circular_close=0
square_open=0
square_close=0
curly_open=0
curly_close=0


([{}])  //valid

({[}])  // valid or invalid





()
open=1
close=1 
they are not even , but still valid



//think if we should add , anything else ? 

boolean isValid(String input){
    int open=0;
    int close=0;
    for(char c: input){
        //some code
        if(c=='('){
            open++;
        }
        //some code
        else{
            close++;
            
            if (open<close && c=')'){
            return false;
            }

        }

        //some code
    }
    return open==close;
}


( ( ) ( ( ) ) )
0 1 2 3 4 5 6 7




45 mins - 1 hr 
it involved 2 questions 

1 hr - 5 mins intro , 5 mins ending / discussion 
5 mins project / general question 

45 minutes 
2 questions: 
read , understand , clarify inputs , outputs 
verify custom testcases 
come up with appraoch , code the approach 

//optimised approach , if possible 

discuss , your logic and intition part


int n=arr.length;
List<Integer>l=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
    l.add(-1);
}

Stack<Integer>stk=new Stack<Integer>();
for(int i:arr)
{
    while(!stk.isEmpty() && arr[i]>arr[stk.top()])
    {
        l.set(stk.top(),arr[i]);
        stk.pop();
    }
    stk.push(i);
    return l;
}


arr:
1 3 2 4 
3 4 4 -1 


3 2 5 1 6 2
5 5 6 6 -1 -1 
5 5 6 6 -1 -1====>  

5 1 


for a group of elements , 
we can have a same answer

so , why not store these group of elements, 
and assign answer for all of them at once 




2 5 1 6  2  -1


// arr 
// arr[0] ,
// int n=arr.length 
// arr[n-1]

int[] nextGreaterElement(int[] arr){
    int n=arr.length;
    int[] ans=new int[n];
    for(int i=0;i<n;i++)
    {
        ans[i]=-1;
    }

    for(int i=0;i<n;i++)
    {
        int curValue=arr[i];
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]>curValue)
            {
                ans[i]=arr[j];
                break;
            }
        }
    }

    return ans;
}

    int temp[]=new int[n];
    for(i 0:n)
    {
        if cur_value> stored_values: 
            for stored_values:
                cur_value is answer 
         
    }

    values will be changing 



    // Stack<Integer>stk=new Stack<Integer>();
    // for(int i=0;i<n;i++)
    // {
    //     while(!stk.isEmpty() && arr[i]>arr[stk.top()])
    //     {
    //         l[stk.top()]=arr[i];
    //         stk.pop();
    //     }
    //     stk.push(i);
    // }
    // return l;
}



PRACTISE 

PRACTISE 

PRACTISE

PRACTISE    

PRACTISE

100 * 0 = 0 

100 * 100 = 10000

int getLeftMax(int idx , int[] arr){
    int leftMax=-1 , n=arr.length;
    for(int i=0;i<idx;i++)
    {
        leftMax=Math.max(leftMax,arr[i]);
    }
    return leftMax;
}

int getRightMax(int idx , int[] arr){
    int rightMax=-1, n=arr.length;
    for(int i=idx+1;i<n;i++)
    {
        rightMax=Math.max(rightMax,arr[i]);
    }
    return rightMax;
}

//rain water trapping 
int trap(int[] arr)
{
    int ans=0,n=arr.length;
    for(int i=0;i<n;i++)
    {
       int leftMaxValue=getLeftMax(i,arr);
       int rightMaxValue=getRightMax(i,arr);
       int minHeight=Math.min(leftMaxValue,rightMaxValue);

       int waterstored=Math.max(0,minHeight-arr[i]);
    }
    return ans;
}


1 2 3 4 5 6  

1 3 6 10 15 21 


1 2 3 4   5   6 
1 2 6 24 120 720


prefix of anything 

//why can't we calculate prefix max 
//why can't we calculate suffix max

//2 pointer approach 


1 2 3 85 6 6
0 1 2 3  4 5  
l          r 




//**************************************************



Online Stock Span 
class StockSpanner {
    //int[] arr;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int cur=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]<=price)
            {
                cur++;
            }
            else
            {
                break;
            }
        }
        return cur;
    }
}



1 4 2 0 3 4 7 


for every element index , 
if you find the index of previous greaater element 

then ans = index-previous greater element index


//bfs 

class pair{
    int x;
    int y;
    pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}


if a>b 

and b>c 

then a>c 








    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            List<Integer>l=new ArrayList<Integer>();
            int n=asteroids.length;
            Stack<Integer>s=new Stack<Integer>();
            for(int val:asteroids)
            {
                //positive case - moving to right direction
                if(val>0){
                    s.add(val);
                }
                else{ //negative - move to the left 
                    //cur one will pop ,  top of stack case 
                    while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(val)){
                        s.pop();
                    }
                    //both neg case
                    if(s.isEmpty() || s.peek()<0){
                        s.add(val);
                    }
                    //both equal case
                    else if(s.peek()==Math.abs(val) ){
                        s.pop();
                    }
                }
            }
            int[] ans=new int[s.size()];
            int i=s.size()-1;
            while(!s.isEmpty()){
                ans[i]=s.pop();
                i--;
            }
            return ans;
        }
    }