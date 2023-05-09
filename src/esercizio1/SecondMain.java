package esercizio1;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class SecondMain {
	public static void main(String[] args) {
		
		Set<String> nWordsSet = new HashSet<>();
		Set<String> duplicateWordsSet = new HashSet<>();
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("inserisci un numero n: ");
		int n = myScanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("inserisci la " + (i + 1) + "° parola: ");
			String word = myScanner.next();
			if (nWordsSet.contains(word)) {
				duplicateWordsSet.add(word);
			}else {
				nWordsSet.add(word);
			}
				}
		
		myScanner.close();
		System.out.println("parole distinte: " + nWordsSet.size());
		System.out.println("array parole distinte: " + nWordsSet);
		System.out.println("array parole ripetute: " + duplicateWordsSet);
	}
}
		
	
    
