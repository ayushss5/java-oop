package staticexample;
public class Main {
    public static void main(String[] args) {
        human h1 = new human(20, "John", 50000, "New York");
        human h2 = new human(25, "Alice", 60000, "Los Angeles");
        human h3 = new human(30, "Bob", 70000, "Chicago");

        System.out.println("Population: " + human.population);
        System.out.println("Human 1: " + h1.name + ", Age: " + h1.age + ", Salary: " + h1.salary + ", Location: " + h1.location + human.population);
    }

}
