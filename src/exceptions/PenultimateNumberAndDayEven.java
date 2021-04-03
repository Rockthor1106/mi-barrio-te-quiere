package exceptions;

public class PenultimateNumberAndDayEven extends Exception {
	
	public PenultimateNumberAndDayEven() {
		super("Por norma gubernamental la persona no puede salir hoy. Ambos, penultimo numero de identificacion y dia de hoy, son pares");
	}
}
