package codeForUnitTest;

import java.util.Scanner;

public class NumbToWordRunner {
    public static void main(String[] args) {

        Scanner inPutValue = new Scanner(System.in);
        ConvertValueToString numbConvert = new ConvertValueToString();

        int numberFromConsole = 0;
        System.out.println("input Value: 0~10");
        numberFromConsole = inPutValue.nextInt();

       System.out.println(numbConvert.getWordFromNumber(numberFromConsole));
    }

}
