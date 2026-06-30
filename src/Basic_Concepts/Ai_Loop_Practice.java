package Basic_Concepts;

public class Ai_Loop_Practice {
    public static void main(String[] args) {


//        1.Print counting numbers from 1 to n:
        int n1 = 5;
        for(int i=1; i<=n1; i++){
            System.out.println(i );
        }



//        2.Print counting number from n to 1:
          int n2 = 8;
          for (int i=n2; i>=1; i--){
              System.out.println(i);
          }




//        3.Print the 10 multiples of 10:
        for (int i=1; i<=10; i++ ){
            int pro= 10*i;
            System.out.println("10 x " +i+ "= " + pro);
        }




//        4.Print your name 100 times:
        for(int i=1; i<5; i++){
            System.out.println("Swarnika Jaiswal");
        }




//        5.Print all prime numbers from 1 to 100:
        for(int i = 2; i<=100; i++){
            boolean isPrime = true;
            for (int j = 2; j<=i/2; j++ ){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }





//        6.Print all even numbers from 1 to 100:
        for(int i=0; i<=100; i=i+2){
            System.out.println(i);
        }




//        7.Print the sum of all the numbers from 1 to n :
        int n3 = 50;
        int sum = 0;
        for(int i=1; i<=n3; i++){
            sum = sum + i;
        }
        System.out.println("Total sum from 1 to " +n3+ " is: " + sum);





//        8.Print all the integers in range from 50 to 100, that are perfectly divisible by 7:
        for (int i = 50; i<100; i++){
            if(i%7==0){
                System.out.print( i +" " );
            }
        }



    }
}
