package Translator;

import java.util.Scanner;

public class InputText
{
    public String inputString;
    public boolean isStop;
    public InputText()
    {
        Scanner scan = new Scanner(System.in);
        while (!isStop)
        {
            System.out.println("Enter text");
            inputString = scan.nextLine();

            if(inputString.equalsIgnoreCase("stop"))
                isStop = true;
            else
            {
                System.out.println(inputString);
            }
        }
    }

}
