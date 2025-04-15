    Arr=()
For i,n in enumerate (number):
Diff=target-n
if diff in arr:
Return (arr(diff))
Arr(n)-i
Return


val  


val=1 , 
target - val = 10-1 = 9 

1,9 

val=3 
target - val = 10-3 = 7 

3,7 


1,2,3,4,5,6,7,8,9,10 

1,9
2,8
3,7
4,6
5,5 ----->2 are same numbers 
6,4x
7,3
8,2
9,1



lst=[2,4,6,8,10,12]
n=len(lst)
sum1=sum(lst[:3])
print(sum1)
for x in range(n-3):
    sum1=sum1-lst[x]+lst[x+3]
    print(sum1)






lst=[1,2,4,3,6,8,10,12,5,12]
n=len(lst)
y=0
ans=0
while(y<n):
   if(lst[y]%2==0):
      y=y+1
      count=count+1
      if(count>ans):
          ans=count 
   elif(lst[y]%2==1):
      y=y+1
      count=0
      
print(ans)







ci = {}
ml = st = 0

for i, c in enumerate(s):
    if c in ci and ci[c] >= st:
        st = ci[c] + 1
    ci[c] = i
    ml = max(ml, i - st + 1)





c++ - set , map 
java - HashSet , HashMap

python - set() , dict() , ={} , vis[]




1 2 3 5 7 2 8 9 1 


take array of size 10 , with all zeroes  

0 1 2 3 4 5 6 7 8 9 
0 1 1 1 0 1 0 1 1 1


//frequency counting - freq array 



//characters  abcd 




