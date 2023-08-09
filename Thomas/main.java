import java.util.Scanner;

public class main{

public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    System.out.println("informe um numero");
    int a = scan.nextInt();
    System.out.println("Informe outro numero");
    int b = scan.nextInt();
    System.out.println("O resultado é: "+ a+b);
}

}