package home.company.day14;

public class TestDay14 {
    public static void main(String[] args) {
        Day14 day14 = new Day14();
        day14.stringLength(); //task1
        day14.stringChar();  //task 2
        System.out.println(day14.containsStr("qwerty", 'p'));//task3
        day14.vowelsCount("ssssrefdidfjeioeif");//task4
        day14.reverseString("qwerty");//task5
        day14.countVowelsDigits("qwerty333");//task6
        day14.caesarCode("z");//task7
        day14.palindrome();//task8
        System.out.println(day14.checkBinStr("0101010101")); //task9
        System.out.println(day14.hexadecimal("123a"));//task10
        System.out.println(day14.binaryConvertToDecimal("101"));//task11
        System.out.println(day14.countDuplicates("qwertty")); //task12
        System.out.println(day14.firstNonRepeated("qwewq"));//task 13
        System.out.println(day14.charCount("qqwweerrr", 'r')); // task14
    }
}
