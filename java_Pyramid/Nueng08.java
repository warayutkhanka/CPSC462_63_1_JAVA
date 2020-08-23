public class nueng08
{
    public static void main(String den[])
    {
        int nueng=7;
        for(int i=1;i<=nueng;i++)
	{
            for(int j =1;j<i;j++)
	    {
                System.out.print(" ");
            }
            System.out.print(i+""+(i+1)+""+(i+2));
            for(int j=0;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}