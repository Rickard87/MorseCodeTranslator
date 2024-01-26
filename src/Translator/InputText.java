package Translator;

import java.util.Scanner;

public class InputText
{
    public static String inputString;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text");
        inputString = scan.nextLine();
        System.out.println(inputString);
    }

}
