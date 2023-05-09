package esercizio3;

import java.util.Map;
import java.util.HashMap;

public class Rubric {
	private static Map<String, String> rubric = new HashMap<>();
	
	static void addContact(String name, String phone) {
		if (rubric.put(name, phone) != null) {
			System.out.print(name + phone + "aggiunto");
		}
	}
	
	static void removeContact(String name) {
		if (rubric.remove(name) != null) {
			System.out.print(name + "rimosso");
		}
	}
	
	static void findByName(String name) {
		String phone = rubric.get(name);
		if(phone != null) {
			System.out.println("il numero di " + name + " è " + phone);
		} else {
			System.out.println("il numero di " + name + " non è in rubrica");
		}
	}
	
	static void findByPhone (String phone) {
		String name = rubric.get(phone);
		if(name != null) {
			System.out.println("il nome del numero " + phone + " è " + name);
		} else {
			System.out.println("il numero " + phone + " non è registrato");
		}
	}
	
	static void printRubric() {
		rubric.forEach((key, value) -> 
		System.out.println(" name: " + key + " phone: " + value));
	}
}
