import java.util.Scanner;
class SolidAndHallow_Rhombus{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
      for(int s=0;s<a-i;s++){
        System.out.print(" ");
      }
      for(int j=0;j<a;j++){
        System.out.print("*");
      }
      System.out.println("");
    }
    for(int i=0;i<a;i++){
      for(int s=0;s<a-i;s++){
        System.out.print(" ");
      }
      for(int j=0;j<a;j++){
        if((i>0 && i<a-1) &&(j>0 && j<a-1)){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
        }
      }
      System.out.println("");
    }
  }
}
