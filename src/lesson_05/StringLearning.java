package lesson_05;

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
            if(Character.isDigit(myCharacter)) totalDigits++;
            else if(Character.isUpperCase(myCharacter)) totalUpperCases++;
            else if (Character.isLowerCase(myCharacter)) totalLowerCases++;

        }

        System.out.println("totalDigits = " + totalDigits);
        System.out.println("totalUpperCases = " + totalUpperCases);
        System.out.println("totalLowerCases = " + totalLowerCases);

        if(totalDigits > 0 && totalLowerCases > 0 && totalUpperCases > 0){
            System.out.println("Your Password Is Good");
        } else {
            System.out.println("Invailid Password");
        }

        // Replease || string la  immutable 1 khi dc tao ra ti thay doi duoc no, nhung co ban du lieu goc ko doi nay la clone
        String myBadWord = " Bad, Very Bad, Bad , Good, something";
        String filteredStr = myBadWord.replace("Bad", "b**");
        System.out.println(myBadWord);
        System.out.println(filteredStr);


    }
}
