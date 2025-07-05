import java.util.Scanner;
class Diamond{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
      for(int m=0;m<a-i;m++){
        System.out.print(" ");
      }
      for(int n=0;n<=i;n++){
        System.out.print("*");
      }
      for(int o=0;o<i;o++){
        System.out.print("*");
      }
      System.out.println("");
    }
    for(int i=0;i<a;i++){
      for(int m=0;m<i+1;m++){
        System.out.print(" ");
      }
      for(int n=0;n<a-i;n++){
        System.out.print("*");
      }
      for(int o=0;o<a-i-1;o++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
