class RevertPattren{
public static void main(String[] args){
 int y=4;
/* for (int i = 1; i<=y; i++){
    for (int j = y; j>=1; j--){
    System.out.print("*");
   }
    System.out.println();*/
 for (int i = y; i >= 1; i--) {
            System.out.println("*".repeat(i));
  }
 }
}