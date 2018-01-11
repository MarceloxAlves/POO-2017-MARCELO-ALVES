package exceptions;

public class ContaException extends RuntimeException {

    public ContaException(String message) {
        super(message);
    }

    /**
     * Constructs an <code>ContaException</code> with the
     * specified detail message.
     *
     * @param   saldo   the detail message.
     */
    public ContaException(Double saldo) {
        super("Saldo insuficiente para sacar o valor de: " + saldo);
    }


}
