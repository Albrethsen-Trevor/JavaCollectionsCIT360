
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
public class ArrayList360 {
    
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(10);
        num.add(100);
        num.add(1000);
        num.add(10000);
        num.add(100000);
        num.add(1000000);
        num.add(10000000);
        
        System.out.println(num.get(0));
        
        System.out.println("\nList #1: ");
        for(int i=0; i < num.size(); i++) {
        System.out.println(num.get(i));
        }
        
        num.remove(num.size() -1);
        
        num.remove(0);

    }
    
}