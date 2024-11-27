package com.rb.exceptions;

import java.io.IOException;

public class ExceptionsPractice {

	static void callCustomException(String pName) throws ProductInventoryException, IOException {
		throw new IOException("Product " + pName + " not available in stock");
	}

	public static void main(String[] args) throws ProductInventoryException {
		try {
			ExceptionsPractice.callCustomException("MOBILE");
		} catch (NullPointerException e) {
			System.out.println("INSIDE CATCH 1");
		} catch (ProductInventoryException e) {
			System.out.println("INSIDE CATCH 2");
		} catch (Exception e) {
			System.out.println("INSIDE CATCH 3");
		} finally {
			System.out.println("FINALLY BLOCK");
		}

	}

}
