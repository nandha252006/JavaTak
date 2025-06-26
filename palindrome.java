import java.util.Scanner;
public class palindrome{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int leng=num;
    int l;
    int len=String.valueOf(num).length();
    int revnum=0;
    for(int i=len-1;i>=0;i--){
      l=leng%10;
      revnum+=(l*(Math.pow(10,i)));
      leng/=10;
    }
    if(revnum==num){
      System.out.println(num +" is a palindrome");
    }
  }
}
