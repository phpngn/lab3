import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test 
	public void testMerge() {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    
    list2.add("airplane");
    list2.add("banana");
    list2.add("day");
    List<String> result = ListExamples.merge(list1, list2);

    List<String> list3 = new ArrayList<>();
    list3.add("airplane");
    list3.add("banana");
    list3.add("day");
    
    assertEquals(list3.size(), result.size());
    for(int i = 0; i < list3.size(); i++)
    {
        assertEquals(result.get(i), list3.get(i));
    }
    }
}