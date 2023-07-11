import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obter o número de linhas de entrada
        int N = scanner.nextInt();

        List<Integer> valores = new ArrayList<>();

        // Ler os valores de entrada
        for (int i = 0; i < N; i++) {
            int valor = scanner.nextInt();
            valores.add(valor);
        }

        // Ordenar os valores de acordo com o critério especificado
        ordenarParesImpares(valores);

        // Imprimir os valores ordenados
        for (int valor : valores) {
            System.out.println(valor);
        }
    }

    // Função para ordenar os valores de acordo com o critério especificado
    public static void ordenarParesImpares(List<Integer> valores) {
        // Separar os valores em pares e ímpares
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        // Ordenar os pares em ordem crescente
        Collections.sort(pares);

        // Ordenar os ímpares em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());

        // Atualizar a lista original com os valores ordenados
        valores.clear();
        valores.addAll(pares);
        valores.addAll(impares);
    }
}
