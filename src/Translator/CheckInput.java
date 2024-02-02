package Translator;

public class CheckInput {
    String input;
    public CheckInput(String input)
    {
        this.input = input;
    }
    public String CheckType()
    {
        String type;
        if(IsLetters(input))
        {
            type = "onlyLetters";
        }
        else if (IsMorse(input))
        {
            type = "onlyMorse";
        }
        else if (IsMixed(input))
        {
            type = "morseAndLetters";
        }
        else
        {
            type = "error";
        }
        return type;
    }
    public Boolean IsLetters(String input)
    {
        if(input == null)
            return false;
        else
        {
            for (int i = 0; i < input.length(); i++)
            {
                if(!Character.isLetter(input.charAt(i)) && !Character.isSpaceChar(input.charAt(i)))
                    return false;
            }
        }
        return true;
    }
    public Boolean IsMorse(String input)
    {
        if(input == null)
            return false;
        else
        {
            char character;
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i);
                if(character != '.' && character != '-' && character != '/' && !Character.isSpaceChar(character))
                    return false;
            }
        }
        return true;
    }
    public Boolean IsMixed(String input)
    {
        if(input == null)
            return false;
        else
        {
            char character;
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i);
                if(character != '.' && character != '-' && !Character.isLetter(character) && !Character.isSpaceChar(character))
                    return false;
            }
        }
        return true;
    }
}