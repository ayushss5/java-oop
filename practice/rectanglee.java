public class rectanglee {
    public static void main(String[]args){
        Rectangle r1 = new Rectangle(10,5);
        Rectangle r2 = r1;
        r2.length=99;
        System.out.println(r1.length);
        System.out.println(r2.length);
        Rectangle r3=new Rectangle(r1);
        r3.width=1;
        System.out.println(r1.width);
        System.out.println(r3.width);
        if(r1==r2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        Rectangle helper = new Rectangle(1, 1);
        helper.zeroOther(r1);
        System.out.println(r1.length);
        helper.replaceOther(r2);
        System.out.println(r2.length);
        System.out.println(r2.width);
        final Rectangle r5 = new Rectangle(2,3);
       // r5.length=100;
       // r5.width=200;
       System.out.println(r5.length);




    }
    
}
class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    Rectangle(Rectangle other){
        this.length=other.length;
        this.width=other.width;
    }
    void zeroOther(Rectangle other) {
        other.length = 0;
    }
    void replaceOther(Rectangle other) {
    other = new Rectangle(1, 1);
    System.out.println(other.length);
    System.out.println(other.width);
}

}