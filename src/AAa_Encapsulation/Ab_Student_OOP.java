package AAa_Encapsulation;

public class Ab_Student_OOP {
// Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName() {
      return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    //Constructor:
        //1.Default Constructor // attr -> garbage
    public Ab_Student_OOP(){
//            System.out.println("Student Default constructor called!");
    }
   //2.Parameterized Constructor
    public Ab_Student_OOP(int id, int age, String name, int nos, String gf){
        System.out.println("Student Default constructor called!");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;

    }
   // 3.Copy Constructor
    public Ab_Student_OOP(Ab_Student_OOP srcobj){ // scrobj -> A
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
private void gfChatting(){
    System.out.println(name + "Chatting");
}
}
