import java.util.Scanner;
class PascalTri{
  public static int factorial(int n){
    int fact=1;
    for(int i=2;i<=n;i++){
      fact*=i;
    }
    return fact;
  }
  public static int cal(int n1,int n2){
    return factorial(n1)/(factorial(n2)*factorial(n1-n2));
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    for(int i=0;i<row;i++){
      for(int s=0;s<row-i;s++){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print(cal(i,j)+" ");
      }
      System.out.println();
    }
  }
}
