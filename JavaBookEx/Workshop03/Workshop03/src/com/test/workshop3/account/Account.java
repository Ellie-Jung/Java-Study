package com.test.workshop3.account;

import com.test.workshop3.exception.InvalidValueException;

public class Account {
    
    private String account;
    private String name;
    private int    balance;
    
    public Account(String account, String name, int balance) throws InvalidValueException {
        //TODO 최초 입금 금액이 0원 이하인 경우, 예외 발생
        this.account = account;
        this.name    = name;
        this.balance = balance;
    }
    
    public void deposit(int money) throws InvalidValueException {
        //TODO 입금할 금액이 잘못 입력된 경우, 예외 발생
        balance += money;
    }
    
    public void withdraw(int money) throws InvalidValueException {
        //TODO 출금할 금액이 잘못 입력되었거나, 잔액이 부족한 경우 예외 발생
        balance -= money;
    }
    
    @Override
    public String toString() {
        return "[계좌] " + account + "\t[예금주] " + name + "\t[잔액] " + balance;
    }
}