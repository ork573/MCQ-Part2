
/**
 * Write a description of class BootTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoolTest

{

private int one;

public BoolTest(int newOne)

{

one = newOne;

}

public  int getOne()

{

return one;

}
public boolean isGreater1(BoolTest other)

    {
        System.out.println(one > other.one);
        return one > other.one;
    }
    public boolean isGreater2(BoolTest other)

    {
        System.out.println( one > other.getOne());
        return one > other.getOne();
    }
    public boolean isGreater3(BoolTest other)

    {
        System.out.println(getOne() > other.one);
        return getOne() > other.one;
    }
}