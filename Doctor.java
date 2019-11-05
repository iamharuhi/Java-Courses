
public class Doctor extends HospitalEmployee
{
    private String speciality;


    public Doctor(String s, String name, int num, int pay)
    {
        super(num, pay, name);
        speciality = s;
    }

    public void setSpeciality(String special)
    {
        speciality = special;
    }
    
    public String getSpeciality()
    {
        return speciality;
    }
    
    public void diagnose()
    {
        System.out.println(name + " is a " + speciality);
    }
    
    public String toString()
    {
        String result = super.toString() + " " + speciality;
        return result;
    }
    
    
}
