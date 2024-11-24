/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

import java.util.ArrayList;

public class TransactionManager {
 private ArrayList<Transaction> transactions;

    public TransactionManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void updateTransaction(int index, Transaction transaction) {
        transactions.set(index, transaction);
    }

    public void deleteTransaction(int index) {
        transactions.remove(index);
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }  
}
