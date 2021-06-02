package code.menu;
/**
 * 
 * @author Aykut Acarer
 *
 */
public class ErbsenSuppe extends Suppe {

	@Override
	public String getName() {
		return "Erbsensuppe";
	}

	@Override
	public double kostet() {

		/*
		 * "super" keyword ruft die Methode " kostet()" der Parentklass auf, dann return
		 * der Wert "0.70", dann hier wird der Wert "0.01" erhöht.
		 */

		double nkostet = super.kostet() + 0.01;
		return nkostet;
	}
}
