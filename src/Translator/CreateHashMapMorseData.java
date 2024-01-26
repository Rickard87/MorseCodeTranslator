package Translator;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateHashMapMorseData {
        Map<Character, String> morse = new HashMap<>();
        Map<String, Character> english = new HashMap<>();
        public CreateHashMapMorseData()
        {
                FillMorseHashMap();
        }
        public String GetMorse(char ch)
        {
                return morse.get(ch);
        }
        public Character GetCharacter(String str)
        {
                return english.get(str);
        }
        public void FillMorseHashMap()
        {
                //Vi fyller keys med values
                morse.put('a', ".-");
                morse.put('b', "-...");
                morse.put('c',  "-.-.");
                morse.put('d',  "-..");
                morse.put('e',    ".");
                morse.put('f', "..-.");
                morse.put('g',  "--.");
                morse.put('h', "....");
                morse.put('i',   "..");
                morse.put('j', ".---");
                morse.put('k',   "-.-");
                morse.put('l', ".-..");
                morse.put('m',   "--");
                morse.put('n',   "-.");
                morse.put('o',  "---");
                morse.put('p', ".--.");
                morse.put('q', "--.-");
                morse.put('r', ".-.");
                morse.put('s',  "...");
                morse.put('t',   "-");
                morse.put('u',  "..-");
                morse.put('v', "...-");
                morse.put('w',  ".--");
                morse.put('x', "-..-");
                morse.put('y', "-.--");
                morse.put('z', "--..");
                morse.put('1', ".----");
                morse.put('2',"..---");
                morse.put('3', "...--");
                morse.put('4', "....-");
                morse.put('5', ".....");
                morse.put('6', "-....");
                morse.put('7', "--...");
                morse.put('8', "---..");
                morse.put('9', "----.");
                morse.put('0', "-----");
                morse.put('.', ".-.-.-");
                morse.put(',', "--..--");
                morse.put('?', "..--..");

                //Så länge alla värden är unika
                english =
                        morse.entrySet()
                        .stream()
                        .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        }
}
