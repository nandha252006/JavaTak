import java.util.Scanner;
class V_And_Inverted{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=65+a-1;
    System.out.println("Normal V:");
    for(int i=0;i<a;i++){
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      for(int k=0;k<a-i;k++){
        if(k==0){
          char c=(char)b;
          System.out.print(c);
        }
        else{
          System.out.print(" ");
        }
      }
      for(int k=0;k<a-i-1;k++){
        if(k==a-i-2){
          char c=(char)b;
          System.out.print(c);
          b--;;
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    System.out.println("Inverted V:");
    b=65+a-1;
    for(int i=0;i<a;i++){
      for(int j=0;j<a-i-1;j++){
        System.out.print(" ");
      }
      for(int k=0;k<=i;k++){
        if(k==0){
          char c=(char)b;
          System.out.print(c);
        }
        else{
          System.out.print(" ");
        }
      }
      for(int k=0;k<i;k++){
        if(k==i-1){
          char c=(char)b;
          System.out.print(c);
        }
        else{
          System.out.print(" ");
        }
      }
      b--;
      System.out.println("");
    }
  }
}
