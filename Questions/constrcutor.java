//constructor
// A constructor is a special method in a class designed to initialize an object when it is created. 
// It ensures that the object is set up with the required attributes and state before it is used.
//Ex = example obj = new example();
//in the previous example you hvae seen that we have a constructor but in classAndObj we dont have any constructor so the object of that class triggers the default constructor 
//it create a by default constrcutor and allocate the memory for that object
//constructor have the same name as the class name. so when object create it trigger the constrcutor that have you made with the same name as class name
// A constructor does not have a return type, not even void, unlike regular methods.

// Types of Constructor:
// There are three different types of constructos:

// Non-parameterized Constructor  which have no parameter no values

//     ex =  class Exampple{
//               Exampple(){   //this is a default constructor
//               }
// Parameterized Constructor    which have parameter or some attributes
//          ex =  class Example{
//                    int a;
//                    int b;
//                    int c;
//              Example(int a, int b, int c){
//              }
//          }

// Copy Constructor
// It enables the programmer to create a new object by copying the attributes of an existing object. 
// Java doesn't have an explicit copy constructor like C++ does. However, a copy constructor can be implemented manually by creating a constructor that takes an object of the same class as a parameter and copies its attributes using Constructor Chaining.

//          ex = class Example{
//                    int a;
//                    int b;
//                    int c;
//              Example(int a , int b , int c){
//                this.a = a;
//               this.b = b;
//                this.c = c;
//              }
//
//              Example(Example example){
//                Example(example.a, example.b, example.c);  //this is called constructor chaining
//              }   
//in this example you dont have to create the methods like getExample and setExample

//we also have constructor overloading where we can have multiple constructor with different parameter int the same class 
//           ex = class Example{
//                    int a;   
//                    int b;
//                    int c;
//              Example(int a, int b, int c){
//                    some code here
//              }
//              Example(int a, int b){
//                    some code here
//              }
//              Example(int a){
//                    some code here
//              } 
//              Example(int b){
//                    some code here}
//          }

//one constructor can call another constructor in the same class this is called constructor chaining and it is done by using this() keyword
//          ex = class Example{
//                    int a;
//                    int b;
//                    int c;
//              Example(int a , int b , int c){
//                this.a = a;
//               this.b = b;
//                this.c = c;
//              }
//             Example(int a , int b){
//                this(a, b, 0);  //this is called constructor chaining
//              }
//          }
// other way is by copy constructor you call the constrcutor in the constructor

// Practice (Constructors)
// Medium

// Design a class Rectangle with the following specifications :

// Attributes :

// length (double) : Represents the length of the rectangle
// width (double) : Represents the width of the rectangle.
// area (double) : Represents the area of rectangle.
// Constructors :

// A default constructor that initializes both length and width to 1.0
// A parameterized constructor that takes two arguments to initialize length and width.
// Methods :

// void calculateArea() : Computes the area of rectangle.
// void displayDetails() : Prints the rectangle's details, including its dimensions and area, in format specified below :


// Refer the sample examples for understanding the output format.

// Refer the commented code on IDE for output statements.


// Example 1

// Input : length = 5.0 , width = 3.0

// Output :

// Length : 1.00

// Width : 1.00

// Area : 1.00

// Length : 5.00

// Width : 3.00

// Area : 15.00

// Explanation :

// The program initialize the object r1 of class Rectangle using default constructor.
// Then it calls the calculateArea() method using r1 object.
// Then it calls the displayDetails() method using r1 object.
// Now program initializes another object r2 of class Rectangle using parameterized constructor with length and width as parameters.
// Then it calls the calculateArea() method using r2 object.
// Then it calls the displayDetails() method using r2 object.
// Example 2

// Input : length = 2.5 , width = 3.5

// Output :

// Length : 1.00

// Width : 1.00

// Area : 1.00

// Length : 2.50

// Width : 3.50

// Area : 8.75

// Explanation :

// The program initialize the object r1 of class Rectangle using default constructor.
// Then it calls the calculateArea() method using r1 object.
// Then it calls the displayDetails() method using r1 object.
// Now program initializes another object r2 of class Rectangle using parameterized constructor with length and width as parameters.
// Then it calls the calculateArea() method using r2 object.
// Then it calls the displayDetails() method using r2 object.

class Rectangle{
    double length;
    double width;
    double area;

      Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
      }

        Rectangle(double length, double width){
          this.length = length;
          this.width = width;
        }

          void calculateArea(){
            this.area = length * width;
          }

          void displayDetails(){
            System.out.printf("Length : %.2f\n", length);
            System.out.printf("Width : %.2f\n", width);
            System.out.printf("Area : %.2f\n", area);
          }   
}


public class constrcutor{
  public static void main(String[] args) {
      Rectangle obj = new Rectangle();
      obj.calculateArea();
      obj.displayDetails();

      Rectangle obj2 = new Rectangle(5, 3);
      obj2.calculateArea();
      obj2.displayDetails();
  }
}
