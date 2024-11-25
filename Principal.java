import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do atleta:");
        String nome = scanner.nextLine();
        System.out.println("Digite o sexo do atleta:");
        String sexo = scanner.nextLine();
        System.out.println("Digite o peso do atleta (em kg):");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura do atleta (em metros):");
        double altura = scanner.nextDouble();

        Atleta atleta = new Atleta(nome, sexo, peso, altura);

        System.out.println("\nDados do Atleta:");
        atleta.imprimir();

        System.out.println("\nCálculo do IMC:");
        atleta.calcularIMC();

        scanner.close();
    }
}