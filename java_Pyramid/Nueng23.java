public class nueng23 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
	{
            System.out.print(i);
            for(int j=i;j<=nueng+1;j++)
	    {
                System.out.print("*");
            }
            for(int j=1;j<i;j++)
	    {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
