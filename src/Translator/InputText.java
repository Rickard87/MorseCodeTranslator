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
                inputString = scanner.nextLine().toLowerCase();
                CheckInput checkInput = new CheckInput(inputString);
                String checkInputType = checkInput.CheckType();
                char[] inputToChar = MakeChar(inputString);
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
                        String[] separatedMorseWords = inputString.split("/");
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
                        System.out.println("mixed");
                        String[] separatedWords = inputString.split("[ /]");
                        for(String word : separatedWords)
                        {
                            char[] wordToCharArray = word.toCharArray();
                            if(Character.isLetter(wordToCharArray[0]))
                            {
                                for (int i = 0; i < wordToCharArray.length; i++)
                                {
                                    if(inputToChar[i] == ' ')
                                        System.out.print("/ ");
                                    else
                                        System.out.print(hashMap.GetMorse(wordToCharArray[i])
                                                + " ");
                                }
                            }
                            else if (wordToCharArray[0] == '.' || wordToCharArray[0] == '-')
                            {
                                for (int i = 0; i < wordToCharArray.length; i++) {

                                    if (!word.equals("/"))
                                        System.out.print(hashMap.GetCharacter(word));
                                }

                                System.out.print(" ");
                            }
                        }
                        break;
                }

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
}
