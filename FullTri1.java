import java.util.Scanner;
class FullTri1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for(int i=0;i<num;i++){
      for(int a=0;a<=num-i;a++){
        System.out.print(" ");
      }
      for(int a=0;a<=i;a++){
        System.out.print("*"+" ");
      }
      System.out.println();
    }

  }
}
