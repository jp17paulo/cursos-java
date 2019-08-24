package model.exceptions;

/*Poderia também ser uma extensão da classe Exception, a diferença é que
 a RuntimeException o complilador não nos obriga a tratar */
public class DomainException extends RuntimeException {
	//Declarando versão da classe serializabel
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		
		//Repassando a mensagem para o construtor da super classe
		super(msg);
	}
}