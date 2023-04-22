package lesson_05;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        String myName1 = "Teo"; //Literal declaration
        String myName2 = "Teo"; //Literal declaration
        String myName3 = new String("Teo"); //Via string object

        System.out.println("myName1 == myName2: " + (myName1 == myName2));
        System.out.println("myName1 == myName3: " + (myName1 == myName3));


        System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
        System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));

        //check lower case, upper case
        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();

        int totalDigits = 0;
        int totalLowerCases = 0;
        int totalUpperCases = 0;

        for (char myCharacter : myCharacters) {
            if (Character.isDigit(myCharacter)) totalDigits++;
            else if (Character.isUpperCase(myCharacter)) totalUpperCases++;
            else if (Character.isLowerCase(myCharacter)) totalLowerCases++;

        }

        System.out.println("totalDigits = " + totalDigits);
        System.out.println("totalUpperCases = " + totalUpperCases);
        System.out.println("totalLowerCases = " + totalLowerCases);

        if (totalDigits > 0 && totalLowerCases > 0 && totalUpperCases > 0) {
            System.out.println("Your Password Is Good");
        } else {
            System.out.println("Invailid Password");
        }

        // Replease || string la  immutable 1 khi dc tao ra ti thay doi duoc no, nhung co ban du lieu goc ko doi nay la clone
        String myBadWord = " Bad, Very Bad, Bad , Good, something";
        String filteredStr = myBadWord.replace("Bad", "b**");
        System.out.println(myBadWord);
        System.out.println(filteredStr);

        // Trim het khoang trang
        System.out.println(myBadWord.trim());

        // Subtring, indexOf, split
        String url = "http://google.com";
        System.out.println(url.length());
        System.out.println(url.indexOf("g"));
        System.out.println(url.indexOf("http:"));
        System.out.println(url.indexOf("http:_"));

        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(2, 5));
        System.out.println(url.substring(2, url.length()));
        System.out.println(url.substring(2));

        // split
        String[] splitStr = url.split("");
        System.out.println(Arrays.toString(splitStr));

        String[] splitStr2 = url.split("://");
        System.out.println(Arrays.toString(splitStr2));

        // Regex | Regular Expression
        String myCookingTime = "    105  min  ";
        // TODO: Pattern and Matcher // nen doc them

        String cookingTimeNumStr = myCookingTime.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr); // nay la string chu so
        System.out.println(Integer.valueOf(cookingTimeNumStr)); // nay la con so

        int cookingTime = Integer.valueOf(cookingTimeNumStr);
        System.out.println("Cooking Time: " + cookingTime + 1);

        System.out.println("Cooking Time: " + (cookingTime + 1)); // (cookingTime + 1) bao tron thi moi tinh toan, khong se la noi chuoi


        // Concatenation
        String s1 = "Hello, ";
        String s2 = "Teo";
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        // String Builder doc them (  noi chuoi lon )
    }
}
