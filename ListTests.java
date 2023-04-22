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
        List<String> input1 = new ArrayList<>();
        input1.add("1");
        input1.add("4");
        input1.add("5");
        List<String> input2 = new ArrayList<>();
        input2.add("2");
        input2.add("3");
        input2.add("7");
        List<String> expected = new ArrayList<>();
        expected.add("1");expected.add("2");expected.add("3");
        expected.add("4");expected.add("5");expected.add("7");
        assertEquals(expected, ListExamples.merge(input1, input2));
    }
    
}
