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

    public Imprecision()
    {
        x = 12345.6789e200;
        y = 1/x;
        z = x*y;
        
    }
    
    public void sampleMethod()
    {
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    }
}