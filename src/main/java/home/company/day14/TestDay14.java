package home.company.day14;

public class TestDay14 {
    public static void main(String[] args) {
        Day14 day14 = new Day14();
        System.out.println(day14.stringLength("qwerty"));
        System.out.println( day14.aChar("qwe",0));  //task 2
        System.out.println(day14.containsChar("qwerty", 'i'));//task3
        System.out.println(day14.vowelCount("ssssrefdidfjeioeif")); //task 4
        day14.reverseString("qwerty");//task5/
        day14.countVowelsDigits("testing12345");//task6
        day14.caesarCode("z",3);//task7
        day14.palindrome(" dad");//task8
        System.out.println(day14.checkBinStr("0101010101")); //task9
        System.out.println(day14.hexadecimal("123a"));//task10
        System.out.println(day14.binaryConvertToDecimal("101"));//task11
        System.out.println(day14.countDuplicates("qwerrtttyy")); //task12
        System.out.println(day14.firstNonRepeated("qwewq"));//task 13
        System.out.println(day14.charCount("qqwweerrrrii", 'r')); // task14
    }
}
