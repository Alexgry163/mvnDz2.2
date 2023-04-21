package ru.netology.services.mvnDz2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RecreationServiceTest {

    @ParameterizedTest
    // @CsvSource({
    //        "3,10000,3000,20000",
    //  "2,100000,60000,150000"
//})
    @CsvFileSource(files = "src/test/resources/CashVocation.csv")
    public void testCashRecreation(int expected, int income, int expenses, int threshold) {
        RecreationService service = new RecreationService();

        // подготавливаем данные:
        //  int expense = 3_000;
        // int income = 10_000;
        //  int threshold = 20_000;
        //  int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    //@Test
    //public void testRelaxVocation() {
    // RecreationService service = new RecreationService();

    // подготавливаем данные:
    //   int expense = 60_000;
    // int income = 100_000;
    //  int threshold = 150_000;
    //  int expected = 2;

    // вызываем целевой метод:
    //  int actual = service.calculate(income, expenses, threshold);

    // Assertions.assertEquals(expected, actual);

    // }
}
