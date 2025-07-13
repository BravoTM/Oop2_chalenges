package Array_Challenges;

public class ArrayChallenge {

    public static void main(String[] args){

        String[] ORDER_IDS = {"C200","D298","C234","A234","SVJFO"};

        for(String item: ORDER_IDS){
            if(item.startsWith("C")){
                System.out.println(item);
            }
        }
    }
    
}
