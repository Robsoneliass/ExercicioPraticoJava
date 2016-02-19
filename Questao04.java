public class Questao04{
  public static void main(String[]args){
    int m [][] = new int[][]{
      {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])},
      {Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5])},
      {Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8])}
    };
    System.out.print(m[0][1] +" "+m[2][1]);
  }
}
