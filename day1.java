public class day1 {
    public  static void main(String[] args){
        
        
        int[] arm={1,2,3,4,5};
         int max=arm[0];
        for(int i=0;i<=4;i++){
            for (int j=1;j<=1;j++){
                if(arm[i]<arm[j]){
                    max=arm[j];
                  
  
                }
                max=arm[i];
                


            }
            

            
            
        }
        System.out.println(max);
        
    }
    
}
