
public class Surgeon extends Doctor
{
    boolean operating;


    public Surgeon(boolean isoper, String name, int num, int pay, String s)
    {
        super(s, name, num, pay);
        operating = isoper;
    }

    public void setOper(boolean isoper)
    {
        operating = isoper;
    }
    
    public boolean getOper()
    {
        return operating;
    }
    
    public void operate()
    {
        if (operating = true)
        System.out.println(name + " is operating");
        else
        System.out.println(name + " is not operating");
    }
    
    public String toString()
    {
        String result = super.toString();
        if (operating = true)
        result += " is operating";
        else
        result += " is not operating";
        return result;
    }
}
