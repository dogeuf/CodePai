public class Carro{
//Atributos de la clase
    private static String color;
    private static String marca;
    private static String modelo;
    

  public static void main(String[] argv){
    Valores("Azul", "Susuki", "2022");
    System.out.print("Este es un carro de color "+color+" De marca "+marca+" Modelo "+modelo);
  }
public static void Valores(String col, String mar, String mod){
color= col; marca=mar; modelo=mod;
}

}