package com.geekbrains;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PalindromeTest {
    private static Palindrome palindrome;

    @BeforeAll
    static void beforeAll() {
        palindrome = new Palindrome();
    }
    @Test
    @DisplayName("Базовый сценарий : 'Заказ'")
    void baseTest() {
        Boolean test = palindrome.isPalindrome("Заказ");
        assertThat(test).isTrue();
    }
    @Test
    @DisplayName("Сценарий без текста")
    void EmptyTest() {
        Boolean test = palindrome.isPalindrome("");
        assertThat(test).isTrue();
    }
    @Test
    @DisplayName("Сценарий с игнор. пробелов, зпт. и спец.символов: 'Madam, I'm Adam'")
    void baseTestIgnore() {
        Boolean test = palindrome.isPalindrome("Madam, I'm Adam");
        assertThat(test).isTrue();
    }

    @Test
    @DisplayName("Невалидный сценарий: 'Азор сьел розу на лапе' ")
    void invalidTest() {
        Boolean test = palindrome.isPalindrome("Азор сьел розу на лапе");
        assertThat(test).isFalse();
    }

}
