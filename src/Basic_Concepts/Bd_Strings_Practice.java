package Basic_Concepts;

import java.lang.String;
public class Bd_Strings_Practice {

    //        1. Print each character of the string:
    static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println("character at " + i + ":" + str.charAt(i));
        }
    }


    //        2. Count length of the string without length():
    static int getLengthOfString(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        return count;
    }


//        3. Count vowels in a string:
    static int getVowelsCount(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }


//        4. Reverse the string:

//    static String reverseString(String str){
//      String reverse = "";
//      int n = str.length();
//        for (int i = n-1; i>=0; i++){
//          char ch = str.charAt(i);
//          reverse = reverse + ch;
//        }
//        return reverse;
//
//    }


//        5. Check String is a palindrome or not


    public static void main(String[] args) {
        String str1 = "Java";
        printString(str1);

        String str = "String";
        System.out.println(getLengthOfString(str));
        System.out.println(getVowelsCount(str));
//        System.out.println(reverseString(str));

    }


}
