public class nueng24 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
	{
            System.out.print(i);
            for(int j=1;j<=i*2-1;j++)
	    {
                System.out.print("*");
            }
            for(int j=i;j<=nueng*2-i;j++)
	    {
                System.out.print(i);
            }
	    System.out.print(i);
            System.out.println();
        }
    }
}