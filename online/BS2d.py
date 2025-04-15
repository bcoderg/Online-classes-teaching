
    


    #finding element in 2d array 
def find_element(matrix, element):
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] == element:
                return (i, j)
    return None



#java code
'''
      for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==element){
                    return new int[]{i,j};
                }
            }
        }
'''


n*n 

n^2 ===> not acceptable 


converting 2d array to 1d array , by adding each element to a new array 

then binary search on new array 

python code
new_array = []
for i in range(len(matrix)):
    for j in range(len(matrix[i])):
        new_array.append(matrix[i][j])


#BS on new_array
def binary_search(new_array, element):
    left = 0
    right = len(new_array) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if new_array[mid] == element:
            return mid
        elif new_array[mid] < element:
            left = mid + 1
        else:
            right = mid - 1
    return None



#example 2d array 
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
element = 5
print(find_element(matrix, element)) # (1, 1)

  0 1 2 
0 1 2 3 
1 4 5 6
2 7 8 9


#write i,j positions 
   0 1  2 
0 00 01 02
1 10 11 12
2 20 21 22


1d array = [1, 2, 3, 4, 5, 6, 7, 8, 9]

n^2 + log(n^2)




while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                J--;
            } else {
                i++;
            }
        }

        return false;
    }

i=0 , j=2 
target=7 
matrix[0][2]=3<7
i=1,j=2
matrix[1][2]=6<7
i=2,j=2
matrix[2][2]=9>7
j=1
matrix[2][1]=8>7
j=0
matrix[2][0]=7==7

  0 1 2 
0 1 2 3 
1 4 5 6
2 7 8 9


m+n 

32 * 32 

32 rows + 32 columns 
64 steps    


#binary search on rows , columns
log(m) + log(n)



#binary search 
log(n)
n*m 
log(n*m)  = log(n) + log(m)
32*32 = 1024
log(n*m)= log(32*32)=log(1024)=10






target=4 
i=0,j=2
matrix[0][2]=3<4
i=1,j=2
matrix[1][2]=6>4
j=1
matrix[1][1]=5>4
j=0
matrix[1][0]=4==4

  0 1 2






3*6 size matrix 
    0 1 2 3 4 5
0   1 2 3 4 5 6
1   7 8 9 10 11 12
2   13 14 15 16 17 18







#2d bs 
left=0 
right=(n*m)-1
while left<=right:
    mid=left+(right-left)//2
    row=mid//n
    col=mid%n
    if matrix[row][col]==target:
        return True
    elif matrix[row][col]<target:
        left=mid+1
    else:
        right=mid-1




#dry run 
[[1,3,5,7],[10,11,16,20],[23,30,34,60]]


0  1  2  3   
1  3  5  7      0
10 11 16 20     1 
23 30 34 60     2


l=0 , r=11 
l=0 , r=5 
l=0 , r=1  







#koko  eating bananas 

3 6 7 11 

h=8

k=?

max_value=---; 
//max element in piles[]
for(int k=0;k<=max_value;k++)
{
    if(eats_all-bananas(k))
    {
        retun k;
    }
    else{
        return -1;  //not possible to eat all bananas
    }
}
