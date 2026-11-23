Java OOP Revision Notes

These are your revision notes for the concepts you've covered so far. Read them, understand the examples, and then try explaining each concept without looking.

1. Classes and Objects
Class
A class is a blueprint or template used to create objects. It defines the properties (variables) and behaviours (methods) that its objects will have.

Example:

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }
}


Here:

- Car is the class.
- brand and speed are instance variables.
- drive() is an instance method.

Object

An object is an instance of a class. It represents an actual entity created using the class blueprint.

Car car1 = new Car();

car1.brand = "BMW";
car1.speed = 120;

car1.drive();


Breaking this down:

- Car → Data type (class).
- car1 → Reference variable.
- new → Creates an object.
- Car() → Constructor call.

Important: A class defines the structure; an object holds its own instance data.
Multiple objects
Car car1 = new Car();
Car car2 = new Car();

car1.brand = "BMW";
car2.brand = "Audi";


Both objects belong to the same class, but each has its own instance variables.

2. Packages
Definition
A package in Java is a mechanism used to group related classes and interfaces together.

It helps:
- Organise code.
- Avoid naming conflicts.
- Control access.
- Improve maintainability.

Example:

Suppose your project has this structure:

project/
│
├── animals/
│   └── Animal.java
│
└── application/
    └── Main.java


Inside Animal.java:
package animals;

public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}


Inside Main.java:
package application;

import animals.Animal;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();
    }
}


What does import do?
import animals.Animal; allows you to refer to the Animal class using its simple name rather than its fully qualified name.

Without the import, you could write:
animals.Animal a = new animals.Animal();


Important: import does not physically move a class or copy its code. It helps the compiler resolve class names.
Public keyword
If you want to access a class or member from another package, it generally needs to be public (subject to the relevant access rules).

For example:
public int balance = 5000;


This makes the field accessible wherever the class itself is accessible, although public fields are generally not recommended for good encapsulation.

3. Static Keyword

Definition

The static keyword declares a member that belongs to the class itself rather than to individual objects.
Static variable
class Student {
    static String college = "TIU";
}


The variable college belongs to the Student class.

You can access it directly:
System.out.println(Student.college);


It is shared among instances of that class.
Non-static variable
class Student {
    String name;
}


Every Student object gets its own name variable.
Student s1 = new Student();
Student s2 = new Student();

s1.name = "Ayush";
s2.name = "Rahul";


Now:

- s1.name = Ayush
- s2.name = Rahul

Static vs non-static

Static	Non-static:
Belongs to class	Belongs to object
Shared class-level member	Individual instance member
Can be accessed using class name	Accessed through an object
No object required	Object required for instance access

Why is main() static?
public static void main(String[] args)


The JVM needs to invoke the entry-point method without first creating an object of the class.

Since main() is static, it can be invoked through the class itself.
Important restriction
A static method cannot directly access non-static instance variables or methods.

Example:
class Student {

    String name = "Ayush";

    public static void main(String[] args) {

        // System.out.println(name); // ERROR

        Student s1 = new Student();

        System.out.println(s1.name); // Works
    }
}


Why?

Because name belongs to an object, and the static method doesn't automatically have an instance to access.

4. Singleton Class
Definition
A Singleton Class is a class designed to ensure that only one instance of that class is created and that the instance can be accessed through a controlled method.
Why use it?
Sometimes an application needs a single shared instance of a particular object.

Examples include:
- Configuration managers.
- Logging services.
- Certain application-wide managers.
Basic implementation
class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}


Understanding the code
1. private static Singleton instance;
   
   Stores the single class-level instance.
2. private Singleton()
   
   Prevents other classes from creating objects using new Singleton().
3. getInstance()
   
   Provides controlled access to the instance.
4. if (instance == null)
   
   Creates the object only if it doesn't already exist.
Usage
public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}


Output:
true


Both references point to the same object.

Important: This basic implementation is not thread-safe. You'll learn more robust Singleton implementations when studying multithreading and concurrency.

5. In-built Methods
Definition
In-built methods are predefined methods provided by Java's standard library. They allow developers to perform common operations without implementing everything from scratch.

Java provides methods through classes such as String, Math, Arrays and System.
A. String methods
Strings are objects of the String class.
String name = "Ayush";


Method	Purpose	Example
length()	Returns string length	name.length()
charAt()	Returns character at index	name.charAt(0)
toUpperCase()	Converts to uppercase	name.toUpperCase()
toLowerCase()	Converts to lowercase	name.toLowerCase()
equals()	Compares string contents	name.equals("Ayush")
contains()	Checks if substring exists	name.contains("yu")
substring()	Extracts part of string	name.substring(1, 3)

Remember: Java Strings are immutable. These methods generally return new strings instead of modifying the original string.
B. Math methods
The Math class provides mathematical operations.
Math.max(10, 20);  // 20
Math.min(10, 20);  // 10
Math.abs(-15);     // 15
Math.sqrt(25);     // 5.0
Math.pow(2, 3);    // 8.0


Most commonly used Math methods are static, so you don't need to create a Math object.
C. Arrays methods
The Arrays class provides utility methods for working with arrays.
import java.util.Arrays;

int[] numbers = {5, 2, 8, 1};

Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));


Output:
[1, 2, 5, 8]


Some useful methods:
- Arrays.sort() – Sorts an array.
- Arrays.toString() – Converts an array into a readable string representation.
- Arrays.equals() – Compares array contents.
- Arrays.copyOf() – Copies an array.

6. Quick Revision: Important distinctions
Concept	Remember this
Class	Blueprint
Object	Instance of a class
Package	Organises related classes
Import	Allows convenient class-name resolution
Static	Belongs to the class
Non-static	Belongs to an object
Singleton	Restricts a class to one instance
In-built method	Predefined method from Java libraries
