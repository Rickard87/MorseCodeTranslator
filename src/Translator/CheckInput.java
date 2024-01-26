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
}