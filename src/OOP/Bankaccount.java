package OOP;

public class Bankaccount {
    private int saldo;

    Bankaccount() {
        saldo = 0;

    }

    public void setSaldo(int amount) {
        saldo = amount;
    }

    public int getSaldo() {
        return saldo;
    }

    public void deposit(int amount) {
        saldo = saldo+amount;
    }

    public boolean withdraw(int amount) {
        if (saldo > amount) {
            saldo = saldo - amount;
            return true;
        } else return false;

    }
}
