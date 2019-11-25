/**
 * Delivered state class.
 * @author Nick Bautista
 *
 */
public class DeliveredState implements State{
	
	private Package pkg;
	/**
	 * Initializes pkg variable to given package in parameter.
	 * @param pkg
	 */
	public DeliveredState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * Displays delivered status message.
	 */
	public void displayStatus() {
		System.out.println(this.pkg.getName() + " is here for you");
	}
	/**
	 * Displays ETA message.
	 */
	public void displayETA() {
		System.out.println(this.pkg.getName() + " is here");
	}
}
