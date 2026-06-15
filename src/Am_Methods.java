public class Am_Methods {

//        method declaration:
        static void print2kaTable(){
            for(int i=1; i<=10;i++){
                int ans = 2*i;
                System.out.println("2x" + i+"= "+ ans );
            }
        }
//        program execution point is: main
      public static void main(String[] args){
            System.out.println("hi");
//            method call
            print2kaTable();
            System.out.println("bye");
        }

    }

