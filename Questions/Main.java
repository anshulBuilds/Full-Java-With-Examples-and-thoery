//1)-> Class
// In object-oriented programming, a Class is a blueprint or template for creating objects. It is the logical representation that defines a set of attributes (data) and methods (functions) that the objects created from the class will have. A class does not occupy memory on its own. It's essentially a definition or a structure from which individual objects are instantiated.
// For example, Consider the following code representing 1)-> Employee and 2)-> student data and methods:

//2)-> Object
// An object is an instance of a class. When an object is created from a class, memory is allocated for it, and it holds the data as specified by the class. An object interacts with other parts of the program, and methods can be called and attributes accessed that belong to it.
// For example, Consider the following code snippet demonstrating the creation of objects from the Employee class:

/* 
public class ClassAndObj{   //Employee class(Suppose)
  public String Emp_name; //attributes
  double Emp_sal;   //attributes

  void display(){     //behaviours
    System.out.println("Employee Name: " + Emp_name);
    System.out.println("Employee Salaey: " + Emp_sal);
  }

  public static void main(String[] args) {

      ClassAndObj obj = new ClassAndObj();    //After the new keyword the ClassAndObj is wriiten it is nothing but a default constructor
      obj.Emp_name = "Rahul";
      obj.Emp_name = "priya";
      obj.Emp_sal = 210000;
      obj.display();

      ClassAndObj obj2 = new ClassAndObj();
      obj2.Emp_name = "Prince";
      
      obj2.Emp_sal =21323.23;
      obj2.display();
  }
}
  */

//2) Example Student attributes and methods
/* 
class ClassAndObj{     //Student class (suppose)
    String Student_name;
    int rollNo;
    float marks;

    void setdetails(String st_name, int rll_no, float sub_marks){          //this is a method where we will now pass the value and see the result
        Student_name = st_name;
        rollNo = rll_no;
        marks = sub_marks;
    }        
    
      void display(){
        System.out.println("Student Name: " + Student_name);
        System.out.println("Student RollNo: " + rollNo);
        System.out.println("Student Marks: " + marks);
      }
  public static void main(String[] args) {
      ClassAndObj obj = new ClassAndObj();
      obj.Student_name = "AnshulBuilds";
      obj.marks = 9.40f;                   //for floating number you have to write the 'f' at the last of the number
      obj.rollNo = 10;
      obj.display();

      System.out.println("---------------------------------------");

      obj.setdetails("Riyals", 9, 9.42f);
      obj.display();

        System.out.println("---------------------------------------");

      ClassAndObj obj2 = new ClassAndObj();
      obj2.setdetails("YourName", 4, 9.9f);
      obj2.display();

      
  }
}

*/

//Question(Meduim Level)
/* 
Medium

You are tasked with designing a class Student that stores and displays information about students.

The class must have the following :

Attributes :

name (string) : Stores the name of the student.
rollNumber (int) : Stores the roll number of the student
Methods :

setDetails (String name, int rollNumber) : This method initializes the attributes name and rollNumber with the values provided by the user.
displayDetails() : This method prints the details of the student in following format (The output consist of two separate lines) :
Refer the sample input example to understand the output format.

Refer the commented code on IDE for output statements.

Example 1

Input : Name - "Striver" , Roll Number : 101

Output :

Name : Striver

Roll Number : 101

Explanation :

A Student object is created in Main class.
The setDetails() method is called with "Striver" and 101 as arguments. This initializes the name attribute to "Striver" and the rollNumber attribute to 101.
The displayDetails() method is invoked , which prints the student's details in the required format.
Example 2

Input : Name - "Jax" , Roll Number : 10434

Output :

Name : Jax

Roll Number : 10434

Explanation :

A Student object is created in Main class.
The setDetails() method is called with "Jax" and 10434 as arguments. This initializes the name attribute to "Jax" and the rollNumber attribute to 10434.
The displayDetails() method is invoked , which prints the student's details in the required format.
*/

class ClassAndObj{
    private String name;
    private int rollNumber;

      void SetDetails(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
      }

        void DisplayDetails(){
          System.out.println("Name: " + name);
          System.out.println("Roll Number: " + rollNumber);
        }
}

public class ClassAndObj{
  
}