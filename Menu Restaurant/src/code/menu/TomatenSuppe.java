package code.menu;
/**
 * 
 * @author Aykut Acarer
 *
 */
public class TomatenSuppe extends Suppe {

	@Override
	public String getName() {
		return "Tomatensuppe";
	}
	@Override
	public double kostet() {

		double nkostet = super.kostet();
		return nkostet;
	}
}
