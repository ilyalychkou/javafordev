package com.javafordev.lesson7.task2;

public class BracketsRunner {

    public static void main(String[] args) {
        String validStringWithBrackets = "({[(world)(hello)](87)})";
        System.out.println(validStringWithBrackets);
        System.out.println(BracketsUtils.isBracketsCorrect(validStringWithBrackets));

        String invalidStringWithBrackets = "({[()[(*)]()})"; // тестовые значения - пусто, "{", "{}[", ")", ")("
        System.out.println(invalidStringWithBrackets);
        System.out.println(BracketsUtils.isBracketsCorrect(invalidStringWithBrackets));
    }
}
