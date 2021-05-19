package code.menu;

public class GulaschSuppe extends Suppe {

	@Override
	public String getName() {
		return "Gaulaschsuppe";
	}

	@Override
	public double kostet() {

		/*
		 * "super" keyword ruft die Methode " kostet()" der Parentklass auf, dann return
		 * der Wert "0.70", dann hier wird der Wert "0.02" erhöht.
		 */

		double nkostet = super.kostet() + 0.02;
		return nkostet;
	}
}
