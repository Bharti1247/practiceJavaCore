package com.learn.java8.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class FetchAsyncData {
	
	public static void main(String[] args) {
		CompletableFuture<String> userFuture = fetchUser();
		CompletableFuture<String> orderFuture = fetchOrders();
		
		// combine results -> user + orders (stationary)
		CompletableFuture<String> combinedResult 
			= userFuture.thenCombine(orderFuture, (user, order) -> {
				return "Result: \n" + user + "\n" + order;
			});
		
		combinedResult.thenAccept(System.out::println);
		
		// combine results -> user + all orders
		CompletableFuture<List<String>> fruitsOrderFuture = fetchOrder();
		
		combinedResult.thenCombine(fruitsOrderFuture, (userOrder, fruitOrder) -> {
			return "\nComplete " + userOrder + "\n\t" + fruitOrder;
		}).thenAccept(System.out::println);
	}
	
	private static CompletableFuture<String> fetchUser() {
		return CompletableFuture.supplyAsync(() -> {
			return "User : Sam";
		});
	}
	
	private static CompletableFuture<String> fetchOrders() {
		return CompletableFuture.supplyAsync(() -> {
			return "Orders: [Pen, Pencil, Notebook, Marker]";
		});
	}
	
	private static CompletableFuture<List<String>> fetchOrder() {
		return CompletableFuture.supplyAsync(() -> {
			return Arrays.asList("Mangoes", "Litchi", "Pineapples");
		});
	}
	
}
