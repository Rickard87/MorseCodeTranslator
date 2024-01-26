package Translator;

import java.util.Scanner;

public class InputText
{
    public void textReader()
    {
        String inputString = "";
        Scanner scanner = new Scanner(System.in);
        try
        {
            while(!userTypedStop(inputString))
            {
                inputString = scanner.nextLine();
                System.out.println(inputString);
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
}
