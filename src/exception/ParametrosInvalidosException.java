package exception;

public class ParametrosInvalidosException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		public ParametrosInvalidosException() {
	        super("Erro: O primeiro paramtero inserido é maior que o segundo!");
	    }

	    public ParametrosInvalidosException(String mensagem) {
	        super(mensagem);
	    }

	    public ParametrosInvalidosException(String mensagem, Throwable causa) {
	        super(mensagem, causa);
	    }

	    public ParametrosInvalidosException(Throwable causa) {
	        super(causa);
	    }
	}