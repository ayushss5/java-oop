public class practice {
    public static void main(String[]args){
        Book b1 = new Book("Maths","Rosen",500.0f);
        Book b2 = new Book();
        Book b3 = new Book(b1);
        b1.printbook();
        b2.printbook();
        b3.printbook();
    }
    
}
class Book{
    String title;
    String author;
    float price;
    Book(String title,String author, float price){
        this.title = title;
        this.author=author;
        this.price=price;
    }
    Book(){
        this("MathsII","RosenII",1000);
    }
    Book(Book other){
        this.title=other.title;
        this.author=other.author;
        this.price=other.price;
    }
    void printbook(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);


    }
}
