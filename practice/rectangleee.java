package practice;

public class rectangleee {
    public static void main(String[]args){
        Rectangle r1 = new Rectangle(50,50);
        r1.area();
    }
    
}
class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    void area(){
        System.out.println(length*width);
    }
}
