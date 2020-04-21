
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GadgetTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Skill_5A
{
    public static void main(String[] args){
        Gadget a = new Gadget();
        //The code below does indeed compile, indicating that is is setting a static variable
        Gadget.setStatus(3);
        Gadget b = new Gadget();
    }
}
