package br.com.dnkt.javaperformance.escapingreferences.escapingreferencesclient;

import br.com.dnkt.javaperformance.escapingreferences.CustomerRecords;
import br.com.dnkt.javaperformance.escapingreferences.ReadonlyCustomer;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();
		
		records.addCustomer("John");
		records.addCustomer("Simon");
		
		for (ReadonlyCustomer c : records) {
			System.out.println(c);
		}
		
		//Customer c = (Customer) records.find("John");
				

	}
}