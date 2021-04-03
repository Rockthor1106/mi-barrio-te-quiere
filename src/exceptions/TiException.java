package exceptions;

public class TiException extends Exception {
	
	public TiException() {
		super("La persona debe ser mayor de edad para ingresar a la tienda");
	}
}
