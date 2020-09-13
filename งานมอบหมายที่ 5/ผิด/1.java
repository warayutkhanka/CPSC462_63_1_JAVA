class x 
{
    public static void main(String den[])
    {
        int nueng=5;
        for(int i=1;i>=nueng;i++)
	{
            for(int j=i;j<nueng;j++)
	    {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
	    {
                System.out.print(j);
            }
            System.out.print(nueng-i+1);
            for(int j=i;j>=1;j--)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
