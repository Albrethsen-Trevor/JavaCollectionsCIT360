
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trevoralbrethsen
 */
public class ArrayLinkedList {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumber = new ArrayList<>();
        LinkedList<Integer> linkedNumber = new LinkedList<>();
        
        doTimings("ArrayList", arrayNumber);
        doTimings("LinkedList", linkedNumber);
    
    }
    
    private static void doTimings(String type, List<Integer> list) {
        
        for(int i=0; i<1E7; i++) {
            list.add(i);
        }
        
        long start = System.currentTimeMillis();
        
        for(int i=0; i<1E7; i++) {
            list.add(i);
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
        
    }
    
}
