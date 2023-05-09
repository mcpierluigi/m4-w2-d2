package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class FirstMain {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Inserisci un numero intero: ");
		int n = myScanner.nextInt();
		myScanner.close();
		
		List<Integer> nNumbers = listRandomNumbers(n);
		List<Integer> rNumbers = reverseList(nNumbers);
		
		System.out.println(nNumbers);
		System.out.println(rNumbers);
		evenOrOdd(nNumbers, true);
		
	}
	
	public static List<Integer> listRandomNumbers(int n) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			list.add(random.nextInt(100));
		}
		Collections.sort(list);
		return list;
	}
	
	public static List<Integer> reverseList(List<Integer> list) {
		List<Integer> reversedList = new ArrayList<>(list);
		Collections.reverse(reversedList);
		return reversedList;
	}
	
	public static void evenOrOdd(List<Integer> list, boolean even) {
		if (even) {
			System.out.print("Elementi in posizione pari: ");
			for (int i = 1; i < list.size(); i += 2) {
				System.out.print(list.get(i) + " ");
			}
		} else {
			System.out.print("Elementi in posizione dispari: ");
			for (int i = 0; i < list.size(); i +=2) {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
