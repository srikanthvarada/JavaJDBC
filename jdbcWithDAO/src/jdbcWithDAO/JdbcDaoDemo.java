package jdbcWithDAO;

public class JdbcDaoDemo {

	public static void main(String[] args) {

		PersonDAO dao = new PersonDAOImpl();
		Person p1 = dao.getPerson(5);
		Person p2 = new Person(11, "Ravi");
		int count = dao.addPerson(p2);
		System.out.println(p1.getpName());
		System.out.println(count+" row/s effected");

	}
}
