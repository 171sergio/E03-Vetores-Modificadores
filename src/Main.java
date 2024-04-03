import sun.util.calendar.CalendarSystem;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Heitor Lucas Assis", "123.456.789-10", "Rua abc, 326", 30, 'M');

        Account account1 = new Account(client1, 1000.0, 12345, 500, "001");

        //Client client2 = new Client("Joaquim Fernandes", "123.456.789-10", "Rua abc, 326", 30, 'M');




        account1.printOut();

        account1.withdraw(500);
        account1.deposit(100);

        account1.printStatemant();


    }
}