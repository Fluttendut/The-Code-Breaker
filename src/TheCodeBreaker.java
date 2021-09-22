public class TheCodeBreaker
{
    //this is a field
    static String alphabet = "abcdefghijklmnopqrstuvwxuz";

    //Because my main is static, everything else needs to be static too. Else it breaks.
    public static void main(String[] args)
    {
        char input = 'b';
        System.out.println(characterToIndex(input));

        indexToCharacter(5);

        ceasarCharacterEncoder('o');
        //String test = alphabet.substring(2, alphabet.length());
        //System.out.println(test.substring(test.length() - 1));

        //System.out.println(test);
    }

    public static int characterToIndex(char charIndex)
    {
        //altid +1 for index hos alphabet
        return alphabet.indexOf(charIndex) + 1;
    }

    public static char indexToCharacter(int numberIndex)
    {
        char result = alphabet.charAt(numberIndex);
        System.out.println(result);
        return result;
    }

    // static class means, you can call that method without instanciating that class (without creating an object of that class)
    //Everytime I pass a parameter I need to put a type + name in there.
    public static void ceasarCharacterEncoder(char characterToCharacter)
    {
        int number = characterToIndex(characterToCharacter);

        //I want to know why it can't be 3 and without -1
        String test = alphabet.substring(number, number + 3);
        System.out.println(test.substring(test.length() - 1));


    }
}
