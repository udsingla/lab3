import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test 
    public void testFilter(){
        List<String> input = new ArrayList<>();
        input.add("Hello");
        input.add("World");
        input.add("Uday");
        List<String> expected = new ArrayList<>();
        expected.add("Hello"); expected.add("World");
        StringChecker sc = new StringCheck("l");
        assertEquals(expected, ListExamples.filter(input, sc));

    }

    @Test
    public void testMerge(){
        
    }
    
}
