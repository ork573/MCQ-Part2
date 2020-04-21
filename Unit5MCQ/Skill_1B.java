
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BoolTestTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Skill_1B
{
    public static void main(String[] args){
        BoolTest test = new BoolTest(1);
        BoolTest other = new BoolTest(2);
        test.isGreater1(other);
        test.isGreater2(other);
        test.isGreater3(other);
    }

}
