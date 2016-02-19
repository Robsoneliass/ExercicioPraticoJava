public class Questao05{
  public static void main(String[]args){

    int a, b, c, d, e, f, determinante;

 int[][] matriz = new int[][]{
   {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])},
   {Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5])},
   {Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8])}
 };

   a = matriz[0][0] * matriz [1][1] * matriz [2][2];
   b = matriz[0][1] * matriz [1][2] * matriz [2][0];
   c = matriz[0][2] * matriz [1][0] * matriz [2][1];
   d = matriz[0][1] * matriz [1][0] * matriz [2][2];
   e = matriz[0][0] * matriz [1][2] * matriz [2][1];
   f = matriz[0][2] * matriz [1][1] * matriz [2][0];
   determinante = (a + b + c) - (d + e + f);

   System.out.println(determinante);
  }
}
