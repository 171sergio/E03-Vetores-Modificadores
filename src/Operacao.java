import java.util.Date;

public class Operacao {

    /* Data de realização da operação */
    public Date date;

    /* Tipo da operação */
    public char type;

    /* Valor da operação */
    public double amount;

    public static int totOperations=0;

    public Operacao(char type, double amount) {
        this.type = type;
        this.amount = amount;
        date = new Date();
        totOperations++;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if(type=='d' || type=='s'){
            this.type = type;
        }else{
            System.err.println("Erro, valores aceitos em type: s/d");;
            System.exit(1);
        }

    }
}