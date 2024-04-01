import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe a quantidade de horas trabalhadas no mês:");
    double horas = ler.nextDouble();
    double salario = horas * 20;
    System.out.println("O salário é de: " + salario);
  }
}