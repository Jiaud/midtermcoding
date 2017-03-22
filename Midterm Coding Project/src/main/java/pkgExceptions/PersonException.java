package pkgExceptions;

public class PersonException extends Exception{
	private Object Person;

	public void Person(){
		this.setPerson(Person);
	}

	public Object getPerson() {
		return Person;
	}

	public void setPerson(Object person) {
		Person = person;
	}
	
}