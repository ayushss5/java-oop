public class wrapper {
    public static void main(String[]args){
        Integer a = 100;
        Integer b = 100;
        System.out.println(a.equals(b));
        System.out.println(a==b);
        Integer c = 1000;
        Integer d = 1000;
        System.out.println(c.equals(d));
        System.out.println(c==d);
        Integer n = null;
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
