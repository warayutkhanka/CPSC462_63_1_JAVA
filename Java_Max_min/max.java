class x {
  public static void main(String args[]){ 
   int max = 0; 
   for(int i=1; i < args.length; i++){ 
     if(Integer.parseInt(args[i]) > max){ 
       max = Integer.parseInt(args[i]); 
   } 
  } 
    System.out.println(max); 
 } 
}