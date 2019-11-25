/**
 * Ordered state class.
 * @author Nick Bautista
 *
 */
public class OrderedState implements State {
	private Package pkg;
	/**
	 * Initializes pkg variable to given package in parameter.
	 * @param pkg
	 */
	public OrderedState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * Displays ordered status message.
	 */
	public void displayStatus() {
		System.out.println(this.pkg.getName() + " was ordered");
	}
	/**
	 * Displays ETA message.
	 */
	public void displayETA() {
		System.out.println(this.pkg.getName() + " should arrive in 5 to 7 business days");
	}
}
