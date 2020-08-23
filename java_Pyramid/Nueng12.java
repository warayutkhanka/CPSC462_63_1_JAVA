public class nueng12 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
	{
            for(int j=1;j<i;j++)
	    {
                System.out.print(" ");
            }
            for(int j=i;j<=(nueng*2-i);j++)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
