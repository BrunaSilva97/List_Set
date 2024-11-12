package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		Scanner scanner = new Scanner(System.in);
		int numeroBusca;
		int i;
		boolean encontrado = false;

		System.out.print("Digite o número que você deseja encontrar: ");
		numeroBusca = scanner.nextInt();

		for (i = 0; i < 10; i++) {
			if (numeros.get(i) == numeroBusca) {

				System.out.println("O número " + numeroBusca + " está localizado na posição: " + i);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O número " + numeroBusca + " não foi encontrado!");
		}

	}

}
