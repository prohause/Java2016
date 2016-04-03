/**
 * Created by joro on 3/30/2016.
 */

public class Sequence implements Comparable<Sequence>{
    public int length;
    public String value;
    private int mLast;
    public Sequence(int current) {
        add(current);
    }

    @Override
    public int compareTo(Sequence o) {
        return Integer.compare(this.length, o.length);
    }

    public void add(int current) {
        if(value==null) value = "";
        length++;
        value += String.format("%d", current);
        mLast = current;
    }

    public int getLast(){
        return mLast;
    }
}
