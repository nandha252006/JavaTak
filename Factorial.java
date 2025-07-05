import java.util.Scanner;
class Factorial{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt(),ans=1;
    for(int i=a;i>=1;i--){
      ans*=i;
    }
    System.out.println(ans);
  }
}
