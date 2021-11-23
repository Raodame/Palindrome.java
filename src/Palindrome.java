import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {
        String forward = getInput();
        String forwardChecked = removeCharacters(forward);
        String reversed = reverse(forwardChecked);
        Boolean compare = determineIfPalindrome(forwardChecked, reversed);
        if (compare == true)
            System.out.println("Ignoring spaces, capitalization, and punctuation, \"" + forward + "\" IS a palindrome.");
        else
            System.out.println("Ignoring spaces, capitalization, and punctuation, \"" + forward + "\" IS NOT a palindrome.");
    }

    public static String getInput(){
        return IO.getString("Please enter a word or phrase");
    }

    public static String removeCharacters(String input){
        String newString1 = "";

        if(input.indexOf(" ") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals(" "))
                    newString1 += currentCharacter;
            }
            input = newString1;
        }

        String newString2 = "";
        if(input.indexOf("!") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals("!"))
                    newString2 += currentCharacter;
            }
            input = newString2;
        }

        String newString3 = "";
        if(input.indexOf(".") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals("."))
                    newString3 += currentCharacter;
            }
            input = newString3;
        }

        String newString4 = "";
        if(input.indexOf(",") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals(","))
                    newString4 += currentCharacter;
            }
            input = newString4;
        }

        String newString5 = "";
        if(input.indexOf(":") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals(":"))
                    newString5 += currentCharacter;
            }
            input = newString5;
        }

        String newString6 = "";
        if(input.indexOf(";") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals(";"))
                    newString6 += currentCharacter;
            }
            input = newString2;
        }

        String newString7 = "";
        if(input.indexOf("?") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals("?"))
                    newString7 += currentCharacter;
            }
            input = newString7;
        }

        String newString8 = "";
        if(input.indexOf("(") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals("("))
                    newString8 += currentCharacter;
            }
            input = newString8;
        }

        String newString9 = "";
        if(input.indexOf(")") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals(")"))
                    newString9 += currentCharacter;
            }
            input = newString9;
        }

        String newString10 = "";
        if(input.indexOf("'") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals("'"))
                    newString10 += currentCharacter;
            }
            input = newString10;
        }

        String newString11 = "";
        if(input.indexOf("-") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals("-"))
                    newString11 += currentCharacter;
            }
            input = newString11;
        }

        String newString12 = "";
        if(input.indexOf("\"") != -1){
            for(int x = 0; x < input.length(); x++) {
                String currentCharacter = input.substring(x, x + 1);
                if (!currentCharacter.equals("\""))
                    newString12 += currentCharacter;
            }
            input = newString12;
        }

        return input;
    }

    public static String reverse(String notReversed){
        String reverseInput = new String();
        for(int x = notReversed.length() - 1; x >= 0; x--){
            String currentLetter = notReversed.substring(x, x + 1);
            reverseInput += currentLetter;
        }
        return reverseInput;
    }

    public static boolean determineIfPalindrome(String notReversed, String reversed){
        if (notReversed.equalsIgnoreCase(reversed))
            return true;
        else
            return false;
    }
}
