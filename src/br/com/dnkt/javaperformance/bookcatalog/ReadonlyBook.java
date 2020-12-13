package br.com.dnkt.javaperformance.bookcatalog;

public interface ReadonlyBook {

	int getId();

	String getTitle();

	String getAuthor();

	String toString();

	Price getPrice();

}