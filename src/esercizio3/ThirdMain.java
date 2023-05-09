package esercizio3;

public class ThirdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rubric.addContact("Pierluigi", "1");
		Rubric.addContact("Nicola", "2");
		Rubric.addContact("Anna", "3");
		Rubric.addContact("Samuele", "4");
		Rubric.addContact("Luna", "5");
		//findByPhone is not fine, sad :(
		Rubric.findByPhone("2");
		Rubric.findByPhone("5");
		Rubric.findByName("Samuele");
		Rubric.printRubric();
	}
	
}
