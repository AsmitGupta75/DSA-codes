package Strings;

public class Strings {
    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        // Strings are immutable;
//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        String str1 = new String("xyz");
//
//        Scanner sc = new Scanner(System.in);
//        // String name = sc.next();
//        String name = sc.nextLine();
//        System.out.println(name);

//        String fullName = "Tony Stark";
//        System.out.println(fullName.length());

//        // Concatenation --> String concatenation is the process of joining two or more strings together to form a single, larger string.
//        String firstName = "Asmit";
//        String lastName = "Gupta";
//        String fullName = firstName+" "+lastName;
//        System.out.println(fullName.charAt(0));
//        printLetter(fullName);

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
//        if(s1==s2){
//            System.out.println("equal");
//        }else System.out.println("not equal");
//
//        if(s1==s3){
//            System.out.println("equal");
//        }else System.out.println("not equal");

        if(s1.equals(s3)){
            System.out.println("equal");
        }else System.out.println("not equal");







    }
}
