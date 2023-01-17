package teste.ticketmachine;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */

public class TicketMachine {

    public static void main(String[] args) 
    {
        Account account1 = new Account("Jane Gren", 50.00);
        Account account2 = new Account("Jonh Parquer", -7.53);
         
        System.out.printf("%s balance: $%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(),account2.getBalance());
        
        
        // Scanner para receber na janela de comando
        Scanner input = new Scanner(System.in);
          
        System.out.print("Por entre com um nome: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding $%.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance $%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance $%.2f %n", account2.getName(),account2.getBalance());
        
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        
        //Exibir resultados
        System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

    }
    

}

//Account Archive
=======================================================================================================
package teste.ticketmachine;

/**
 *
 * @author USUARIO
 */
public class Account {
    
    private String name;
    private double balance;
    
    public Account(String name, double balance) 
    {
        this.name = name;
        
        if( balance > 0.0 ) {
            this.balance = balance;
        }
    }
    
    public void deposit(double depositAmount)
    {
        if(depositAmount > 0.0) {
           balance = balance + depositAmount;
        }
    }
       
    public double getBalance()
    {
        return balance;
    }        
    
    public void setName(String name, double balance)
    {
        this.name = name;
        
        if( balance > 0.0 ) {
            this.balance = balance;
        }
        
    }
    
    public String getName()
    {
        return name;
    }
}
