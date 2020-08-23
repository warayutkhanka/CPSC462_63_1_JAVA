public class nueng21 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
	{
            for(int j=0;j<=((nueng*2)-(i+3));j++)
 	    {
                System.out.print("*");
            }
            System.out.print(i);
            for(int j=i;j>=1;j--)
	    {
                System.out.print("*");
            }
            System.out.println((nueng*2)-(i+2));
        }
    }
}
