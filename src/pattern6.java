public class pattern6 {
    static void p6(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p6(5);
    }
}
