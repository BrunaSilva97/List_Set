package collection;

import java.util.*;

public class SetEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroParaBuscar;

		Set<Integer> numeros = new HashSet<>();
		int[] numerosIniciais = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		for (int i = 0; i < 10; i++) {
			numeros.add(numerosIniciais[i]);
		}

		System.out.print("Digite o número que você deseja encontrar: ");
		numeroParaBuscar = scanner.nextInt();

		if (numeros.contains(numeroParaBuscar)) {
			System.out.println("Número " + numeroParaBuscar + " foi encontrado!");
		} else {
			System.out.println("O número " + numeroParaBuscar + " não foi encontrado!");
		}

		scanner.close();

	}

}
