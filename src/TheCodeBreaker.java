public class TheCodeBreaker
{
    //This is my field. By putting the String variable here, I make it accessible for the whole class.
    //It is private, so it is only accessible from this class.
    static String alphabet = "abcdefghijklmnopqrstuvwxuz";

    //Because my main is static, everything else needs to be static too.
    // static class means, you can call that method without instanciating that class (without creating an object of that class)
    public static void main(String[] args)
    {

        System.out.println(characterToIndex('s'));

        indexToCharacter(5);

        ceasarCharacterEncoder('o');
    }

    //Method takes a character input and returns the number(int) position.
    public static int characterToIndex(char charIndex)
    {
        //+1 for the alphabet index as it needs to start at 1 and not 0.
        return alphabet.indexOf(charIndex) + 1;
    }

    //Method takes a number(int) and returns the character position in our alphabet.
    public static char indexToCharacter(int numberIndex)
    {
        char result = alphabet.charAt(numberIndex);
        System.out.println(result);
        return result;
    }

    //Everytime I pass a parameter I need to put a type + name in there.
    //Method takes a character and returns a character 3 positions forward in my alphabet.
    public static void ceasarCharacterEncoder(char characterToCharacter)
    {
        int number = characterToIndex(characterToCharacter);


        String test = alphabet.substring(number, number + 3);
        System.out.println(test.substring(test.length() - 1));


    }
}
