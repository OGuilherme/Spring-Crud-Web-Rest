package br.com.guilherme.example.exception;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1157185811664602433L;

	public CustomException(String message) {
		super(message);
	}
}
