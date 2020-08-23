public class nueng04 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
	{
            for(int j=1;j<=i;j++)
	    {
                System.out.print("*");
            }
            for(int j=i;j>=1;j--)
	    {
                System.out.print(j);
            }
            for(int j=1;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}