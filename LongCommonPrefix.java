import java.util.Scanner;
class LongCommonPrefix{
  public static void main(String[] args){
    String[] arr={"Car","Carrom","Coffee"};
    boolean flg=true;
outer:
    for(int i=0;i<arr[0].length();i++){
      char a=arr[0].charAt(i);
      for(int j=1;j<arr.length;j++){
        if(i>=arr[j].length()||a!=arr[j].charAt(i)){
          flg=false;
          System.out.println(arr[0].substring(0,i));
          break outer;
        }
      }
    }
    if(flg){
      System.out.println(arr[0]);
    }
  }
}
