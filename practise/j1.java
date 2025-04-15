import java.util.*;


// constructor -
// initializes the class variables
// 	method name is same as class name
// 		it will not have any return type



// 1.Default constructor
// 2.Paramaetarized constructor
// 3.Copy constructor


class student {

	int age, section;
	double cgpa;
	String name;

	student() {

	}

	student(String name , int age , int section , double cgpa) {
		this.name = name;
		this.age = age;
		this.section = section;
		this.cgpa = cgpa;
	}

	student(String name , int age , int section ) {
		this.name = name;
		this.age = age;
		this.section = section;
	}

	//copy constructor
	student(student obj) {
		this.name = obj.name;
		this.age = obj.age;
		this.section = obj.section;
		this.cgpa = obj.cgpa;

	}



	//this - keyword
	void assign(String name , int age , int section , double cgpa) {
		// int a , y;
		this.name = name;
		this.age = age;
		this.section = section;
		this.cgpa = cgpa;
	}

	void details() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(section);
		System.out.println(cgpa);
	}

}

class j1 {

	public static void main(String[] args) {

		student s1 = new student();
		//created object

		//s1.details();

		s1.name = "NIKHITHA";
		s1.age = 20;
		s1.cgpa = 8.5;
		s1.section = 1;
		s1.details();


		student s2 = new student();
		s2.assign("SOHAIL" , 19 , 2 ,  9.5 );
		s2.details();



		student s3 = new student("A" , 18 , 3 , 7.5);
		s3.details();

		student s4 = new student("B" , 17 , 5 );
		s4.details();




		//copy constructor
		student s5 = new student(s2);
		s5.details();




	}
}



/*

class , objects


class {



}



object



class is a blue print for instance of class (object)




			plan , outline    (not real jail)





			class is a blue print , or a prototype

				object - instance of a class





					class student {

						String name;
						String rollno;

						float cgpa;

						//methods
						void sayhi() {
							System.out.println("Hi + " , name);
						}



					}


Classname objectname = new Classname();

student s1 = new Student();

s1.name = "AMRUTH NAVANEETH";
s1.rollno = "22H51A6604";
s1.cgpa = 8.5;

s1.sayhi();


objectname.variable name;
objectname.methodame();


student s2 = new Student();

*/










































12 Characters

Badhrip@2004












