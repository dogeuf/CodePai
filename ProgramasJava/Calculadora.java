import java.util.Scanner;

public class Calculadora {

  public float operacion(float num1, float num2, float op){

    float a = 0;

    if (op == 1){

      a = (suma(num1, num2));

    }else if(op == 2){
      a = (resta(num1, num2));

    }else if(op == 3){
      a = multi(num1, num2);

    }else if (op == 4){
      a = (division(num1, num2));

    }
    return a;
  }
  
    public float suma(float num1, float num2){
    float suma = num1 + num2;
    return suma;
    //System.out.println("La suma de los numeros " + num1 + " + "+ num2 + " = " + suma);

  }
    public float resta(float num1, float num2){
    float resta = num1 - num2;
    return resta;
    //System.out.println("La resta de los numeros " + num1 + " - "+ num2 + " = " + resta);

  }
    public float multi(float num1, float num2){
    float multi = num1 * num2;
    return multi;
    //System.out.println("La multiplicación de los numeros " + num1 + " * "+ num2 + " = " + multi);

  }
    public float division(float num1, float num2){
    float division = num1 / num2;
    return division;
    //System.out.println("La división de los numeros " + num1 + " / "+ num2 + " = " + division);

  }

  public static void main(String[] args) {

  //System.out.println("Digite los datos (num1, num2, op): \n 1. Suma \n 2. Resta\n 3. Multiplicación\n 4. Division");
    
    float num1, num2, op;

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite número 1: \n");
    num1 = entrada.nextFloat();
    System.out.print("Digite número 2: \n");
    num2 = entrada.nextFloat();
    System.out.print("Digite la operacion: \n 1. Suma \n 2. Resta\n 3. Multiplicación\n 4. Division\n");
    op = entrada.nextFloat(); 

    Calculadora opob = new Calculadora();
  
    float resultado = opob.operacion(num1, num2, op);

    

    
     System.out.print("El resultado de la operacion es: "+ resultado);
  }
}