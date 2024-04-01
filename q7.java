import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o peso:");
    double peso = ler.nextDouble();
    System.out.println("Informe a altura:");
    double altura = ler.nextDouble();
    double imc = peso / (altura * altura);
    System.out.println("O IMC é de: " + imc);
    if (imc > 30){
      System.out.println("Você está obeso.");
    } else {
      System.out.println("Você não está obeso.");
    }
  }
}