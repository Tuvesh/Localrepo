class ButterflyPattern{
public static void main(String[] args){
   int d=5;
   int j = 0;
  for (int i = 1; i<=d; i++){
   for (j=1; j<=i; j++){
    System.out.print("*");
    }
    int space= 2 * (d-i);
    for(j=1; j<=space; j++){
        System.out.print(" ");
      }
    for(j=1; j<=i; j++){
     System.out.print("*");
     }
System.out.println();
  }
    for (int i = d; i>=1; i--){
   for (j=1; j<=i; j++){
    System.out.print("*");
    }
    int space= 2 * (d-i);
    for(j=1; j<=space; j++){
        System.out.print(" ");
      }
    for(j=1; j<=i; j++){
     System.out.print("*");
     }
System.out.println();
  }
 }
}