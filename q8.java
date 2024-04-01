import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o raio:");
    double raio = ler.nextDouble();
    double area = 3.14 * (raio * raio);
    System.out.println("A área é de: " + area);
  }
}