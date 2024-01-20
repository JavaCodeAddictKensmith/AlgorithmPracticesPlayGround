import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] a= {1,8,10,4,5,5,6,7};
        int[] b= {1,2,3,16,15,20,12};
        ArrayList<Integer> collector = new ArrayList<>();
        for(int i =0; i< a.length;i++){
           collector.add(a[i]);
        }
        for(int i =0; i< b.length;i++){
            collector.add(b[i]);
        }

/*
To sort manually
 */
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        Collections.sort(collector);

    for(int i=0; i<collector.size();i++){

        sortedArray.add(collector.get(i));

    }

        System.out.println("===HELL0==="+ sortedArray);
        String view = "[ ";
        Iterator iterator= collector.iterator();
        while(iterator.hasNext()){
            view += iterator.next() +" ";

        }
        System.out.println("==== "+ view + " ]");


    }
}