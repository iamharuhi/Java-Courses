
public class Administrator extends HospitalEmployee
{
    private String department;


    public Administrator(String dept, String name, int num, int pay)
    {
        super(num, pay, name);
        department = dept;
    }

    public void setDepartment(String dept)
    {
        department = dept;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public void administrate()
    {
        System.out.println(name + " is in the " + department + " department");
    }
    
    public String toString()
    {
        String result = super.toString() + " is in the " + department + " department";
        return result;
    }
}
