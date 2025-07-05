import java.util.Scanner;
class Reverse_word_inString{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    String a=sc.nextLine();
    String[] arr=a.split("\\s+");
    for(String word:arr){
      StringBuilder str=new StringBuilder(word);
      System.out.print(str.reverse()+" ");
    }
  }
}
