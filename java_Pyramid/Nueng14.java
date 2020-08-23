public class nueng14 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
    	{
            for(int j=i;j>1;j--)
	    {
                System.out.print(" ");
            }
            System.out.print(i+""+(i+1));
            for(int j=nueng;j>i;j--)
	    {
                System.out.print("  ");
            }
            System.out.println((i+1)+""+i);
        }
    }
}
