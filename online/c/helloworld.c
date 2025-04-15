#include<stdio.h>
#include<string.h>
//function to print a 2d array
// void print2dArray(int arr[m][n])
// {
//     for(int i=0;i<m;i++)
//     {
//         for(int j=0;j<n;j++)
//         {
//             printf("%d ",arr[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n\n");
// }

// int main()
// {

//     //functions 
//     int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};

//     // for(int i=0;i<3;i++)
//     // {
//     //     for(int j=0;j<3;j++)
//     //     {
//     //         printf("%d ",arr[i][j]);
//     //     }
//     //     printf("\n");
//     // }
//     print2dArray(arr);

//     // printf("\n\n");
//     //another 2d array
//     int arr1[3][3]={{0,0,0},{1,1,1},{4,4,4}};
//     print2dArray(arr1);
    
//     // for(int i=0;i<3;i++)
//     // {
//     //     for(int j=0;j<3;j++)
//     //     {
//     //         printf("%d ",arr1[i][j]);
//     //     }
//     //     printf("\n");
//     // }

//     // printf("\n\n");




    
    

//     return 0;
// }


// student 
// name:
// rollno:
// GPA:
// DOB: 
// mobile no:
// email id:

// 1st year - 1000 students

// 05AT - 1 student 
// name = "abc"

// student1name="abc"
// student1rollno=1
// student1GPA=9.8
// student1DOB="12-12-2006"
// student1mobile=1234567890
// student1email="abc@gmail.com"

// int a =1 , b=2 ;
// student1={1,"abc",9.8,"12-12-2000",1234567890,""}

// student2name="def"
// student2rollno=2
// student2GPA=9.8
// student2DOB="12-12-2000"
// student2mobile=1234567890
// student2email=""
// //null character 
// '\0'


// studentname[1000];
// studentrollno[1000];
// studentGPA[1000];
// studentDOB[1000];
// studentmobile[1000];
// studentemail[1000];


// studentname[5]="xyz";
// studentrollno[5]=5;
// studentGPA[5]=9.8;
// studentDOB[5]="12-12-2000";
// studentemail[5]=""

// primitive data types
// //datatypes in c 
// int - 4 bytes
// float - 4 bytes
// double - 8 bytes
// char - 1 byte
// long - 4 bytes
// long long - 8 bytes
// long double - 16 bytes


// user defined data types
// student




struct DATE {
    int year;
    int month;
    int day;
};


//structures in c
//define a structure
struct student
{
    char name[20];
    int rollno;
    float GPA;
    //structure in another structure
    struct DATE DOB;
    //int mobile;
    long mobile;
    char email[30];
};

int main(){
    //declare a structure variable
    struct student s1={"abc",1,9.8};

    //print s1 values
    printf("Name: %s\n",s1.name);
    printf("Rollno: %d\n",s1.rollno);
    printf("GPA: %f\n",s1.GPA);
    printf("DOB: %d-%d-%d\n",s1.DOB.day,s1.DOB.month,s1.DOB.year);
    printf("Mobile: %ld\n",s1.mobile);

    printf("\n\n");
    //DOB before 
    printf("DOB before: %d-%d-%d\n",s1.DOB.day,s1.DOB.month,s1.DOB.year);
    s1.DOB.year=2006;

    //DOB after
    printf("DOB after: %d-%d-%d\n",s1.DOB.day,s1.DOB.month,s1.DOB.year);

    printf("\n\n using arrow operators and pointers \n\n");
    int n=5;
    //pointers to n 
    int *ptr=&n;

    //print n using pointer 
    printf("n: %d\n",*ptr);



    //pointer to structure
    struct student *ptr1=&s1;
    //print structure using pointer
    printf("Name: %s\n",ptr1->name);
    printf("Rollno: %d\n",ptr1->rollno);
    printf("GPA: %f\n",ptr1->GPA);
    printf("DOB: %d-%d-%d\n",ptr1->DOB.day,ptr1->DOB.month,ptr1->DOB.year);
    printf("Mobile: %ld\n",ptr1->mobile);

    //change values using pointer
    ptr1->DOB.year=2000;
    printf("DOB after: %d-%d-%d\n",ptr1->DOB.day,ptr1->DOB.month,ptr1->DOB.year);
    


    return 0;
}


// bits , bytes 

// each bytes , has how many bits
// 4 bytes , each byte has 8 bits
// 4*8 = 32 bits

// //binary numbers 
// 0 1


// a number 5 
// int num =5;
// 5 in binary = 101

// 0101
// 8421
// total = 5 


// 32 bits 
// 00000000 00000000 00000000 00000101

// 1 00000000 00000000 00000000 00000000 = 2^32 =  4294967296
// 2^32 -1 = 4294967295

// 2^

// 111
// 421
// 7 
// 7+1 
// 8
// 1000

// 2^64 -1 

// // 64 bits 

// 16 bits 
// 2^16-1 

// -ve to +ve 
// -2^15 to 2^15-1

// -32768 to 32767

// //int
// -2^31 to 2^31-1
// -2147483648 to 2147483647


