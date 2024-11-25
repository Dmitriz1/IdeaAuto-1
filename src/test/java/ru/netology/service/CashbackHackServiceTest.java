package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainJustBelowBoundary() {
        // Проверяет, что если сумма 900, то нужно докупить 100
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(900);
        Assert.assertEquals(100, result);
    }

    @Test
    public void testRemainMultipleOfBoundary() {
        // Проверяет, что сумма 2000 также возвращает 0, так как она кратна 1000
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(2000);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testRemainAboveBoundary() {
        // Проверяет, что если сумма 2500, то нужно докупить 500
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(2500);
        Assert.assertEquals(500, result);
    }

    @Test
    public void testRemainNegativeAmount() {
        // Проверяет, как сервис обрабатывает отрицательные значения. Если amount меньше нуля,
        // то программа должна выводить значение нужное для достижения нуля
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(-500);
        Assert.assertEquals(500, result);
    }
}
