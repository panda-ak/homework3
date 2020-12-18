package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(20000);
        while(true){
            System.out.println("Осталось:"+bankAccount.getAmount()+"|сом");
            try{
                bankAccount.withDraw(sc.nextDouble());
            }catch (LimitException e){
                System.out.println(e.getMessage());
                System.out.println("Снято:"+bankAccount.getAmount());
                try {
                    bankAccount.withDraw(bankAccount.getAmount());
                } catch (LimitException e1) {
                    e1.printStackTrace();
                }
            }finally
            {
                if(bankAccount.getAmount()==0){
                    break;
                }
            }
        }
    }
    }

