package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceSalesTest {
    @Test
    public void shouldFindMinSales() {
        StatsServiceSales service = new StatsServiceSales();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sale);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsServiceSales service = new StatsServiceSales();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sale);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindAmountSales() {
        StatsServiceSales service = new StatsServiceSales();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountSales = 180;
        int actualAmountSales = service.amountSales(sale);

        Assertions.assertEquals(expectedAmountSales, actualAmountSales);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsServiceSales service = new StatsServiceSales();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSales = 15;
        int actualAverageSales = service.averageSales(sale);


        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldFindMinAverageSales() {
        StatsServiceSales service = new StatsServiceSales();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAverageSales = 5;
        int actualMinAverageSales = service.minAverageSales(sale);


        Assertions.assertEquals(expectedMinAverageSales, actualMinAverageSales);
    }
}



