package demo1;

import java.util.*;

public class first {
    public static void main(String args[])
    {
        Set<String> set = new HashSet<String>();

        set.add("test1");
        set.add("test2");
        set.add("test3");
        set.add("test3");

        System.out.println(set);
    }
}