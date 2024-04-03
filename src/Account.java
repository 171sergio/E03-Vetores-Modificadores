public class Account {

    Client owner;
    double balance;
    int num;
    int limit;
    String agency;

    Operacao[] operations;

    int operationCounter;

    public Account(Client owner, double balance, int num, int limit, String agency) {
        this.owner = owner;
        this.balance = balance;
        this.num = num;
        this.limit = limit;
        this.agency = agency;
        this.operations = new Operacao[1000];
        this.operationCounter = 0;
    }


    boolean deposit(double value) {
        if(value > 0.0) {
            this.balance += value;
            this.operations[operationCounter].type = 'd';
            this.operationCounter++;
            return true;
        } else {
            return false;
        }
    }


    boolean withdraw(double value) {
        if(value > 0.0 && value <= this.balance) {
            this.balance -= value;
            this.operations[operationCounter].amount = value;
            this.operationCounter++;
            return true;
        } else {
            return false;
        }
    }


    boolean transfer(Account destineAccount, double value) {
        boolean withdrawMade = this.withdraw(value);
        if(withdrawMade) {
            boolean deposit = destineAccount.deposit(value);
            return deposit;
        } else {
            return false;
        }
    }


    void printOut() {
        System.out.println("Nome do dono da conta: " + this.owner.name);
        System.out.println("CPF: " + this.owner.CPF);
        System.out.println("Endereço: " + this.owner.adress);
        System.out.println("Idade: " + this.owner.age);
        System.out.println("Sexo: " + this.owner.sex);
        System.out.println("Número da conta: " + this.num);
        System.out.println("Saldo atual: " + this.balance);
        System.out.println("Limite: " + this.limit);
    }
}
