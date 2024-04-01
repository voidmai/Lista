import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe sua idade:");
    int idade = ler.nextInt();
    if (idade >= 18){
      System.out.println("Você pode tirar a carteira de motorista.");
    } else {
      System.out.println("Você não pode tirar a carteira de motorista.");
    }
  }
}
