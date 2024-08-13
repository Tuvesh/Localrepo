class Pattern{
public static void main(String[] args){
    int l = 4;
    int s = 5;
    for(int i=1; i<=l; i++){
     for(int j=1; j<=s; j++){
       if(i==1 || j==1 || i ==l || j==s){
        System.out.print("*");
       }
      else{
      System.out.print(" ");
       }
     }
     System.out.println();
   }
 }
}