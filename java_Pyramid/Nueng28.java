public class nueng28 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
	{
            for(int j=nueng;j>=i;j--)
	    {
                System.out.print(j);
            }
            for(int j=1;j<=i*2-1;j++)
	    {
                System.out.print("*");
            }
            for(int j=i;j<=nueng;j++)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
