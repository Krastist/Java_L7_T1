package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void CountSumSeles() {
        StatsService service = new StatsService();
        long[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesAmount(salesAmount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountAvergeAmountSales() {
        StatsService service = new StatsService();
        long[] avergeAmountSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avergeAmountSales(avergeAmountSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountMonthMinSales() {
        StatsService service = new StatsService();
        long[] minSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(minSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountMonthMaxSales() {
        StatsService service = new StatsService();
        long[] maxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(maxSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountMonthAboveAvergeSales() {
        StatsService service = new StatsService();
        long[] aboveAverge = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverge(aboveAverge);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void CountMonthBelowAvergeSales() {
        StatsService service = new StatsService();
        long[] belowAverfe = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverfe(belowAverfe);

        Assertions.assertEquals(expected, actual);
    }
}
