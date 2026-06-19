public class Bg_Student_OOP {
// Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

//Constructor:
   //1.Default Constructor // attr -> garbage
    public Bg_Student_OOP(){
        System.out.println("Student Default constructor called!");
    }
   //2.Parameterized Constructor
    public Bg_Student_OOP(int id, int age, String name, int nos){
        System.out.println("Student Default constructor called!");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;

    }
   // 3.Copy Constructor
    public Bg_Student_OOP(Bg_Student_OOP srcobj){ // scrobj -> A
        System.out.println("Student Copy constructor called!");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;

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
