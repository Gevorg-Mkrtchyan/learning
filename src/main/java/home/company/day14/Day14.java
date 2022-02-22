package home.company.day14;

import java.util.Locale;
import java.util.Scanner;

public class Day14 {
    Scanner scanner = new Scanner(System.in);

    /**
     * 1.Write a function which returns the length of a given String.
     */
    public int stringLength(String str) {
        return str.length();
    }


    /**
     * 2.Write a function which returns a character of a given index,from a given String. Pass as a
     * parameters String str, int index
     */
    public char aChar(String str, int index) {
        if (index >= str.length() || index < 0) {
            System.out.println("invalid" + index);
            return ' ';
        }
        return str.charAt(index);
    }

    /**
     * 3.Write a function which checks if the given String contains a given character.Pass as parameters
     * String str, char ch
     */
    public boolean containsChar(String str, char b) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == b) {
                return true;
            }
        }
        return false;
    }

    /**
     * 4.Write a function which returns the count of vowels of a given String
     * - - write also an overloaded function which returns count of constants.
     */
    public int vowelCount(String str) {
        int count = 0;
        String s = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }

    /**
     * 5.Write a function called reverseString, which prompts the user for a String, and prints the
     * reverse of the String by extracting and processing each character. The output shall look like:
     * Enter a String: abcdef
     * The reverse of the String &quot;abcdef&quot; is &quot;fedcba&quot;
     *
     * @return
     */
    public String reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        return str;
    }

    /**
     * 6.Write a program called countVowelsDigits, which get as parameter a String, counts the
     * number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints
     * the counts and the percentages (rounded to 2 decimal places). For example`
     * <p>
     * <p>
     * <p>
     * Enter a String: testing12345
     * Number of vowels: 2 (16.67%)
     * Number of digits: 5 (41.67%)
     */
    public int digitsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    count++;
                    break;
            }
        }
        return count;
    }

    public double persentOf(int a, int len) {
        return (double) a * 100 / len;
    }

    public void countVowelsDigits(String str) {
        int digitCount = digitsCount(str);
        int vowelCount = vowelCount(str);
        int len = str.length();
        double digit = persentOf(digitCount, len);
        double vowel = persentOf(vowelCount, len);
        System.out.printf("Vowel is %.2f %% , digit is %.2f %%", vowel, digit);
    }

    /**
     * 7.Caesar's Code is one of the simplest encryption techniques. Each letter in
     * the plaintext is replaced by a letter with some fixed number of positions (n) down the alphabet cyclically.
     * In this exercise, we shall pick n=3. That is, 'A' is replaced by 'D', 'B' by 'E', 'C' by 'F', ..., 'X' by 'A', ...,
     * 'Z' by 'C'.
     * Write a function called caesarCode to cipher Caesar's code. The program shall prompt the user for a plaintext
     * string consisting of mix-case letters only; compute the ciphertext; and print the ciphertext in uppercase.
     * For example,
     * Enter a plaintext string: Testing
     * The ciphertext string is: WHVWLQJ
     * Hints
     * Use in.next().toUpperCase() to read an input string and convert it into uppercase to reduce the number of cases.
     * You can use a big nested-if with 26 cases ('A'-'Z'). But it is much better to consider 'A' to 'W' as one
     * case; 'X', 'Y' and 'Z' as 3 separate cases.
     */
    public void caesarCode(String str, int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 122 - n) {
                output.append((char) (str.charAt(i) + n));
            } else {
                int dif = n - (122 - str.charAt(i) + 1);
                output.append((char) (97 + dif));
            }
        }
        System.out.println(output.toString().toUpperCase(Locale.ROOT));
    }

    /**
     * 8.Write a function to check if the passed String palindrome or not
     * Print “xxx”  is|is not a Palindrome.
     * A word that reads the same backward as forward is called a palindrome, e.g.,
     * "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive).
     */
    public boolean palindrome(String str) {
        return str.equalsIgnoreCase(reverseString(str));
    }

    /**
     * 9.The binary number system uses 2 symbols, 0 and 1. Write a function called checkBinStr to verify
     * a binary string. The program shall prompt the user for a binary string; and decide if the input string is a
     * valid binary string. For example, Enter a binary string: 10101100 "10101100" is a binary string
     * Enter a binary string: 10120000 "10120000" is NOT a binary string
     */
    public boolean checkBinStr(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '1') {
                return false;
            }
        }
        return true;
    }

    /**
     * 10.The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f). Write a program to verify
     * a hex string. The function gets a hex string; and decides if the input string is a valid hex string. For examples,
     * Enter a hex string: 123aBc  "123aBc" is a hex string  Enter a hex string: 123aBcx
     * "123aBcx" is NOT a hex string
     */
    public boolean hexadecimal(String str) {
        String s = str.toLowerCase(Locale.ROOT);
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) < '0' && str.charAt(i) > '9'
                    && s.charAt(i) < 'a' || s.charAt(i) > 'f') {
                return false;
            }
        }
        return true;
    }

    /**
     * 11.Write a function called bin2Dec to convert an input binary string into its equivalent decimal number.
     * Your output shall look like:
     * Enter a Binary string: 1011
     * The equivalent decimal number for binary "1011" is: 11
     * Enter a Binary string: 1234
     * error: invalid binary string "1234"
     */
    public int binaryConvertToDecimal(String str) {
        boolean isBim = checkBinStr(str);
        if (isBim) {
            int dec = 0;
            int power = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == '1') {
                    dec += Math.pow(2, power);
                }
                power++;
            }
            System.out.print(str + " is ");
            return dec;
        }
        return -1;
    }

    /**
     * 12.Write a function that counts duplicate characters from a given string
     */
    public int countDuplicates(String str) {
        String comparing = "";
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && !containsChar(comparing, str.charAt(i))) {
                    comparing += str.charAt(i);
                }
            }
        }
        return comparing.length();
    }

    /**
     * 13.Write a function that returns the first non-repeated character from a given string.
     */
    public char firstNonRepeated(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!containsChar(str.substring(i + 1), str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return ' ';
    }

    /**
     * 14.Write a function that counts occurrences of a certain character in a given string.
     * Pass as a argument (String str, char ch)
     */
    public int charCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

