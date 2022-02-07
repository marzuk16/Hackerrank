import java.util.*;

public class BoxCapacity{
    
    public static int[] findBoxes(Integer capacity, Integer[] boxes){
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<boxes.length; i++){
            map.put(boxes[i], true);
        }
        
        int a = 0, b = 0;
        for(int i=0; i<boxes.length; i++){
            Integer need = capacity - boxes[i];
            if(map.get(need) ){
                a = boxes[i];
                b = need;
                break;
            }
        }
        return new int[] {a, b};
    }
    public static void main(String args[]) {
        Integer capacity = 10;
        // Integer[] boxes = {3, 5, 9, 4, 12, 1, 8, 7};
        Integer[] boxes = {5};

        System.out.println(findBoxes(capacity, boxes)[0]);
        System.out.println(findBoxes(capacity, boxes)[1]);
    }
}