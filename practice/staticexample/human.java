package staticexample;
public class human {
    int age;
    String name;
    int salary;
    String location;
    static int population;


    public human(int age, String name, int salary, String location){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.location=location;
        human.population++;
    }}
