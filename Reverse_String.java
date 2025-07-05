import java.util.Scanner;
class Reverse_String{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    StringBuilder str=new StringBuilder(a);
    System.out.println(str.reverse());
  }
}
