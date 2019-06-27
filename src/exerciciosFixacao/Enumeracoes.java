package exerciciosFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderEnum;
import entities.OrderItemEnum;
import entities.Product;
import entities.enums.OrderStatusEnum;

public class Enumeracoes {
	
	public static void main(String[] args) throws ParseException{

		//Exercício referente a vídeo aula 99
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post(
				  sdf.parse("21/06/2018 13:05:44"), 
				  "Traveling to new Zealend", 
				  "I'm going to visit this wonderful country!",
				  12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(
				  sdf.parse("28/07/2018 23:14:19"), 
				  "Good night guys", 
				  "See you tomorrow",
				  5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		System.out.println(p1);
		System.out.println(p2);*/
		
		//Exercício de fixação referente a vídeo aula 100
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			System.out.println("Enter client data:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Birth date (DD/MM/YYYY): ");
			Date birthDate = sdf.parse(sc.next());
			
			Client client = new Client(name, email, birthDate);
			
			System.out.println("Enter order data:");
			System.out.print("Status: ");
			
			//Aqui o usuário deverá digitar exatamente como está escrito na classe OrderStatusEnum
			//PENDING_PAYMENT,
			//PROCESSING,
			//SHIPPED,
			//DELIVERD,
			OrderStatusEnum status = OrderStatusEnum.valueOf(sc.next());
			
			OrderEnum order = new OrderEnum(new Date(), status, client);
			
			System.out.print("How many items to this order? ");
			int n = sc.nextInt();
			for (int i=1; i<=n; i++) {
				System.out.println("Enter #" + i + " item data:");
				System.out.print("Product name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				System.out.print("Product price: ");
				double productPrice = sc.nextDouble();

				Product product = new Product(productName, productPrice);

				System.out.print("Quantity: ");
				int quantity = sc.nextInt();

				OrderItemEnum orderItem = new OrderItemEnum(quantity, productPrice, product); 

				order.addItem(orderItem);
			}
			
			System.out.println();
			System.out.println("ORDER SUMMARY:");
			System.out.println(order);
			
			sc.close();
		}
		
		
	}
	


