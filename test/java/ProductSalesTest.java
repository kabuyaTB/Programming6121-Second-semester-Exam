/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import com.mycompany.productsalesreports.ProductSales;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductSalesTest {

    private final int[][] sales = {
        {300, 150, 700},  // Year 1
        {250, 200, 600}   // Year 2
    };

    private final ProductSales productSales = new ProductSales();

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        int expected = 2200;
        int actual = productSales.TotalSales(sales);
        assertEquals(expected, actual, "Total sales should be 2200");
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        double expected = 2200.0 / 6.0; // 366.666...
        double actual = productSales.AverageSales(sales);
        assertEquals(expected, actual, 0.0001, "Average should be 2200/6");
    }

    @Test
    public void MaxSale_ReturnsMaximumSale() {
        int expected = 700;
        int actual = productSales.MaxSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void MinSale_ReturnsMinimumSale() {
        int expected = 150;
        int actual = productSales.MinSale(sales);
        assertEquals(expected, actual);
    }
}