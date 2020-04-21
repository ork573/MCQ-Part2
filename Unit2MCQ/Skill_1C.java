

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ThingTest.
 * Code is not supposed to compile: the code below returns an error to demonstrate
 * someThing is not initialized
 */
public class Skill_1C
{
    public static void main(String[] args){
        Thing someThing;
        Thing someThing2 = new Thing();
        someThing2.getColor();
        someThing.getColor();
    }
}
