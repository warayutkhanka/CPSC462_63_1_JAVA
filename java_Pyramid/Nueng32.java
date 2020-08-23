public class nueng32
{
    public static void main(String den[])
    {
        int nueng=3;
        for(int i=1;i<=nueng*2-1;i++)
	{
            for(int j=1;j<=(nueng*2-i+2);j++)
	    {
                System.out.print(j);
            }
            for(int j=nueng;j<=nueng+i+1;j++)
	    {
                System.out.print("*");
            }
            System.out.println(nueng-(nueng-2)+i);
        }
    }
}
