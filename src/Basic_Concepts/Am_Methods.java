package Basic_Concepts;

public class Am_Methods {

//  Method declaration:
        static void print2kaTable(){
            for(int i=1; i<=10;i++){
                int ans = 2*i;
                System.out.println("2x" + i+"= "+ ans );
            }
        }
// Types of Methods:
//  1. Parameterrized method:
        static int add(int x, int y){
            int ans = x+y;
            return ans;
        }
//  2. Non Parameterized method:
        static int sub(){
            int a = 5;
            int b = 3;
            int ans = a-b;
            return ans;
        }
// program execution point is: main
        public static void main(String[] args){
            System.out.println("hi");
// Method call
        print2kaTable();
        System.out.println("bye");
        System.out.println(add(4,2));
            System.out.println(sub());
        }

    }

