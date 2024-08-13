class HalfReversePyramid{
public static void main(String[] args){
  int g = 4; 
  for(int i=1; i<=g; i++ ){
   // inner loop - spcae
    for (int j= 1; j<=g-i; j++){
     System.out.print(" ");
     }
    // inner loop to print *
     for (int j = 1; j<=i; j++){
      System.out.print("*");
     }
   System.out.println();
  }
 }
}