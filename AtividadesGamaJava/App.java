import java.util.Arrays;
import java.util.Scanner;

public class App {

    // public static final double PODE_COMPRAR = 16;

    public static void main(String[] args) throws Exception {
        // exercício 1
        System.out.println("Wander Riti Barbosa");

        Calculadora(5, 2);

        Correios("São Paulo");

        Concessionaria("Sonata", 45000);

        LojaPeixe(3, 6);

        PetShop(15, 2);

        MiniMercado(200);

        parImpar(3);

        SomaNum(5);

        NumPrimo(4);

        // NumInteiro();

        Palindromo("casa");

        Vogais("Programar em Java é bom!");

        SeqFibonacci(5);
    }

    // exercício 2
    public static void Calculadora(double num1, double num2) {
        double soma = num1 + num2;
        double sub = num1 - num2;
        System.out.println("Sua soma é: " + soma);
        System.out.println("Sua divisão é: " + num1 / num2);
        System.out.println("Sua multiplicação é: " + num1 * num2);
        System.out.println("Sua subtração é: " + sub);

    }

    // exercício 3
    public static void podeComprar(int podeComprar) {
        if (podeComprar >= 16) {
            System.out.println("Pode comprar");
        } else {
            System.out.println("Não pode comprar!");

        }
    }

    // exercício 4
    public static void Correios(String estado) {
        switch (estado) {
            case "São Paulo":
                System.out.println("Seu frete é de: " + 15.00);
                break;

            case "Minas Gerais":
                System.out.println("Seu frete é de: " + 12.00);
                break;

            case "Rio de Janeiro":
                System.out.println("Seu frete é de: " + 17.00);
                break;

            default:
                System.out.println("Estado não informado, favor informar um estado");
                break;
        }
        System.out.println("________________________________");
    }

    // exercício 5
    public static void Concessionaria(String modelo, int preco) {
        // Scanner price = new Scanner(System.in);
        // preco = price.nextDouble();

        // Scanner model = new Scanner(System.in);
        // modelo = model.next();

        if (preco != 0 && modelo != "") {
            double entrada = (preco * 0.30);
            double parcela = preco / 12;

            System.out.println(
                    "O carro " + modelo + " tem entrada de " + entrada + " e parcelas a partir de: " + parcela);
        }
        // Não se esse atende o enunciado
        System.out.println("________________________________");
    }

    // exercício 6
    public static void LojaPeixe(int pessoas, int peixe) {

        for (int i = 0; i < 1; i++) {
            int entrada = pessoas * 20;
            int peixes = 12;
            int totalPeixe = peixes * pessoas;
            System.out.printf(
                    "Uma família de %d pessoas, pagou um valor de %d na entrada, pescou %d peixes e seu valor total foi de %d \n",
                    pessoas, entrada, peixe, totalPeixe);
        }

        // Não entendi o enunciado
        System.out.println("________________________________");
    }

    // exercício 7
    public static void PetShop(double peso, double consumo) {

        double pesoEmGramas = peso / 1000;
        double diasDeDuracao = (peso / consumo);

        double sobra = (pesoEmGramas % consumo);

        System.out.printf("A ração irá durar %.1f \n", diasDeDuracao);
        System.out.println("A sobra é " + sobra + " gramas");
        System.out.println("-------------------------------------");

    }

    // exercício 8
    public static void MiniMercado(double totalCompra) {

        double parcelas = totalCompra / 6;
        if (parcelas < 20.00) {
            System.out.println("Não é possível parcelar compra cuja a parcela é menor que R$20,00");
        } else {
            System.out.printf("Sua compra pode ser parcelada em 6x de %.2f \n", parcelas);
        }
        System.out.println("________________________________");
    }

    // Exercício 9
    public static void OlaMundo() {
        System.out.println("Olá mundo");
    }

    // Exercício 10
    public static void parImpar(int numero) {

        if ((numero % 2) == 0)
            System.out.println("par");
        else
            System.out.println("impar");

        System.out.println("________________________________");
    }

    // Exercício 10
    public static void SomaNum(int N) {
        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma = soma += i;
            System.out.println("Soma = " + soma);
        }

        System.out.println("________________________________");

    }

    // Exercício 10
    public static void NumPrimo(final int num) {

        int result = 0;
        for (int i = 2; i <= num / 2; i++) {

            if ((num % i) == 0) {
                result++;
            }
        }

        if (result == 0) {
            System.out.println("Seu número " + num + " é um número primo");
        } else {
            System.out.println("Seu número " + num + " não é um número primo");
        }

        System.out.println("________________________________");

    }

    // public static void NumInteiro() {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Digite num 1");
    // int num1 = sc.nextInt();

    // System.out.println("Digite num 2");
    // int num2 = sc.nextInt();

    // System.out.println("Digite num 3");
    // int num3 = sc.nextInt();

    // if (num1 > num2 && num1 > num3) {
    // System.out.println("Maior número é " + num1);

    // } else if (num2 > num1 && num2 > num3) {
    // System.out.println("Maior número é " + num2);

    // } else if (num3 > num2 && num3 > num1) {
    // System.out.println("Maior número é " + num3);
    // } else {
    // System.out.println("Impossível calcular devido a falta de números");
    // }

    // System.out.println("________________________________");

    // sc.close();

    // }

    public static void Palindromo(String palavra) {

        String palindromo = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(palindromo)) {
            System.out.println("Sua palavra " + palavra + " é um palindromo");
        } else {
            System.out.println("Sua palavra " + palavra + " não é um palindromo");
        }

        System.out.println("________________________________");
    }

    public static void Vogais(final String frase) {

        String[] vogais = { "a", "e", "i", "o", "u" };
        String fraseModificada = frase.toLowerCase();

        String[] letras = fraseModificada.split("");
        System.out.println(Arrays.toString(letras));
        System.out.println(fraseModificada);

        int quantidadeVogais = 0;

        for (String vogal : vogais) {
            for (String letra : letras) {
                System.out.println("A vogal é: " + vogal);
                System.out.println("A letra é: " + letra);

                if (vogal.equals(letra)) {
                    quantidadeVogais += 1;
                }
            }
        }

        System.out.println("A quantidade de vogais é " + quantidadeVogais);
        System.out.println("________________________________");

    }

    // soma de seus anteriores.
// n(3) = 2+1 = 3(n);

    public static void SeqFibonacci(int N) {

        int A,B,C;
        A = -1;
        B = 1;
        C = 10;


        for(int i = 0; i < C; i++){
            N = A + B;
            A = B;
            B = N;
            System.out.println("Fibonacci "+ N);

        }

    }

}
