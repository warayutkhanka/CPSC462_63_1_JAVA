public class nueng18 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
	{
            System.out.print(i);
            for(int j=1;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.print(i);
            for(int j=nueng;j>=i;j--)
	    {
                System.out.print("*");
            }
            System.out.println(nueng*2-i);
        }
    }
}
