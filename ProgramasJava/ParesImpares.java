import java.util.Scanner;

public class ParesImpares{

  public static void main(String[] args) {

     int sup, inf;

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite número inferior : \n");
    inf = entrada.nextInt();
    System.out.print("Digite número superior : \n");
    sup = entrada.nextInt();

    
    for (int i=inf; i<=sup; i++){
      if(i%2 == 0){
       System.out.println("\n"+i+" es par");
      }
    }
    System.out.println();
    int i = inf;
    while(i<=sup){
      if(i%2 == 1){
        System.out.println("\n"+i+" es impar");
      }
      i++;    

    }
    

  }
}
