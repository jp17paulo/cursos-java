package exemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class TratamentoExcecoes {
    
	//public static void main(String[] args) {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		/*
		  O programa consiste em receber um array de strings e  uma posição a ser verificada,
		  caso exista um nome relacionada a posição seja exibido o nome caso contrario devemos tratar a excecao. 
		 * */
			/*Scanner sc = new Scanner(System.in);
			
			try {
			
				//Recebendo um array de strings
				//ex,: Alex Maria Bob
				String[] vect = sc.nextLine().split(" ");
			
				//Recebendo a posição que deve ser verificada
				//Ex,: 5
				int position = sc.nextInt();
			
				System.out.println(vect[position]);
			}
			
			//Posição inválida
			catch (ArrayIndexOutOfBoundsException e) {
			
				System.out.println("Invalid position!");
			}
			
			//Letra ao invés de números
			catch (InputMismatchException e) {
			
				System.out.println("Input error");
			}
			
			    System.out.println("End of program");
			
			    sc.close();
			}*/
				
		
//*****************Exemplo utilizando métodos**********************************
		
				/*method1();
				
				System.out.println("End of program");
				
			}
				
			public static void method1() {
				
				System.out.println("***METHOD1 START***");
				
				method2();
				
				System.out.println("***METHOD1 END***");
				
			}
			
			public static void method2() {
				
				System.out.println("***METHOD2 START***");
				
				Scanner sc = new Scanner(System.in);
				
				try {
				
					String[] vect = sc.nextLine().split(" ");
				
					int position = sc.nextInt();
				
					System.out.println(vect[position]);
				
				}
				
				catch (ArrayIndexOutOfBoundsException e) {
				
					System.out.println("Invalid position!");
				
					e.printStackTrace();
				
					sc.next();
				
				}
				
				catch (InputMismatchException e) {
				
					System.out.println("Input error");
				
				}
				
				sc.close();
				
				System.out.println("***METHOD2 END***");
				
			}*/
		
/*****************************************************************************/		
//*****************Bloco finally**********************************************
		/*File file = new File("C:\\temp\\in.txt");
		
		Scanner sc = null;
		
		try {
		
			sc = new Scanner(file);
		
			while (sc.hasNextLine()) {
		
				System.out.println(sc.nextLine());
		
			}
		}
		
		catch (IOException e) {
		
			System.out.println("Error opening file: " + e.getMessage());
		
		}
		
		finally {
		
			if (sc != null) {
		
				sc.close();
		
			}
		}

	}*/
		
/*****************************************************************************/		
/******************************Solução muito ruim: Tratando exceções*****************/
/*****************************************************************************/
		/*Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        
        if(!checkOut.after(checkIn)) {
        	
        	System.out.println("Error in reservation: Check-out date must be after check-in date");
        	
        }
        
        else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation" + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date dd/MM/yyyy: ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				
				System.out.println("Error in reservation: Reservation for update must future");
				
			} else if(!checkOut.after(checkIn)) {

				System.out.println("Error in reservation: Check-out date must be after check-in date");
				
			}
			else {
				
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation" + reservation);
				
			}
			
			
		}*/


		/*****************************************************************************/		
/******************************Solução  ruim: Tratando exceções*****************/
/*****************************************************************************/
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        
        //Essa validação deveria ser feita pelo construtor
        if(!checkOut.after(checkIn)) {
        	
        	System.out.println("Error in reservation: Check-out date must be after check-in date");
        	
        }
        
        else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation" + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date dd/MM/yyyy: ");
			checkOut = sdf.parse(sc.next());
			
			
				
			String error =	reservation.updateDates(checkIn, checkOut);
			if (error != null) {
				
				System.out.println("Error in reservation: " + error);
				
			}
			
			else {
				
				System.out.println("Reservation" + reservation);
				
			}
				
				
			
			
			
		}
        	
        	
        
        
        

		
/*****************************************************************************/		
/******************************Solução boa: Tratando exceções*****************/
/*****************************************************************************/
		/*Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			System.out.print("Room number: ");
			int number = sc.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		
		catch (ParseException e) {
			
			System.out.println("Invalid date format");
		}
		
		catch (DomainException e) {
			
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		catch (RuntimeException e) {
			
			System.out.println("Unexpected error");
		}
        */
		sc.close();
	
}

		
}

