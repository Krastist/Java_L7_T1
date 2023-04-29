package ru.netology.stats;

public class StatsService {
    public int salesAmount(long[] sales) {
        int amount = 0;

        for (long i : sales) {
            amount += i;
        }

        return amount;
    }

    public int avergeAmountSales(long[] sales) {  // Средняя сумма продаж

        return salesAmount(sales) / sales.length;
    }
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int maxSales(long[] sales) {  // Месяц с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int aboveAverge(long[] sales) {
        int aboveAverge = avergeAmountSales(sales);
        int month = 0;

        for (long i : sales) {
            if (i > aboveAverge) {
                month = month + 1;
            }
        }

        return month;
    }

    public int belowAverfe(long[] sales) {
        int belowAverge = avergeAmountSales(sales);
        int month = 0;

        for (long i : sales) {
            if (i < belowAverge) {
                month = month + 1;
            }
        }

        return month;
    }
}
