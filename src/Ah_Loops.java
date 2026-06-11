/*
FOR LOOP:
for(initialization; conditional; updation)

WHILE LOOP:
while (condition) {
    // code
}

DO-WHILE LOOP:
do {
    // code
} while (condition);

*/

public class Ah_Loops {
    public static void main(String[] args) {

//      FOR LOOP:
        for (int day = 1; day <= 5; day++) {
            System.out.println(day);
        }
//        To print even numbers till 10:
        for (int value = 2; value <= 10; value += 2) {
            System.out.println(value);
        }

//        To print message three times:
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Keep practicing!");
        }

//        WHILE LOOP: (used when number of repetitions is unknown)
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
                    count++;
                }


//        DO-WHILE LOOP:
        int score = 10;
        do {
            System.out.println("This runs once.");
        } while (score > 50);

//        NESTED LOOP:
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }



/*         Infinite while Loop:
        while (true) {
            System.out.println("This keeps running forever");
        }

           Infinite for Loop:
        for (;;) {
            System.out.println("Infinite loop");
        }
 */




    }
}
