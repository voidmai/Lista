import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe a distância a ser percorrida:");
    double distancia = ler.nextDouble();
    System.out.println("Informe o preço da gasolina:");
    double preco = ler.nextDouble();
    double litros = distancia / 12;
    double gasto = litros * preco;
    System.out.println("A quantidade de gasolina que será preciso é de: " + litros);
    System.out.println("O gasto será de: " + gasto);
  }
}