package Translator;

import java.util.Scanner;

public class InputText
{
    public void textReader()
    {
        String inputString = "";
        HashMap hashMap = new HashMap();

        Scanner scanner = new Scanner(System.in);
        try
        {
            while(!userTypedStop(inputString))
            {
                System.out.println("Type 'stop' to stop the program");
                System.out.println("Type morse or characters:");
                inputString = scanner.nextLine();
                char[] inputToChar = MakeChar(inputString);
                for (int i = 0; i < inputToChar.length; i++)
                {
                    if(inputToChar[i] == ' ')
                        System.out.print("/ ");
                    else
                        System.out.print(hashMap.GetMorse(inputToChar[i])
                    + " ");
                }
                System.out.println();
            }
        }
        catch (Exception exception)
        {
            System.out.println("Unexpected error");
        }
        finally
        {
            scanner.close();
        }

    }

    public boolean userTypedStop(String str)
    {
        return str.equalsIgnoreCase("stop");
    }
    public char[] MakeChar(String str)
    {
        //char[] ch = str.toCharArray();
        return str.toCharArray();
    }
}
