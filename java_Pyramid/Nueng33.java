public class nueng33 
{
    public static void main(String den[])
    {
        int nueng=4;
            for(int i=1;i<=nueng;i++)
	    {
                for(int j=i;j<=nueng+1;j++)
		{
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++)				{
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1;i<nueng;i++)				    {
                for(int j=1;j<=i+2;j++)					{
                    System.out.print(" ");
                }
                for(int j=i;j<=(nueng-1)*2-i;j++)
		{
                    System.out.print("*");
                }
                System.out.println();
            }
       
    }
}
