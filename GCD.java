import java.util.*;
class GCD{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int mul=1;
    while(true){
      if(num1%2==0 && num2%2==0){
        num2/=2;
        num1/=2;
        mul*=2;
      }
      else if(num1%3==0 && num2%3==0){
        num2/=3;
        num1/=3;
        mul*=3;
      }
      else if(num2%5==0 && num1%5==0){
        num2/=5;
        num1/=5;
        mul*=5;
      }
      else{
        break;
      }
    }
    System.out.println(mul);
  }
}
