
/**
 * Program to show imprecision in java
 *
 * @Adam Shaheen adamhshaheen@gmail.com
 * @v1.0 1/12/2026
 */
public class Imprecision
{
    private double x;
    private double y;
    private double z;

    /**
     * Constructor for objects of class Imprecision
     */
    public Imprecision()
    {
        x = 12345.6789e200;
        y = 1/x;
        z = x*y;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    }
}