package Translator;

import org.junit.Assert;
import org.junit.Test;

public class TestMorseCodeTranslator {
    @Test
    public void ContainsOnlyLetters()
    {
        int i = 555;
        String inputString = "this is a test" + i;
        CheckInput transOutput = new CheckInput(inputString);
        String Expected = "error";
        String Actual = transOutput.CheckType();
        Assert.assertEquals(Expected,Actual);
    }
    @Test
    public void TranslateToMorse()
    {
        CreateHashMapMorseData hashMaps = new CreateHashMapMorseData();
        String Actual = hashMaps.GetMorse('g');
        String Expected = "--.";
        Assert.assertEquals(Expected, Actual);
    }
    @Test
    public void TranslateToCharacter()
    {
        CreateHashMapMorseData hasMaps = new CreateHashMapMorseData();
        char Actual = hasMaps.GetCharacter("--.");
        char Expected = 'g';
        Assert.assertEquals(Expected, Actual);
    }
}
