package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
//        // #1
//        String str = new Scanner(System.in).next();
//        int count = 0;
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if(ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o'  || ch == 'u'  ){
//                count++;
//            }
//        }
//        System.out.println(count);

          // #2
//        String str = "java is best. java is fun ";
//        System.out.println(str.replace('j','v'));
//        System.out.println(str.replace("java","python"));
//        System.out.println(str.replaceAll("java","python"));
//        System.out.println(str.replaceFirst("java","python"));

//       // #3
//       // intern() method
//        String s1 = "hello";                        // String pool me store hai
//        String s2 = new String("hello");            // heap memory me store hai
//        String s3 = s2.intern();                    // intern method ne s2 ko pool se refer kara diya
//        System.out.println(s1 == s2);               // false (different memory)
//        System.out.println(s1 == s3);               // true ( same pool reference)

//        // #4
//        // StringBuilder non synchronized hota hai or StringBuffer synchronized hota hai
//        // inka use string to mutable banane ke liye kiya jata hai
//        StringBuffer sb = new StringBuffer("hello");
//        System.out.println(sb.append(" world"));

        // #5
        // Anagram :- dono string me same letter or same frequeacu(count) honi chahiye
        String str1 = "listen";
        String str2 = "silent";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else System.out.println("not Anagram");


    }
}
