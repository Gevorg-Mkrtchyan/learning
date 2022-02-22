package home.company.day14;

import java.util.Locale;
import java.util.Scanner;

public class Day14 {
    Scanner scanner = new Scanner(System.in);

    /**
     * 1.Write a function which returns the length of a given String.
     */
    public void stringLength() {
        String str = scanner.next();
        System.out.println(str.length());
    }

    /**
     * 2.Write a function which returns a character of a given index,from a given String. Pass as a
     * parameters String str, int index
     */
    public void stringChar(String str,int index) {
        if (index > str.length()) {
            System.out.println("enter word");
            str = scanner.next();
            System.out.println("enter index of word");
            index = scanner.nextInt();
            System.out.println(str.charAt(index));
        }
    }
    /**
     * 3.Write a function which checks if the given String contains a given character.Pass as parameters
     * String str, char ch
     */
    public boolean containsStr(String str, char b) {
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
    public int vowelsCount(String str) {
        String[] strings = {"a", "e", "i", "o", "u"};
        String s = str.toLowerCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (s.contains(strings[i])) {
                count++;
            }
        }
        return count;
    }

    /**
     * 5.Write a function called reverseString, which prompts the user for a String, and prints the
     * reverse of the String by extracting and processing each character. The output shall look like:
     * Enter a String: abcdef
     * The reverse of the String &quot;abcdef&quot; is &quot;fedcba&quot;
     */
    public void reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
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
    public double persentOf(int a, int len) {
        return (double) a * 100 / len;
    }

    public void countVowelsDigits(String str) {
        int vowelCount = vowelsCount(str);
        int isDigit = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > '0' && str.charAt(i) <= '9') {
                isDigit++;
            }
        }
        double vowel = persentOf(vowelCount, length);
        double digits = persentOf(isDigit, length);
        System.out.printf("Vowal is %.2f %% , digit is %.2f %%", vowel, digits);
    }

    /**
     * 7.Caesar&#39;s Code is one of the simplest encryption techniques. Each letter in the plaintext is
     * replaced by a letter with some fixed number of positions (n) down the alphabet cyclically. In this
     * exercise, we shall pick n=3. That is, &#39;A&#39; is replaced by &#39;D&#39;, &#39;B&#39; by &#39;E&#39;, &#39;C&#39; by &#39;F&#39;, ..., &#39;X&#39; by
     * &#39;A&#39;, ..., &#39;Z&#39; by &#39;C&#39;.
     * Write a function called caesarCode to cipher Caesar&#39;s code. The program shall prompt the user
     * for a plaintext string consisting of mix-case letters only; compute the ciphertext; and print the
     * ciphertext in uppercase. For example,
     * Enter a plaintext string: Testing
     * The ciphertext string is: WHVWLQJ
     * Hints
     * 1. Use in.next().toUpperCase() to read an input string and convert it into uppercase to reduce the
     * number of cases.
     * 2. You can use a big nested-if with 26 cases (&#39;A&#39;-&#39;Z&#39;). But it is much better to consider &#39;A&#39; to &#39;W&#39; as
     * one case; &#39;X&#39;, &#39;Y&#39; and &#39;Z&#39; as 3 separate cases.
     */
    public void caesarCode(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) + 3);
            if (str.equals("x") || str.equals("y") || str.equals("z")) {
                System.out.println("error");
                return;
            }
            s += ch;
        }
        System.out.println(s);
    }

    /**
     * 8.Write a function to check if the passed String palindrome or not
     * Print “xxx”  is|is not a Palindrome.
     * A word that reads the same backward as forward is called a palindrome, e.g.,
     * "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive).
     */
    public void palindrome() {
        System.out.println("please enter word");
        String str = scanner.next();
        StringBuilder reverseStr = new StringBuilder();
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr.append(str.charAt(i));
        }
        if (str.equalsIgnoreCase(reverseStr.toString())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }

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
        int num = Integer.parseInt(str, 2);
        return num;
    }

    /**
     * 12.Write a function that counts duplicate characters from a given string
     */
    public int countDuplicates(String str) {
        String comparing = " ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && !containsStr(comparing, str.charAt(i))) {
                    count++;
                    comparing += str.charAt(i);
                }
            }
        }
        return count;
    }

    /**
     * 13.Write a function that returns the first non-repeated character from a given string.
     */
    public String firstNonRepeated(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (!containsStr(str.substring(i + 1), str.charAt(i))) {
                return str.charAt(i) + s;
            }
        }
        return s;
    }

    /**
     * 14.Write a function that counts occurrences of a certain character in a given string.
     * Pass as a argument (String str, char ch)
     */
    public int charCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        return count;
    }
}

