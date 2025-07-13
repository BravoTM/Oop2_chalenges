package Array_Challenges;

import java.util.Random;

public class OrderIDGenerator {

    public static void main(String[] args) {
        
    

    Random random = new Random();
    String[] ORDER_IDS = new String[5];

    for(int i=0;i<ORDER_IDS.length;i++){
       
        char prefix = (char)('A' + random.nextInt(26));

        int number = random.nextInt(999) +1;

        String suffix = String.format("%03d", number);

        ORDER_IDS[i] = prefix + suffix;

    }

    

    for(String item: ORDER_IDS){
        System.out.println(item);
    }

}
    
}
