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

//  3. Void method:(Parameterized/Non Parameterized)
//      void method are the method that do not contain return.
        static void mulipy(int x, int y){
            int res = x*y;
            System.out.println("multiplication = " + res);
        }

//  4. No Void method:(Parameterized/Non Parameterized)
//      In this method we write the datatype in which it it retun the value along with retun statement.
        static float div(){
            int x = 5;
            int y = 2;
            float div = x/y;
            return div;
        }
// program execution point is: main
        public static void main(String[] args){
            System.out.println("hi");
// Method call
        print2kaTable();
        System.out.println("bye");
        System.out.println("addition = "+add(4,2));
        System.out.println("subtraction = "+sub());
        mulipy(2,8);
        System.out.println("division = "+ div());
        }

    }

