import java.util.Scanner;
class LeftTri{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
      for(int s=a-i-1;s>=0;s--){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
