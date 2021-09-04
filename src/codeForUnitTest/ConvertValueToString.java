package codeForUnitTest;

public class ConvertValueToString {
    String tmp = "";

    public String getWordFromNumber(int number) {
        String[] wordArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        switch (number) {
            case 0: tmp = wordArray[0]; break;
            case 1 : tmp = wordArray[1];break;
            case 2 : tmp = wordArray[2];break;
            case 3 : tmp = wordArray[3];break;
            case 4 : tmp = wordArray[4];break;
            case 5 : tmp = wordArray[5];break;
            case 6 : tmp = wordArray[6];break;
            case 7 : tmp = wordArray[7];break;
            case 8 : tmp = wordArray[8];break;
            case 9 : tmp = wordArray[9];break;
            case 10 : tmp = wordArray[10];break;
            default : tmp = "Unexpected value";
        }


        return tmp;
    }


}
