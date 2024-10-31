package OOP;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bankaccount myAccount = new Bankaccount();
        System.out.println("Välkommen till din bank, vad vill du göra?");

        int val;

        do {
            System.out.println("1 Sätt mitt Saldo");
            System.out.println("2 Se mitt Saldo");
            System.out.println("3 Insättning");
            System.out.println("4 uttag");
            System.out.println("9 Avsluta");

            val = scanner.nextInt();
            if (val == 1) {
                System.out.print("Vilket saldo vill du ha på ditt konto");
                int newSaldo = scanner.nextInt();
                myAccount.setSaldo(newSaldo);
            }
            if (val == 2) System.out.println("Ditt saldo är: " + myAccount.getSaldo());
            if (val == 3) {
                System.out.println("Hur mycket vill du sätta in");
                int amount = scanner.nextInt();
                myAccount.deposit(amount);
            }
            if (val == 4) {
                System.out.println("Hur mycket vill du ta ut?");
                int amount = scanner.nextInt();
                if(myAccount.withdraw(amount)) System.out.println("Ditt uttag är registrerat");
                else System.out.println("Saldot kan inte understiga 0");
            }
        } while (val != 9);
    }
}




