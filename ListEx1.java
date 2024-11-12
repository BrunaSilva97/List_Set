package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx1 {
	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int i;
		int j;

		System.out.println("Digite 5 cores:");
		for (i = 1; i <= 5; i++) {
			System.out.println("Cor " + i + ": ");
			String cor = scanner.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores:");
		for (i = 0; i < 5; i++) {
			System.out.println(cores.get(i));
		}

		for (i = 0; i < 5 - 1; i++) {
			for (j = 0; j < 5 - 1 - i; j++) {
				if (cores.get(j).compareTo(cores.get(j + 1)) > 0) {

					cores.set(j, cores.set(j + 1, cores.get(j)));
				}
			}
		}

		System.out.println("\nOrdenar as cores:");
		for (i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
	}
}
