import java.util.Scanner;
class PowerNum{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int pow=sc.nextInt();
    int ans=1;
    for(int i=pow;i>=1;i--){
      ans*=num;
    }
    System.out.println(ans);
  }
}
