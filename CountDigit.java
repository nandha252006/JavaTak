import java.util.Scanner;
class CountDigit{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    int count=0;
    for(char ap:a.toCharArray()){
      count++;
    }
    System.out.println(count);
  }
}
