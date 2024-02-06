package Translator;

import java.util.Scanner;

public class InputOutputText
{
    public void textReader()
    {
        String inputString = "";

        Scanner scanner = new Scanner(System.in);
        try
        {
            while(!userTypedStop(inputString))
            {
                System.out.println("Type 'stop' to stop the program");
                System.out.println("Type morse or characters:");
                inputString = scanner.nextLine().toLowerCase();
                OutPut(inputString);

                System.out.println();
            }
        }
        //Vi vill aldrig göra exceptions på saker vi kan hantera /Rickard
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
    public void OutPut(String input)
    {
        CheckInput checkInput = new CheckInput(input);
        String checkInputType = checkInput.CheckType();
        HashMap hashMap = new HashMap();
        char[] inputToChar = MakeChar(input);

        switch (checkInputType)
        {
            case "onlyLetters":
                for (int i = 0; i < inputToChar.length; i++)
                {
                    if(inputToChar[i] == ' ')
                        System.out.print("/ ");
                    else
                        System.out.print(hashMap.GetMorse(inputToChar[i])
                                + " ");
                }
                break;
            case "onlyMorse":
                String[] separatedMorseWords = input.split("/");
                for(String morseWord : separatedMorseWords)
                {
                    String[] separatedMorseLetters = morseWord.split(" ");
                    for(String morseLetter : separatedMorseLetters)
                    {
                        if(!morseLetter.equals(" ") && !morseLetter.isEmpty())
                            System.out.print(hashMap.GetCharacter(morseLetter));
                    }
                    System.out.print(" ");
                }
                break;
            case "morseAndLetters":
                System.out.println("You have mixed characters in your entry. Please input either characters or morse only.");
                break;
            case "error":
                System.out.println("Your entry does not match anything we can translate. Please try again.");
                break;
        }
    }
}
