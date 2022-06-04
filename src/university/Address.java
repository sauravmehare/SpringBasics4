package university;

public class Address {
	private String residental;
	private long pin;
	public Address(String residental, long pin) {
		super();
		this.residental = residental;
		this.pin = pin;
	}
	public Address(String residental) {
		this.residental = residental;
	}
	public Address(long pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [residental=" + residental + ", pin=" + pin + "]";
	}

}
