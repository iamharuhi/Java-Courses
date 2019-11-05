public class HospitalEmployee
{
    protected int numid;
    protected String name;
    protected int pay;
    

    public HospitalEmployee(int n, int p, String s)
    {
        numid = n;
        pay = p;
        name = s;
    }

    public void setName(String s)
    {
        name = s;
    }
    
    public void setNumid(int i)
    {
        numid = i;
    }
    
    public void setPay(int p)
    {
        pay = p;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumid()
    {
        return numid;
    }
    
    public void work()
    {
        System.out.println(name + ", works for the Hospital");
    }
    
    public int getPay()
    {
        return pay;
    }
    
    public String toString()
    {
        String result = name + " " + numid;
        return result;
    }
}
