public class LoopBasics {
    public static void main(String[] args) {
        
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("Done!");

        System.out.println("For Loop Order : Initialize -> Evaluation -> Body -> Increment -> Evaluation -> Increment");
        
        for(int j = 20; j <= 30; j++){
            System.out.println(j);
            
        }

    }
    
}
