class CodeChallenge {
    
    public static void main(String[ ] args) {
        
          int n = 10;
    	  int offset = n;
          String x = "*";
         
         for(int i = 0; i < n; i++){
             
             for(int j = 0; j < offset; j++){
               
               System.out.print(" ");
             }
           
             System.out.println(x);
             x = x + "A*";
           	 offset = offset-1;
         }
         
    }
}