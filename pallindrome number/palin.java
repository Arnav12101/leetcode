public class palin
{
    public static void main(String[] args) {
        System.out.println(ispalin(1111));
    }

    static boolean ispalin(int x)
    {
        int newnum=0;
        int check = x;
        while(x>0)
        {
            int rem = x%10;
            x /= 10;
            newnum = newnum*10 + rem;
        }
        System.out.println(newnum);

        if(newnum == check)
        {
            return true;
        }
        return false;
    
    }
}