import java.util.Scanner;

public class DesembaralharString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o inteiro

        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            String decifrada = desembaralharString(linha);
            System.out.println(decifrada);
        }
    }

    public static String desembaralharString(String linha) {
        int tamanho = linha.length();
        StringBuilder sb = new StringBuilder();

        // Construir a parte direita da string decifrada
        for (int i = tamanho / 2; i < tamanho; i++) {
            sb.append(linha.charAt(i));
        }

        // Construir a parte esquerda da string decifrada
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}
