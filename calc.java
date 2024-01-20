 class calc
{
    public float Sum(int x,int y)
    {
        return x + y;
    }
    public float Diff(int x,int y)
    {
        return x - y;
    }
    public float Prod(int x,int y)
    {
        return x * y;
    }
    public float Div(int x,int y)
    {
        return x / y;
    }
}

class calculator
{
    public static void main(String args[])
    {
    calc a = new calc();
    System.out.println("Sum is:" +a.sum(2,6))
    System.out.println("Difference is:" +a.diff(2,3))
    System.out.println("Product is:" +a.prod(2,9))
    System.out.println("Remainder is:" +a.div(2,7))
    
    }
}