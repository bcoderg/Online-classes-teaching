
import java.util.*;

class Count_vowels {

    public static void main(String[] abcd) {

        String name = "venkata karthik sai";

        int count = 0;


        for (char i : name) {

            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                count++;
            }
        }

        System.out.println(count);

    }

}


class j {
    public static void main(String args[]) {

        System.out.println("main method --->");

        Count_vowels obj = new Count_vowels();
        obj.main();
    }
}


/*





source code ---- >  class file -- can be executed everywhere


    WORA - Write Once Run Anywhere



    JAVA VIRTUAL MACHINE   - INSTALLED





    JAVA:
    C
    C++
    C#
    python
    Java




    .c , .cpp
    .exe










    Compiler:

    C++ , python
    Source code   ------ > Machine Code (understandable by system)







    Java:
    JVM

    compiler              interpreter
    Source code -----> Byte Code    -------- >  Machine Code
    (.class file )



// WORA


    POINTERS:

    int a = 5;

* a , & a


user() {

    string password = "abc@123";

}



admin() {
    strin getp = * password;
}



classes , objects

class:
    blue print, real world entity , prototype



    object:
    instance of a class
        memory is allocated


        Constructor:
        method with name same as class name.







            Class is a Blueprint of an object

            object is instance of class


                plan , outline , how it should be






                class student {

                    //variables , methods , constructors

                    int age;
                    String name;
                    String roll_no;
                    float cgpa;


                    student(String s) { // constructor
                        name = s;
                    }




                    float cal_marks() {
                        return cgpa;
                    }
                }


student s1 = new student("Anirudh");






//INput and Output:

cin , cout



Scanner {

}



Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();


char c = sc.nextChar();


//sc.next();
String x = sc.nextLine();


System.out.println(); // new line

System.out.print(); // with in same line




ARRAY SYNTAX:

datatype[] array_name = new datatype[size_ of _ array];



int[] arr = new int[n];
arr[0] , arr[1] ... arr[n - 1];


arr.length


array is static , cannot extend it's size



Collections Framework:



ArrayList  (same as vector):


it is dynamic
no limit to size
add / delete / update dynamically







Arraylist al = new arraylist() ?


ArrayList<Integer> al= new ArrayList<>(); //empty array list


ArrayList<Integer> al= new ArrayList<>(size); // with size





//push_back  // adds an element at the end  ====> al.add();

al.add();


//to access
al.get(index);

//to modify
al.set(index  , value);


al.remove(index);




2 4 5











Character , Boolean



int , char , float





























*/










































String s;
l = 0
    mx = 0;
HashSet<Character> st = new HashSet<>();
for (int r = 0; r < s.length(); r++) {
    while (cst.contains(s.charAt(right))) {
        st.remove(s.charAt(ll));
        l++;
    }

    s.add(s.charAt(right));
    mx = Math.max(mx, r - l + 1);
}
return mx;




















class Solution {


    void bfs(int row , int col , int[][] vis , char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // delta row and delta column
        int delrow[] = { -1, 0, +1, 0};
        int delcol[] = {0, -1, 0, +1};

        Queue<triplet>q = new LinkedList<>();
        q.add(new triplet(row, col));

        while (!q.isEmpty()) {
            triplet top = q.remove();
            int r = top.f;
            int c = top.s;

            for (int i = 0; i < 4; i++) {
                int nr = r + delrow[i];
                int nc = c + delcol[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && vis[nr][nc] == 0 && grid[nr][nc] == '1') {
                    q.add(new triplet(nr, nc));
                    vis[nr][nc] = 1;
                }
            }
        }
    }

    int bfs_function(Queue<triplet>q , int[][]grid) {
        int m = grid.length;
        int n = grid[0].length;

        int mins = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            triplet top = q.remove();
            int r = top.i;
            int c = top.j;
            int cur_time = top.time;

            mins = Math.max(mins , cur_time);

            int[] del_col = { -1, 0, 1, 0};
            int[] del_row = {0, 1, 0, -1};
            for (int k = 0; k < 4; k++) {
                if (isValid(del_row[k] + i, del_col[k] + j, grid) && grid[del_row[k] + i][del_col[k] + j] == 1) {
                    grid[del_row[k] + i][del_col[k] + j] = 2;
                    q.add(new triplet(del_row[k] + i , del_col[k] + j , cur_time + 1));
                }
            }


        }

        return mins;


    }


    public boolean isValid(int i, int j, int[][]grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return false;
        }
        return true;
    }



    class triplet {
        int i, j, time;
        triplet(int a , int b , int time_t) {
            i = a;
            j = b;
            time = time_t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int min = 0;

        Queue<triplet>q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    //it is rotten orange
                    q.add(new triplet(i, j, 0));
                }
            }
        }

        int ans = bfs_function(q, grid);

        //recheck
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        System.out.println(min);
        return min;
    }
}









https://www.geeksforgeeks.org/find-frequency-of-each-element-in-a-limited-range-array-in-less-than-on-time/







1. First name
2. Last name
3. Mail id
4. Mobile number
5. Coding, hackathon and other achievements.
6. Resume link



Subject: Referral Request for role Software Developement, Test and Automation Engineer - Wireless (Meraki) at CISCO

    Hi Abhishek, I hope you're doing well.

    I’m reaching out to ask if you could kindly provide a referral for this role at Cisco.

    I’ve consistently ranked among the top 3 coders of my college and have taken part in several hackathons and codeathons.
    Having done good projects and solved over 1000+ CP problems has excellent knowledge on Data Structures and Algorithms.

    I have an internship experience as Software Developer working closely with Development and Automation at Siemen EDA.
    During my internship , I worked on complex Java applications and made their testing framework more efficient.
    I worked on an  Automation framework which generates code based on UI interactions.

    Resume:https://drive.google.com/file/d/1-uY_je-S8b8hfGww857P9cn84LB8mslL/view?usp=sharing

    Coming from a tier 3 college, it’s hard to get noticed, and a referral would really help me.
    I’d truly appreciate your support.Thank you

    Best regards,
    Badhri Narayana Gedela








    Coding Achievements:
    Ranked among the top 3 coders in college consistently over 4 years.
    Built an AI-powered chatbot for automating QA test case generation, improving test efficiency by 20% during hackathon at Siemens EDA.
    Solved 1,000+ competitive programming problems across platforms like Codeforces, LeetCode, and CodeChef.
