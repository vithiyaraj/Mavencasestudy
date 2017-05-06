package com.wipro.bank.main;
import com.wipro.bank.entity.*;
 
public class MainClass {
   public static void main(String[] args) {
 
     Account[] accounts=new Account[5];
     
     Account acc1=new Account(1,"user1",100.0);
     Account acc2=new Account(2,"user2",0.0);
     Account acc3=new Account(3,"user3",220.0);
     Account acc4=new Account(4,"user4",123.0);
     Account acc5=new Account(5,"user5",984.0);
     
     accounts[0]=acc1;
     accounts[1]=acc2;
     accounts[2]=acc3;   
     accounts[3]=acc4;
     accounts[4]=acc5; 
     
     BankProcess process=new BankProcess(accounts);
     double test1=process.getBalanceOf(acc1.getAccountID());
     System.out.println("@ Account  details of account number:"+acc1.getAccountID()+" is as follows"+"\n##  "+test1);
     
     double test2=process.getBalanceOf(acc4.getAccountID());
     System.out.println("@ Account  details of account number:"+acc4.getAccountID()+" is as follows"+"\n##  "+test2);
     
     double test3=process.getBalanceOf(3);
     System.out.println("@ Account  details of account number:3 .."+"##  "+test3+"  sorry user doesn't exist");
     
      System.out.println("###########################\n");
     String transferStatus=process.transferFunds(4,5,100);
     System.out.println("@ Fund Transfer from account 4 to account 5 is: "+transferStatus); 
     
     
 
      transferStatus=process.transferFunds(4,5,100);
     
     double test4=process.getBalanceOf(acc4.getAccountID());
     System.out.println("@ Account  details of account number:"+acc4.getAccountID()+" is as follows"+"\n##  "+test4);
     System.out.println(acc5);
     System.out.println(acc4);
 
 
}
}
