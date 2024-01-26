import Translator.CreateHashMapMorseData;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        CreateHashMapMorseData crhsmmd = new CreateHashMapMorseData();
        String str = crhsmmd.GetMorse('a');
        System.out.println(str);
        char ch = crhsmmd.GetCharacter("--.");
        System.out.println(ch);
    }
}