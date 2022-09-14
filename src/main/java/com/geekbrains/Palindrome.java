package com.geekbrains;

public class Palindrome {
    // Метод принимает на входе текст и проверяет его на палиндром, возвращает true or false

    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Zа-яА-Я0-9]",""); // удаляем из вх.строки все лишние спецсимволы
        String strReverse = new StringBuilder(str).reverse().toString(); // переворачиваем строку
        return str.equalsIgnoreCase(strReverse) ; // сравневаем 2 строки, игнорируя регистр
    }
}
