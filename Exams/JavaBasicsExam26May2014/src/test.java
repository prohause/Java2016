import java.util.ArrayList;
import java.util.List;

/**
 * Created by proha on 17-Apr-16.
 */
public class test {
    public static void main(String[] args) {
        List<StringBuilder> lines = new ArrayList<>();
        lines.add(new StringBuilder("000000"));
        lines.add(new StringBuilder("111111"));
        lines.add(new StringBuilder("111111"));
        lines.add(new StringBuilder("111111"));


        lines.get(0).setCharAt(1,'1');
        System.out.println(lines.get(0));
    }


}
