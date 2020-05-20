package kyu6.DetectPangram;

public class PangramChecker {
    public boolean check(String sentence) {
        //code

        //lista wszystkich znaków alfabetu

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};
        boolean isPangram = false;
        boolean isCharInSentence = false;

        sentence = sentence.replaceAll("[^A-Za-z0-9]", "");
        //dla każdego znaku z listy
        for (char character : alphabet) {


            //dla każdego znaku ze zdania
            char[] sentenceChars = sentence.toCharArray();
            for (char sentenceChar : sentenceChars) {

                //porównaj znaki
                if (character == sentenceChar || Character.toLowerCase(character) == sentenceChar) {
                    isCharInSentence = true;
                    System.out.println("character " + character + " equal to " + sentenceChar);
                    break;
                } else {
                    System.out.println("character " + character + " NOT equal to " + sentenceChar);
                    isCharInSentence = false;
                }
            }

            if (isCharInSentence == false) {
                System.out.println("### Cacharcter not found: " + character);
                isPangram = false;
                break;
            } else {
                isPangram = true;
            }
        }
        return isPangram;
    }
}
