class FloydTriangle{
public static void main(String[] args){
  int st = 5; 
  int randomno = 1;
  //outer loop for no. of rows
  for(int i=1; i<=st; i++){
  for(int j=1; j<=i; j++){
    System.out.print(randomno+" ");
     randomno++;
     }
   System.out.println();
   }
  }
}