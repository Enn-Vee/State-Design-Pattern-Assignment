/**
 * In-transit state class.
 * @author Nick Bautista
 *
 */
public class InTransitState implements State{
	private Package pkg;
	/**
	 * Initializes pkg variable to given package in parameter.
	 * @param pkg
	 */
	public InTransitState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * Displays in-transit status message.
	 */
	public void displayStatus() {
		System.out.println(this.pkg.getName() + " is out for delivery");
	}
	/**
	 * Displays ETA message.
	 */
	public void displayETA() {
		System.out.println(this.pkg.getName() + " should arrive within 5 days");
	}
}
