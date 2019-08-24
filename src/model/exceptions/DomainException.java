package model.exceptions;

/*Poderia tamb�m ser uma extens�o da classe Exception, a diferen�a � que
 a RuntimeException o complilador n�o nos obriga a tratar */
public class DomainException extends RuntimeException {
	//Declarando vers�o da classe serializabel
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		
		//Repassando a mensagem para o construtor da super classe
		super(msg);
	}
}