package Translator;

import org.junit.Assert;
import org.junit.Test;

public class TestMorseCodeTranslator {
    @Test
    public void ContainsOnlyLetters()
    {
        int i = 555;
        String inputString = "this is a test" + i + "/-";
        CheckInput transOutput = new CheckInput(inputString);
        String Expected = "error";
        String Actual = transOutput.CheckType();
        Assert.assertEquals(Expected,Actual);
    }
    @Test
    public void ContainsOnlyMorse()
    {
        String inputString = "-.-....-...";
        CheckInput transOutput = new CheckInput(inputString);
        String Expected = "onlyMorse";
        String Actual = transOutput.CheckType();
        Assert.assertEquals(Expected, Actual);
    }
    @Test
    public void ContainsMixedMorseAndLetters()
    {
        String inputString = "-.Aa";
        CheckInput transOutput = new CheckInput(inputString);
        String Expected = "morseAndLetters";
        String Actual = transOutput.CheckType();
        Assert.assertEquals(Expected, Actual);
    }
    @Test
    public void TranslateToMorse()
    {
        HashMap hashMaps = new HashMap();
        String Actual = hashMaps.GetMorse('g');
        String Expected = "--.";
        Assert.assertEquals(Expected, Actual);
    }
    @Test
    public void TranslateToCharacter() {
        HashMap hasMaps = new HashMap();
        char Actual = hasMaps.GetCharacter("--.");
        char Expected = 'g';
        Assert.assertEquals(Expected, Actual);
    }
    @Test
    public void CheckForStopInput()
    {
        InputOutputText inputOutputText = new InputOutputText();
        Assert.assertFalse(inputOutputText.userTypedStop("hElLo"));
        Assert.assertTrue(inputOutputText.userTypedStop("sToP"));
    }
}