import java.util.Scanner;
public class AmstrongNumber{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int leng=num;
    int l,an=0;
    int len=String.valueOf(num).length();
    for(int i=0;i<len;i++){
      l=leng%10;
      an+=(Math.pow(l,len));
      leng/=10;
    }
    if(an==num){
      System.out.println(num +" is amstrong number");
    }
  }
}
