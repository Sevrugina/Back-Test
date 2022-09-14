package com.geekbrains;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TriangleTest {
    @ParameterizedTest
    @DisplayName("Проверка валидности треугольника c валидными сторонами")
    @ValueSource(strings = {"3, 3, 3", "8, 4, 5"})
    void ValidData(String data) {
        Triangle AreaTriangle;
        boolean result = Triangle.isTriangleValid(data);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @DisplayName("Проверка валидности треугольника с невалидными сторонами")
    @ValueSource(strings = {"0, 3, 3", "-5, 3, 3", "1, 4, 5"})
    void NoValidData(String data) {
        boolean result = Triangle.isTriangleValid(data);
        Assertions.assertFalse(result);
    }
}
