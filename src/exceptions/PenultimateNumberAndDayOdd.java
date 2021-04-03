package exceptions;

public class PenultimateNumberAndDayOdd extends Exception {
	
	public PenultimateNumberAndDayOdd() {
		System.out.println("Por norma gubernamental la persona no puede salir hoy. Ambos, penultimo numero de identificacion y dia de hoy, son impares");
	}
}
