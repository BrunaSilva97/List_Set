package collection;

import java.util.*;

public class SetEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();
		int numero;

		System.out.println("Digite 10 números inteiros não repetidos:");

		while (numeros.size() < 10) {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
			if (!numeros.add(numero)) {
				System.out.println("Número já inserido! Tente outro.");
			}
		}

		List<Integer> numerosOrdenados = new ArrayList<>(numeros);
		Collections.sort(numerosOrdenados);

		System.out.println("\nListar dados do Set (ordem crescente): " + numerosOrdenados);

		List<Integer> numerosPares = new ArrayList<>();
		Iterator<Integer> iterator = numerosOrdenados.iterator();

		while (iterator.hasNext()) {
			numero = iterator.next();
			if (numero % 2 == 0) {
				numerosPares.add(numero);
			}
		}

		System.out.println("Listar dados do Set (Números pares em ordem crescente): " + numerosPares);

	}

}
