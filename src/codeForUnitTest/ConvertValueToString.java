package codeForUnitTest;

public class ConvertValueToString {
    String tmp = "";

    public String getWordFromNumber(int number) {
        String[] wordArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        switch (number) {
            case 0 -> tmp = wordArray[0];
            case 1 -> tmp = wordArray[1];
            case 2 -> tmp = wordArray[2];
            case 3 -> tmp = wordArray[3];
            case 4 -> tmp = wordArray[4];
            case 5 -> tmp = wordArray[5];
            case 6 -> tmp = wordArray[6];
            case 7 -> tmp = wordArray[7];
            case 8 -> tmp = wordArray[8];
            case 9 -> tmp = wordArray[9];
            case 10 -> tmp = wordArray[10];
            default -> tmp = "Unexpected value";
        }


        return tmp;
    }


}
