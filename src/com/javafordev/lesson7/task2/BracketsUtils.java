package com.javafordev.lesson7.task2;

import java.util.Stack;

public class BracketsUtils {

    public static boolean isBracketsCorrect(String string) {
        boolean isBracketsCorrect = false;
        Stack<Character> brackets = new Stack<>();
        for (char symbol : string.toCharArray()) {
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                brackets.push(symbol); // добавление в стек открывающеи скобки
            } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                if (brackets.isEmpty()) { //если перед добавление закр скобки стек пустои => выходим из цикла
                    isBracketsCorrect = false;
                    break;
                } else {
                    char bracket = brackets.pop(); //забираем с удалением вернии элемент стека
                    if (!isBracketsAreMirrored(bracket, symbol)) { //проверяем зеркальны ли текущии символ из строки и верхнии элемент стека
                        isBracketsCorrect = false;
                    } else {
                        isBracketsCorrect = true;
                    }
                }
            }
        }
        if (!brackets.isEmpty()) { // если после цикла стек не пусто -> проверка не прошла
            isBracketsCorrect = false;
        }
        return isBracketsCorrect;
    }

    public static boolean isBracketsAreMirrored(char openedBracket, char closedBracket) {
        return (openedBracket == '(' && closedBracket == ')') || (openedBracket == '[' && closedBracket == ']') || (openedBracket == '{' && closedBracket == '}');
    }

}
