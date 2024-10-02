/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personal_finance_manager;

/**
 *
 * @author Khutjo Mamabolo
 */
public class FinancialRecord{
private String name, date;
    private double amount;

    // Constructor to initialize the financial record
    public FinancialRecord(String name, double amount, String date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    // Method to display the report of this financial record
    public void displayRecord() {
        System.out.println("========================================");
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
        System.out.println("========================================");
    }
    
}
