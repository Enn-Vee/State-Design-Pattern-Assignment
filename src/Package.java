/**
 * Package class with state variables and a name.
 * @author Nick Bautista
 *
 */
public class Package {
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	private String name;
	private State state;
	
	/**
	 * Constructor initializes name.
	 * @param aName
	 */
	public Package(String aName) {
		this.name = aName;
	}
	
	/**
	 * Initializes orderedState variable of package, sets state variable to ordered, and displays ordered methods.
	 */
	public void order() {
		this.orderedState = new OrderedState(this);
		this.setState(orderedState);
		state.displayStatus();
		state.displayETA();
	}
	/**
	 * Initializes inTransitState variable of package, sets state variable to in-transit, and displays in-sit methods.
	 */
	public void mail() {
		this.inTransitState = new InTransitState(this);
		this.setState(inTransitState);
		state.displayStatus();
		state.displayETA();
	}
	/**
	 * Initializes deliveredState variable of package, sets state variable to delivered, and displays delivered methods.
	 */
	public void received() {
		this.deliveredState = new DeliveredState(this);
		this.setState(deliveredState);
		state.displayStatus();
	}
	/**
	 * Sets state to given state in parameter.
	 * @param aState
	 */
	public void setState(State aState) {
		this.state = aState;
	}
	/**
	 * Returns the name of the package.
	 * @return
	 */
	public String getName() {
		return this.name;
	}
}
