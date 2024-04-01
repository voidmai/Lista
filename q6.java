import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe a nota da primeira prova:");
    double nota1 = ler.nextDouble();
    System.out.println("Informe a nota da segunda prova:");
    double nota2 = ler.nextDouble();
    System.out.println("Informe a nota do trabalho:");
    double trabalho = ler.nextDouble();
    double media = (nota1 + nota2 + trabalho) / 3;
    System.out.println("A média é de: " + media);
    if (media >= 7){
      System.out.println("Aprovado.");
    } else {
      System.out.println("Reprovado.");
    }
  }
}