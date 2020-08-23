public class nueng05 
{
    public static void main(String den[])
    {
        int nueng=4;
        for(int i=1;i<=nueng;i++)
	{
            for(int j=nueng-1;j>=i;j--)
 	    {
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1;j<i;j++)
	    {
                System.out.print("**");
            }
            System.out.println(i);
        }
        for(int i=1;i<nueng;i++)
	{
            for(int j=1;j<=i;j++)
	    {
                System.out.print(" ");
            }
            System.out.print(nueng-i);
            for(int j=nueng-1;j>i;j--)
	    {
                System.out.print("**");
            }
            System.out.println(nueng-i);
        }
    }
}