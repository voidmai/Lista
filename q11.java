import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o primeiro valor:");
    double valor1 = ler.nextDouble();
    System.out.println("Informe o segundo valor:");
    double valor2 = ler.nextDouble();
    double soma = valor1 + valor2;
    if (soma >= 10){
      soma += 5;
    } else {
      soma -= 7;
    }
    System.out.println("O resultado é de: " + soma);
  }
}