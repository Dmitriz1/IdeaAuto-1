package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainExactBoundary() {
        // Проверяет, что если сумма равна 1000, то возврат будет 0
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(1000);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testRemainJustBelowBoundary() {
        // Проверяет, что если сумма 900, то нужно докупить 100
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(900);
        Assert.assertEquals(result, 100);
    }

    @Test
    public void testRemainMultipleOfBoundary() {
        // Проверяет, что сумма 2000 также возвращает 0, так как она кратна 1000
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(2000);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testRemainAboveBoundary() {
        // Проверяет, что если сумма 2500, то нужно докупить 500
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(2500);
        Assert.assertEquals(result, 500);
    }

    @Test
    public void testRemainNegativeAmount() {
        // Проверяет, как сервис обрабатывает отрицательные значения. Если amount меньше нуля,
        // то программа должна выводить значение нужно для достижения нуля
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(-500);
        Assert.assertEquals(result, 500);
    }
}