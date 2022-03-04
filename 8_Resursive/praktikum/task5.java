import java.util.*;
//Most appear item
public class task5 {
    public static void main(String[] args) {
       String[] text = {"js","js","ruby","ruby","golang","js","js"};

        List list = Arrays.asList(text);
        Set<String> set = new HashSet<String>(list);

        for (String s: set){
            System.out.println(s+"->"+ Collections.frequency(list,s));
        }
    }
}