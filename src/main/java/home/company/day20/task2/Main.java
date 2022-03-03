package home.company.day20.task2;

/**
 * 2.Write a java program`
 * -        -        has a Language interface with getName(String) method
 * -        -        has a ProgrammingLanguage which implements an interface Language, and overrides getName method
 * -        -        has a English language which implements an interface Language, and overrides getName method
 */
public class Main {
    public static void main(String[] args) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        EnglishLanguage englishLanguage = new EnglishLanguage();
        System.out.println(programmingLanguage.getName(""));
        System.out.println(englishLanguage.getName(""));

    }
}
