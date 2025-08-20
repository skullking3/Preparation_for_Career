public class pat17 {
    
  public static void main(String[] args) {
    
     int n=5;
      
      for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
              System.out.print(" ");
            }
          char c = 'A';
          int b = (2*i+1)/2;
          for(int j=1;j<=2*i+1;j++){
              
              System.out.print(c);
              if(j <= b) c++;
              else c--;
          }
          for(int j=0;j<n-i-1;j++){
              System.out.print(" ");
          }
          
          System.out.println();
        }
}
}

   
  
  

