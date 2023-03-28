class NegArSize_Excep
{
    public static void main(String[] args)
    {  int[] a=new int[-4];
        // it will throw Negative Array Size Exception at run time however it will get compiled. 
        a[0]=10;
    }
}