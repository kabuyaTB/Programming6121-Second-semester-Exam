/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreports;

/**
 *
 * @author Kabuy
 */
public class ProductSales implements Iproduct{
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }
        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int total = 0;
        int count = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
                count++;
            }
        }
        if (count == 0) return 0.0;
        return (double) total / count;
    }

    @Override
    public int MaxSale(int[][] productSales) {
        if (productSales == null || productSales.length == 0 || productSales[0].length == 0) {
            throw new IllegalArgumentException("productSales cannot be empty");
        }
        int max = productSales[0][0];
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > max) max = sale;
            }
        }
        return max;
    }

    @Override
    public int MinSale(int[][] productSales) {
        if (productSales == null || productSales.length == 0 || productSales[0].length == 0) {
            throw new IllegalArgumentException("productSales cannot be empty");
        }
        int min = productSales[0][0];
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < min) min = sale;
            }
        }
        return min;
    }
    
}
