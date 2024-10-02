/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personal_finance_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Khutjo Mamabolo
 */
public class Finance_Manager {

    private double budget, savingsGoal;
    private List<Double> incomes, expenses, savingsGoals;  // Store multiple incomes and expenses
    private String name, date;
    private Scanner scanner = new Scanner(System.in);

    public Finance_Manager() {
        budget = 0.0;
        savingsGoal = 0.0;
        incomes = new ArrayList<>(); // Initializing the list to avoid NullPointerException
        expenses = new ArrayList<>();
        savingsGoals = new ArrayList<>();

    }

    public void addIncome() {
        System.out.println("========================================" + "\n" + "ADD INCOME");
        System.out.println("How many Income sources do you have? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter source of Income: ");
            name = scanner.nextLine();

            System.out.print("Enter Income Amount: R");
            double income = scanner.nextDouble();
            scanner.nextLine(); // consuming the new line

            incomes.add(income);  // Add the income to the list

            System.out.print("Enter date of Income (DAY/MONTH/YEAR): ");
            date = scanner.nextLine();

            System.out.println("INCOME ADDED" + "\n" + "========================================");
        }
    }

    public void addExpense() {
        System.out.println("========================================" + "\n" + "ADD EXPENSE");
        System.out.println("How many Expenses do you Have? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Source of Expense: ");
            String expenseName = scanner.nextLine();

            System.out.print("Enter Expense: R");
            double expense = scanner.nextDouble();
            scanner.nextLine(); // consuming the newline
            expenses.add(expense); // adding the expense to the list

            System.out.print("Enter date of Expense (DAY/MONTH/YEAR): ");
            date = scanner.nextLine();

            System.out.println("EXPENSE ADDED");
        }
    }

    public void viewBudget() {
        double totalIncome = incomes.stream().mapToDouble(Double::doubleValue).sum(); // calculating the Sum of all Incomes 
        double totalExpenses = expenses.stream().mapToDouble(Double::doubleValue).sum(); // calculating the Sum of all Incomes
        budget = totalIncome - totalExpenses;

        System.out.println("========================================");
        System.out.println("BUDGET OVERVIEW");
        System.out.println("Total Income: R" + totalIncome);
        System.out.println("Total Expenses: R" + totalExpenses);
        System.out.println("Remaining Budget: R" + budget);
        System.out.println("========================================");
    }

    public void savingsGoals() {
        System.out.println("========================================" + "\n" + "ADD SAVINGS GOAL");
        System.out.println("How many Savings Goals do you have? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter name of savings goal: ");
            String goalName = scanner.nextLine(); 

            System.out.print("Enter amount you want to save for " + goalName + ": R");
            double goalAmount = scanner.nextDouble(); 
            scanner.nextLine(); 

            // Add the goal to the list
            savingsGoals.add(goalAmount);

            System.out.println(goalName + " savings goal of R" + goalAmount + " added.");
        }

        System.out.println("========================================");
    }
}
