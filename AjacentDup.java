import java.util.Scanner;
import java.util.StringBuilder;
class AjacentDup{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    StringBuilder str=new StringBuilder();
    String a=sc.nextLine();
    String ia="";
    for(int i=0;i<a.length()-1;i++){
      if(a.charAt(i)!=a.charAt(i+1)){
        str.add(a.charAt(i));
      }
    }
    ia=str.toString();
    System.out.println(ia);
  }
}
