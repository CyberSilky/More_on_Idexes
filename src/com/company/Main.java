package com.company;

public class Main {

    public static String reverseString(String s) //reverse the input string without modifying it
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() -1; i >= 0; i--)
        {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
	// write your code here
        // A P P L E S
        // 0 1 2 3 4 5 this is a list of indexes for the above word APPLES

        String a = "Apples";
        String b = "Bananas";
        String o = "Oranges";
        String bp = "Banana Peels";
        String p = "Pears";
        String[] fruits = {a, b, o, bp, p}; //this creates a string array called fruits that include the variables from above

        for (String f : fruits)
        {
            //getting a character at a specific index
            int index = 1; //we picked a specific index we called 1
            System.out.println(f.charAt(index)); //this says for string f choose the index character at position index which is 1 and print it out to the screen

            char[] charArray = f.toCharArray(); //converts the entire string into its own char array
            System.out.println("Char at " + index + " : " + charArray[index]);

            int indexOfLetterE = f.indexOf('e'); //this finds a specific characters index so for the character e we will find the index
            System.out.println(indexOfLetterE);

            //using the contains method the strings case must match for example all lowercase
            //also the contains method returns true or false
            f = f.toLowerCase(); //normalizes the string by converting it to lower case
            if (f.contains("app")) // f is the converted text into lowercase
            {
                System.out.println("Contains app: " + f);
            }

            System.out.println(f.substring(1, 4)); //grabs a substring by index...this grabs the index 1,2,and 3 but does not include the index 4

            System.out.println(reverseString(f));

            System.out.println(); //adds a line between different strings


            //print a string if it contains a substring
            //grab a substring using two indexes
            //print a reverse string
        }
    }
}
