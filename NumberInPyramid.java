class NumberInPyramid{
public static void main (String [] args){
  int d = 5;
  //outer loop for the row 
  for (int i = 1; i<=d; i++){
   //inner loop
  for(int j=1; j<=d-i+1; j++){
    System.out.print(j+" ");
    }
  System.out.println(); 
  } 
 }
}