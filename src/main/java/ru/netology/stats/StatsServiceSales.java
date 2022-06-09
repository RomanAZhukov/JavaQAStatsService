package ru.netology.stats;


import static java.lang.Long.sum;

public class StatsServiceSales {
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int amountSales(int[] sale) {

        int sum = 0;
        for (long value : sale) {
            sum += value;
        }


        return sum;
    }

    public int averageSales(int[] sale) {

        int average = 0;
        int sum = amountSales(sale);
        for (long value : sale) {

            average = sum / sale.length;

        }


        return average;
    }


    public int minAverageSales(int[] sale) {

        int minAverage = 0;
        int average = averageSales(sale);
        int sum = amountSales(sale);


        for (int t : sale) {
            if (t < average) {
                minAverage = minAverage + 1;
            }


        }


        return minAverage;
    }

    public int maxAverageSales(int[] sale) {

        int maxAverage = 0;
        int average = averageSales(sale);
        int sum = amountSales(sale);


        for (int t : sale) {
            if (t > average) {
                maxAverage = maxAverage + 1;
            }


        }


        return maxAverage;
    }
}

























