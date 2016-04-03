import java.util.*;

/**
 * Created by joro on 3/30/2016.
 */
public class LargestIncreasingSequence {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split("\\s+");

        List<Sequence> sequences = new ArrayList<>();
        Sequence lastSequence = null;

        for (int i=0;i<strings.length; i++) {
            int current = Integer.parseInt(strings[i]);
            boolean newSeq = lastSequence==null;
            //Start a sequence
            if(newSeq){
                //This must be the first seq.
                lastSequence = new Sequence(current);
            } else {
                //Check if this is an ongoing sequence, if so, modify, else insert it and start a new one
                int lastValue = lastSequence.getLast();
                if(lastValue<current){
                    //Carry on
                    lastSequence.add(current);
                } else {
                    //Stop the sequence, and create a new one, with the current element
                    sequences.add(lastSequence);
                    lastSequence = new Sequence(current);
                }
            }
        }
        if(sequences.size()>0){
            Sequence leftMostLargest = Collections.max(sequences);
            if(leftMostLargest==null) return; //No items..
            for(Sequence seq: sequences){
                System.out.println(seq.value);
            }
            System.out.println(String.format("Longest: %s", leftMostLargest.value));

        }

    }

}
