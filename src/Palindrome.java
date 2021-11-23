import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {
        String forward = getInput();
        String forwardChecked = removeCharacters(forward);

    }

    public static String getInput(){
        return IO.getString("Please enter a word or phrase");
    }

    public static String removeCharacters(String input){
        String y;
        String newString = "";
        if(input.indexOf(" ") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals(" "))
                    newString += currentCharacter;
            }
            y = newString;
        }
        else
            y = input;

        String punctuation = "!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?`~";
        if(y.indexOf(punctuation) != -1) {
            for (int x = 0; x < y.length(); x++) {
                String currentCharacter = y.substring(x, x + 1);
                if (!currentCharacter.equals(punctuation))
                    newString += currentCharacter;
            }
            y = newString;
        }
        return y;
    }

    public static String reverse(String notReversed){
        String reverseInput = new String();
        for(int x = notReversed.length() - 1; x >= 0; x--){
            String currentLetter = notReversed.substring(x, x + 1);
            reverseInput += currentLetter;
        }
        return reverseInput;
    }

//    public static boolean determineIfPalindrome(String notReversed, String reversed){
////        String x = "Hello";
////        x.toLowerCase(Locale.ROOT);
//    }
}
