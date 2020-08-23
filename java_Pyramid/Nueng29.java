public class nueng29 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i<=nueng;i++)
	{
            System.out.print(i+"*"+(i+2));
            for(int j=1;j<=i+2;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
