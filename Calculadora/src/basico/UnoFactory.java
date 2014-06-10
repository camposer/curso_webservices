package basico;

public abstract class UnoFactory {
	public static IUno createUno() {
		return new Uno();
	}
}
