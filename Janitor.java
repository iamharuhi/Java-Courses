
public class Janitor extends Administrator
{
    private boolean sweeping;
    public Janitor(String dept, String name, int num, int pay, boolean sw)
    {
        super(dept, name, num, pay);
        sweeping = sw;
    }

    public void setSweeping(boolean sw)
    {
        sweeping = sw;
    }
   
    public boolean getSweeping()
    {
        return sweeping;
    }
    
    public void isSweeping()
    {
        if (sweeping = true)
        System.out.println(name + " is sweeping");
        else
        System.out.println(name + " is not sweeping");
    }
    
    public String toString()
    {
        String result = super.toString();
        if (sweeping = true)
        result += " is sweeping";
        else
        result += " is not sweeping";
        return result;
    }
}
