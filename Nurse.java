
public class Nurse extends HospitalEmployee
{
    private int numPat;

    public Nurse(int num, String name, int np, int pay)
    {
        super(num, pay, name);
        numPat = np;
    }

    public void setNumPat(int p)
    {
        numPat = p;
    }
    
    public int getNumPat()
    {
        return numPat;
    }
    
    public void assist()
    {
        System.out.println(name + " is a nurse with " + numPat + " patients");
    }
    
    public String toString()
    {
        String result = super.toString() + " " + numPat;
        return result;
    }
}
