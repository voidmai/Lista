import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o valor da hora aula:");
    double valorHora = ler.nextDouble();
    System.out.println("Informe o número de horas trabalhadas no mês:");
    double horas = ler.nextDouble();
    System.out.println("Informe o percentual de desconto do INSS:");
    double desconto = ler.nextDouble();
    double salarioBruto = valorHora * horas;
    double salarioLiquido = salarioBruto - (salarioBruto * desconto / 100);
    System.out.println("O salário líquido é de: " + salarioLiquido);
  }
}