
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SSearchTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SSearchTest
{
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<Integer>();
        elements.add(1);
        elements.add(2);
        elements.add(1);
        sequentialSearch(elements, 1);
        sequentialSearch2(elements, 1);
    }
}
