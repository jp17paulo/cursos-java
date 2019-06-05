package exemplos;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Enumeracoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		//Convertendo texto para Enum
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
