public class finalkey {
    public static void main(String[]args){
        final int x =10;
        System.out.println(x);
        final int y;
        y=5;
        System.out.println(y);
        IDENTIFICATION id1=new IDENTIFICATION(7069);
        id1.id=7070;
        System.out.println(id1.id);
    }
    
}
class IDENTIFICATION{
    final int id;
    IDENTIFICATION(int id){
        this.id=id;
    }

}