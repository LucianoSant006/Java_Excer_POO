package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Program {


	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2024-08-01");
		LocalDateTime d05 = LocalDateTime.parse("2024-09-30T01:30:26");
		Instant d06 = Instant.parse("2024-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2024-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2024",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2024 01:30",fmt2);
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 =LocalDateTime.of(2022, 7, 20 , 1, 30);
		System.out.println("d01 ="+d01.toString());
		System.out.println("d02 ="+d02.toString());
		System.out.println("d03 ="+d03.toString());
		System.out.println("d04 ="+d04.toString());
		System.out.println("d05 ="+d05.toString());
		System.out.println("d06 ="+d06.toString());
		System.out.println("d07 ="+d07.toString());
	    System.out.println("d08 ="+d08.toString());
	    System.out.println("d09 ="+d09.toString());
	    System.out.println("d10 ="+d10.toString());
	    System.out.println("d11 ="+d11.toString());;
		sc.close();
		
	}
	
}