public class Bg_Student_OOP {
// Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

//Constructor:
    public Bg_Student_OOP(){
        System.out.println("Student Default ctor called");
    }



// Methods
public void study(){
    System.out.println(name + "Studying");
}
public void sleep(){
    System.out.println(name + "Sleeping");
}
public void bunk(){
    System.out.println(name + "Bunking");
}
}
