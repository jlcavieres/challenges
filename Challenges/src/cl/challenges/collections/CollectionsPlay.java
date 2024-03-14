package cl.challenges.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsPlay {

	public static void main(String[] args) {

		int[] numbers = { -1, 0, 1, 2, -1, -4 };
		// [-1,0,1]
		// [-1,-1,2]

		// int[] numbers = {-1, 8, 0, 8, 1, 2,-1, -1, -4};
		// [-1,0,1]
		// [2,-1,-1]

		// int[] numbers = {-1, 0, -3, 1, 2, -2, -4, 3};
		// [-2, -1, 3]
		// [-2, 0, 2]
		// [-3, 1, 2]
		// [-3, 0, 3]
		// [-4, 1, 3]
		// [-1, 0, 1]

		Set<String> triplets = new HashSet<>();

		List<Integer> finded;

		// El conjunto de números debe ser par, por eso length -1

		System.out.println("  iA | iB | iC  | Sum | Considerado ");

		int sum = 0;

		boolean indexConsiderado = true;

		for (int iA = 0; iA <= numbers.length - 1; iA++) {

			for (int iB = 0; iB <= numbers.length - 1; iB++) {

				System.out.println(" ---   ---  ---   ---  ------\n");

				// No se debe considerar al elemento en el índice A ni B
				for (int iC = 0; iC <= numbers.length - 1; iC++) {

					indexConsiderado = (iA == iB || iC == iA || iC == iB) ? false : true;

					sum = numbers[iA] + numbers[iB] + numbers[iC];

					if (indexConsiderado && sum == 0) {
						// los pongo en una estructura que me permita ordenarlos
						finded = new ArrayList<Integer>(Arrays.asList(numbers[iA], numbers[iB], numbers[iC]));

						finded.sort(Comparator.naturalOrder());

						// No permite agregar repetidos
						triplets.add(finded.toString());
					}

					System.out.println(
							"  " + iA + "  |  " + iB + " |  " + iC + "   | " + sum + "  | " + indexConsiderado);
				}
			}
		}

		System.out.println("");
		System.out.println("TRIPLETAS FINALES: " + triplets);

	}

}
