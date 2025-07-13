package Array_Challenges;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {

    public static void main(String args[]){
        String pallets[] = {"C200","D298","B234","A234","E111"};

        Arrays.sort(pallets);
        for(String pallet: pallets){
            System.out.println(pallet);
        }

        System.out.println("Reversed Order:");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for(String pallet: palletList){
            System.out.println(pallet);
        }

    }
}