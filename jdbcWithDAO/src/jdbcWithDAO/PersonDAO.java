package jdbcWithDAO;

public interface PersonDAO {

	public Person getPerson(int id);

	public int addPerson(Person p);

}
