public class Atleta {
    private String nome;
    private String sexo;
    private double peso;
    private double altura;

    public Atleta(String nome, String sexo, double peso, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
    }

    public void calcularIMC() {
        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }
    }
}