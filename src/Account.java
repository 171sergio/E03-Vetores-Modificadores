import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Account {

    private Client owner;
    private double balance;
    private int ID;
    private int limit;
    private String agency;

    private Operacao[] operations;

    private int operationCounter;

    public Account(Client owner, double balance, int ID, int limit, String agency) {
        this.owner = owner;
        this.balance = balance;
        this.ID = ID;
        this.limit = limit;
        this.agency = agency;
        this.operations = new Operacao[1000];
        this.operationCounter = 0;
    }


    boolean deposit(double value) {
        if (value > 0.0) {
            this.balance += value;
            this.operations[operationCounter] = new Operacao('d', value);
            this.operationCounter++;
            return true;
        } else {
            return false;
        }
    }


    boolean withdraw(double value) {
        if (value > 0.0 && value <= this.balance) {
            this.balance -= value;
            this.operations[operationCounter] = new Operacao('s', value);
            this.operationCounter++;
            return true;
        } else {
            return false;
        }
    }


    boolean transfer(Account destineAccount, double value) {
        boolean withdrawMade = this.withdraw(value);
        if (withdrawMade) {
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
        System.out.println("Número da conta: " + this.ID);
        System.out.println("Saldo atual: " + this.balance);
        System.out.println("Limite: " + this.limit);
    }

    void printStatemant() {
        for (int i = 0; i < this.operationCounter; i++) {
            System.out.print(this.operations[i].date + "  ");
            System.out.print(this.operations[i].type + "   ");
            System.out.println("R$ " + this.operations[i].amount);
        }
    }


    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
