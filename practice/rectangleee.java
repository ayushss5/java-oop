public class rectangleee {
    public static void main(String[]args){
        Rectanglee r1 = new Rectanglee(50,50);
        r1.area();
    }
    
}
class Rectanglee{
    int length;
    int width;
    Rectanglee(int length,int width){
        this.length=length;
        this.width=width;
    }
    void area(){
        System.out.println(length*width);
    }
}
