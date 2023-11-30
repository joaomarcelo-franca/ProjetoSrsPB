// We are making this class abstract because we do not wish for it
// to be instantiated.

public abstract class Person {

	private String name;
	private String ssn;


	public Person(String name, String ssn) {
		this.setName(name);
		this.setSsn(ssn);
	}

        public Person() {
		this.setName("?");
		this.setSsn("???-??-????");
        }


	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSsn(String s) {
		ssn = s;
	}
	
	public String getSsn() {
		return ssn;
	}


	// We'll let each subclass determine how it wishes to be
	// represented as a String value.

	public abstract String toString(); 

	public void display() {
		System.out.println("Person Information:");
		System.out.println("\tName:  " + this.getName());
		System.out.println("\tSoc. Security No.:  " + this.getSsn());
	}
}	
