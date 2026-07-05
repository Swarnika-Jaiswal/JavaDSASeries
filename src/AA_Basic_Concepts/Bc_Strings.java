package AA_Basic_Concepts;

import java.util.Scanner;

public class Bc_Strings {
    public static void main(String[] args) {
//        String creation:
        String firstName = "Love";
        String lastName = new String("paaji");
        System.out.println("firstName:"+firstName+"  lastName:"+lastName);
//        Methods
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(0));

//        Strings are immutable i.e once the string is declared it can not be changed.
        String name = "Rana";
        name = "Bana";
        System.out.println(name);

//        Equals:
        String name1 = "Swar";
        String name2 = "SWAR";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));



//        Input:
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the string content:");
//        next(); => This method takes only one string as an input . It stops taking input when it encounters the space.
//        Eg: str1: Love;
        String str1 = sc.next();
        System.out.println("Value:"+str1);
//        nextLine(); => This method take a whole line as an input.
//          Eg: str2: MY name is Love
        String str2 = sc.nextLine();
        System.out.println("Value:"+str2);

//  Some operations over String using some methods:
        String s = "Ram";
        String s1 = "ram";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));

        String s2 = "";
        System.out.println(s2.length());
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

        String s3 = " Lavy  ";
        System.out.println(s3.length());
        s3 = s3.trim();
        System.out.println(s3.length());

        String s4 = "Sam";
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());

        String s5 = "My name is Swarn";
//        substring(begin-index, end-index);
//        begin-index => inclusive
//        end-index => exclusive
        System.out.println(s5.substring(3,6));
        System.out.println(s5.contains("love"));

        int num = 1234;
//        valueOf() => this method converts the integer to string
        String s6 = String.valueOf(num);
//        in integer below line increases integer value by 1
        System.out.println(num+1);
//        in string below line concatenate the 1 with the string
        System.out.println(s6+1);

        String s7 = " Rana is a lover";
        System.out.println(s7.startsWith("Rana"));
        System.out.println(s7.startsWith(" Rana is"));
        System.out.println(s7.endsWith("lover"));
        System.out.println(s7.endsWith("a lover"));

        String s8 = "Harsh";
        char[] arr = s8.toCharArray();
//        print the array in character form
        for (char ch: arr){
            System.out.println("Value of char: " + ch);
        }

        String s9 = "My, name, is , Swarnika";
        String[] words = s9.split(",");
        for (String val: words){
            System.out.println(val);
        }


//        replace(); method replaces the old character by new character
        String s10 = "Babbar";
        s10 = s10.replace('b','l');
        System.out.println(s10);




    }
}
