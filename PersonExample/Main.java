
public class Main {
	public static void main(String[] args) {
		Person me = new Person("Bill", "Neely");
		System.out.println(me.getName());
		System.out.println(me.getlastNameFirst());
		me.setFirstName("Harold");
		System.out.println(me.getName());

	}

}
