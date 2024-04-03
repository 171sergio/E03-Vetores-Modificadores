/**
 * Operacao.java
 *
 * @author João Eduardo Montandon
 */

import java.util.Date;

public class Operacao {

    /* Data de realização da operação */
    public Date date;

    /* Tipo da operação */
    public char type;

    /* Valor da operação */
    public double amount;

    public Operacao(char type, double amount) {
        this.type = type;
        this.amount = amount;
        date = new Date();
    }

}