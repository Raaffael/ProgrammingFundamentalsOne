import java.util.ArrayList;
public class ArrayListExamples {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		printOut(myList);
		myList.add("First");
		printOut(myList);
		myList.add("Second");
		myList.add("Third");
		printOut(myList);
		myList.add(0, "Fourth");
		printOut(myList);
		myList.add(2, "I'm in third place now");
		printOut(myList);
		myList.remove(2);
		printOut(myList);
		
		printOutWithIndices(myList);
		
		myList.clear();
		printOut(myList);

	}

	private static void printOutWithIndices(ArrayList<String> myList) {
		for(int i = 0; i<myList.size(); i++)
			System.out.println(i + " = " + myList.get(i));
		
	}

	private static void printOut(ArrayList<String> myList) {
		System.out.println(" ");
		System.out.println("Your list has size: " + myList.size());
		for (String element:myList) {
			System.out.println(" " + element);
		}

	}

}
