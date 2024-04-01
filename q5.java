import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o primeiro número:");
    double num1 = ler.nextDouble();
    System.out.println("Informe o segundo número:");
    double num2 = ler.nextDouble();
    if (num1 > num2){
      System.out.println("O maior número é: " + num1);
    } else {
      System.out.println("O maior número é: " + num2);
    }
  }
}