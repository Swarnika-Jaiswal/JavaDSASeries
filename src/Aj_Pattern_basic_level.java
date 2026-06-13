public class Aj_Pattern_basic_level {
    public static void main(String[] args) {


//  SOLID SQUARE PATTERN:
        System.out.println("SOLID SQUARE PATTERN:");
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                System.out.print(" * ");
            }
            System.out.println();

        }System.out.println();


//  SOLID RECTANGULAR PATTERN:
        System.out.println("SOLID RECTANGULAR PATTERN:");
        for(int i = 1; i<=3; i++){
            for(int j=1; j<=6; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();


//  RIGHT ANGLE TRAINGLE:
        System.out.println("RIGHT ANGLE TRAINGLE:");
        for(int i =1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();



//  INVERSE RIGHT ANGLED TRAINGLE:
        System.out.println("INVERSE RIGHT ANGLED TRAINGLE:");
        for(int row=1; row<=5; row++){
            for(int col=1; col<=(5-row+1); col++){
                System.out.print(" * ");
            }
            System.out.println(" ");

        }
        System.out.println();
        System.out.println();


//  NUMBER TRAINGLE:
        System.out.println("NUMBER TRAINGLE:");
        int n=5;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();



//  REPEATED NUMBER TRAINGLE:
        System.out.println("REPEATED NUMBER TRAINGLE:");
    int n1=5;
    for(int row=1; row<=n1; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print(row);
        }
        System.out.println();
    }
        System.out.println();


//    ALPHABET TRAINGLE:
        System.out.println("ALPHABET TRAINGLE:");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


//  FLOYD'S TRAINGLE:
        System.out.println("FLOYD'S TRAINGLE:");
        int n2 = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(n2 + " ");
                n2++;
            }
            System.out.println();
        }


//  REVERSE ALPHABET TRAINGLE:
        System.out.println("REVERSE ALPHABET TRAINGLE:");
        int n3 = 5;
        for(int row = 1; row<=n3; row++){
            char val= 'E';
            for(int col=1; col<=row; col++){
                System.out.print(val);
                val--;
            }
            System.out.println();
        }


































    }
}
