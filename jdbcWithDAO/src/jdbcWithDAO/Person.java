package jdbcWithDAO;

public class Person {
	private int id;
	private String pName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Person(int id) {
		this.id = id;
	}

	public Person(int id, String pName) {
		super();
		this.id = id;
		this.pName = pName;
	}

}
