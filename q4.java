import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe a temperatura do corpo:");
    double temperatura = ler.nextDouble();
    if (temperatura > 37){
      System.out.println("Você está com febre.");
    } else {
      System.out.println("Sua temperatura está normal.");
    }
  }
}