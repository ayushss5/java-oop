package lectures;
public class classes {
    public static void main(String[]args){


        //data of 5 students
        Student student1 = new Student(7069,"Ayush Samanta Sarkar",88.5f);
        System.out.println(student1.rno);
        student1.greeting();
        Student random = new Student();

    }
}
//create a class
class Student{
    int rno;
    String name;
    float marks;
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student(){
        System.out.println("Enter the details please :)");
    }
       void greeting() {
        System.out.println("Hi, this is " + this.name);
    }
}
