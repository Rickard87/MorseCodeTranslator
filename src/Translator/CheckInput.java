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
                if(!Character.isLetter(input.charAt(i)))
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
                if(character != '.' && character != '*')
                    return false;
            }
        }
        return true;
    }
}