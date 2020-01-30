import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

import javax.lang.model.type.NullType;

public class HelloWorld {
    public static void main(final String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        for(Integer i : ll){
            System.out.println(i);
        }


        
        
    }
}

