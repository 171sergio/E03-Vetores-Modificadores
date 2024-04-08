import sun.util.calendar.CalendarSystem;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Heitor Lucas Assis", "123.456.789-10", "Rua abc, 326", 30, 'M');

        Account account1 = new Account(client1, 1000.0, 12345, 500, "001");

        Client client2 = new Client("Joaquim Fernandes", "123.456.789-10", "Rua abc, 326", 30, 'M');

        Account account2 = new Account(client2, 1000.0, 12345, 500, "001");



        account1.printOut();

        account1.withdraw(500);
        account1.deposit(100);
        account2.transfer(account1, 100);

        account1.printStatemant();

        System.out.println("TESTE - Total de contas " + account1.totAccounts);
        System.out.println("TESTE - Total de operações " + Operacao.totOperations);
        System.out.println("Média de operações por conta: " + Operacao.totOperations/Account.totAccounts);
    }
}