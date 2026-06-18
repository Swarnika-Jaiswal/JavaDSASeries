public class Be_basicprg {
//  To print the digits of the given number:
    static void printDigits(int num){
        while(num != 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;
        }
    }
//  To count the total number of digits in the given number:
    static int countDigit(int num){
        int count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        return count;

    }
//  To print the sum of the digits in given number:
    static int sumOfDigit(int num){
        int sum = 0;
        while (num != 0){
        int digit = num%10;
        sum = sum + digit;
        num = num/10;
        }
        return sum;
    }

//  To print the reverse of the given number:
     static int reverseDigit(int num){
        int revNum = 0;
       while( num != 0){
            int digit = num%10;
             revNum = revNum*10 + digit;
            num = num/10;
       }
       return revNum;
     }

//   To print true if the given number is palindrome i.e original number == reversed number.
    static boolean isPalindrome(int num){
        int orgNum = num;
        int revNum = 0;
        while(num != 0){
           int digit = num%10;
           revNum = revNum*10 + digit;
           num = num/10;
        }
        if(orgNum==revNum){
            System.out.println("Palinrome");
            return true;
        }
        else{
            System.out.println("Not Palindrome");
            return false;
        }

    }





    public static void main(String[] args) {
        int num = 36182;
        printDigits(num);
        System.out.println("Total count in the given number= " + countDigit(num));
        System.out.println("Total sum of the given digits= " + sumOfDigit(num));
        System.out.println("Reversed no= " + reverseDigit(num));
        System.out.println(isPalindrome(121));


    }
}
