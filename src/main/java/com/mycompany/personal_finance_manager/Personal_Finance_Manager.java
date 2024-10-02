/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personal_finance_manager;
import java.util.Scanner;
/**
 *
 * @author Khutjo Mamabolo
 */
public class Personal_Finance_Manager {

    public static void main(String[] args) {
        Finance_Manager Logic = new Finance_Manager();
        Scanner scanner =  new Scanner(System.in);
        System.out.println("========================================"+"\n"+"WELCOME TO THE FINANCE MANAGEMENT SYSTEM");
        System.out.println("We're here to help you :)"+"\n"+ "========================================");
        System.out.println("Enter (1) to enter the program, or any key to exit the program");
        int userInput = scanner.nextInt();
        
        while (userInput ==1){
            System.out.println("========================================"+"\n"+
                    "Please select one of the following menu items: " + "\n"
                    + "(1) Add Income" + "\n"
                    + "(2) Add Expense" + "\n"
                    + "(3) View Budget" + "\n"
                    + "(4) Set Savings Goal" + "\n"
                    + "(5) Exit");
            
            int Choice = scanner.nextInt();
            
            switch(Choice){
                case 1:
                    Logic.addIncome();
                    break;
                    
                case 2:
                    Logic.addExpense();
                    break;
                    
                case 3:
                    Logic.viewBudget();
                    break;
                    
                case 4:
                    Logic.savingsGoals();
                    break;
                
                case 5:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
            }
        }
    }
}
