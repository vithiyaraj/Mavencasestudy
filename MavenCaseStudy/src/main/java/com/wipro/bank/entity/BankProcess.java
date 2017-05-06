//package com.wipro.bank.entity;
//public class BankProcess {
//
//}
//
package com.wipro.bank.entity;

public class BankProcess {
   private  Account []accounts;
 
   public BankProcess(Account[] accounts) {
     super();
     this.accounts = accounts;
   }
   public String transferFunds(int from,int to,double amount)
   {
     String response="failure";
     
     if(amount>0)
     {
        for(Account fromAcc:accounts){
          if(fromAcc!=null)
          {
             if(from==fromAcc.getAccountID())
             {
                if(fromAcc.getBalance()>=amount)
               {
                  for(Account toAcc:accounts)
                  {
                    if(toAcc!=null)
                    {
                       if(to==toAcc.getAccountID())
                       {
                          toAcc.setBalance(toAcc.getBalance()+amount);
                          fromAcc.setBalance(fromAcc.getBalance()-amount);
                          response="success";
                              
                       }
                       else response="failure";
                    }
                  }
               }
             }
          }
          
        }
     }return response;
     
   }
   public double getBalanceOf(int accountNumber)
   {
     double balance=0.0;
     for(Account acc:accounts)
     {
        if(acc!=null)
        {
           if(accountNumber==acc.getAccountID()){
             balance= acc.getBalance();
          }
        }
        
 
        
     }
 
     return balance; 
   }
}
 
