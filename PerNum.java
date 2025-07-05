import java.util.Scanner;
class PerNum{
  public static String PerfectNum(int num){
    int sum=0;
    for(int i=1;i<num;i++){
      if(num%i==0){
        sum+=i;
      }
    }
    return num==sum ? "It is a Perfect Number":"Not a Perfect Number";
  }
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int num=sc.nextInt();
    String word=PerfectNum(num);
    System.out.println(word);
  }
}
