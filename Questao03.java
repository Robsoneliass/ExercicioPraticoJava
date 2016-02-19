public class Questao03{

  public static void main(String[]args){

    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    int n3 = Integer.parseInt(args[2]);
int maior;
int menor;
int meio;

    if(n1>n2 && n1>n3){
    maior = n1;
  } else if (n2>n1 && n2>n3){
    maior = n2;
  } else {
  maior = n3;
  }
   if (n1<n2 && n1<n3){
    menor = n1;

  } else if (n2<n1 && n2<n3){
    menor = n2;

  } else {
    menor = n3;}
 meio = (n1+n2+n3)-(maior+menor);
  System.out.println("a ordem decrescente dos numeros eh: " + maior + " " +meio+ " "+menor);

    }
  }
