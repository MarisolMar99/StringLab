import java.util.Scanner;

public class StringLab
{
    public static void main(String [] args)
    {
     String str1 = "Welcome to Java String Lab!";
     String str2 = "java string lab!";
     
     System.out.println(str1.length()); //output the length of the string

     System.out.println(str1.charAt(7)); //output the character that is on index 7; 
     
     System.out.println(str1.substring(11,15)); // output of the string of character(s) in the index(s) inserted

     System.out.println(str1.toUpperCase()); // output the string to uppercase 
     System.out.println(str1.toLowerCase()); // output the string in lower case

     System.out.println(str1.indexOf("Java")); // output the index the first ("") time it is found

     System.out.println(str1.contains("Lab")); // output (true/false) if the string contains ("") 

     System.out.println(str1.replace("Java", "Java Programming")); // output is replacing oen thing for another

     System.out.println(str1.equals(str2)); //output is (true/false) if the statement is true
     System.out.println(str1.equalsIgnoreCase(str2)); // put is (true/flase) if the statement is true , ignoring the case

     System.out.println(str1.equals(str2.trim()));// output (true/false) if removing anything the user might have added still equal or not
        
        for (int i = 0; i<str1.length(); i++)
        {
            System.out.println(str1.charAt(i));
        }

        String[] parts = str1.split(" ");
        for (String part : parts) 
        {
            System.out.println(part);
        }

        int vowelCount = 0;
        String vowels = "aeiou";

        for(int i = 0; i<str1.length(); i++)
        {
            char ch = str1.charAt(i);
            if (vowels.indexOf(ch) != -1)
            {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in string is " + vowelCount);


        String word = "racecar";
        int start = 0;
        int end = word.length() -1;
        boolean isPalindrome = true;

            while(start < end){
                if(word.charAt(start) != word.charAt(end)){
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            if(isPalindrome)
            {
                System.out.println(word + " is a palindrome.");
            }else{
                System.out.println(word + " is not a palindrome.");
            }
        

    
        Scanner scanner = new Scanner(System.in);
        String sentence;
        

        do{
            System.out.print("Please enter proper sentence here: ");
            sentence = scanner.nextLine();

        } while(!sentence.contains("Java"));// will keep showing same prompt until user enters ""

        System.out.println("Thank You.");//output once the proper text is entered


        StringBuilder sb = new StringBuilder("StringBuilder Lab");

        sb.append(" - Learning Java");// output will show the "" being added to the StringBuilder
        System.out.println("After append: " + sb);

        sb.insert(17, " is fun"); //output will insert "" to StringBuilder
        System.out.println("After insert: " + sb);

        int startIdx = sb.indexOf("Learning");
        int endIdx = startIdx + "Learning".length();
        sb.delete(startIdx, endIdx);
        System.out.println("After delete: " + sb); //ouput will delete "" from StringBuilder

        sb.reverse();
        System.out.println("Reversed StringBuilder: " + sb); //reverse the StringBuilder


        StringBuffer sbf = new StringBuffer("Multithreading Lab");

        sbf.append(" - Learning Java"); //output will show this being added to the StringBuffer
        System.out.println("After append: " + sbf);

        sbf.insert(18, " is fun"); //output will insert "" to StringBuffer
        System.out.println("After insert: " + sbf);

        int startIdxSbf = sbf.indexOf("Learning");
        int endIdxSbf = startIdxSbf + "Learning".length();
        sbf.delete(startIdxSbf, endIdxSbf);
        System.out.println("After delete: " + sbf);//ouput will delete "" from StringBuilder

        sbf.reverse();
        System.out.println("Reversed String: " + sbf); //reverse the StringBuffer
    
        scanner.close(); 
    }

       

} 
