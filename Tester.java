public class Tester {
    public static void main(String args[]){
        //first we create a few HospitalEmployees
        //let's make six, but only initialize three
        HospitalEmployee ethan = new HospitalEmployee(123, 52504, "Ethan");
        HospitalEmployee jane = new HospitalEmployee(124, 54057, "Jane");
        HospitalEmployee julia = new HospitalEmployee(125, 10536, "Julia");
        HospitalEmployee mike;
        HospitalEmployee denise;
        HospitalEmployee jared;

        //now we're going to view the three we've already initialized
        System.out.println(ethan + "\n" + jane + "\n" + julia);
        //this next line just gives out output more readability
        System.out.println("\n\t-----END BLOCK 1-----\n");

        //next step in initializing our other three employees, let's make them all different
        mike = new Doctor("Internal Medicine", "Mike", 126, 92928);
        denise = new Nurse(127, "Denise", 9, 95189);
        jared = new Administrator("Finance", "Jared", 128, 15232);

        //now we can veiw those new employees
        System.out.println(mike + "\n" + denise + "\n" + jared);
        //for readability
        System.out.println("\n\t-----END BLOCK 2-----\n");

        //clearly this much works, but our first three employees are too generic
        //let's assign two of them to be the last two types of employee
        ethan = new Surgeon(true, "Ethan", 129, 52504, "Severe Trauma");
        jane = new Janitor("Maintenance", "Jane", 130, 54057,  false);
        //as you can see, even though our objects had certain values, preforming polymorphism on them
        //means we need to reassign those values

        //now let's print everyone
        System.out.println(mike + "\n" + denise + "\n" + jared + "\n" + ethan + "\n" + jane + "\n" + julia);
        System.out.println("\n\t-----END BLOCK 3-----\n");
        //if you haven't yet, run the program now
        //now find block 3 in the output
        //as you can see, each different object has different data and prints different amounts of information
        //you can also see that our polymorphism worked

        //at this point, you should try adding more polymorphism to get a hang of it
        //see what methods can and can't be called in each object
        //---------ADD YOUR OWN CODE HERE:

        System.out.println("You should have put some code here");

        System.out.println("\n\t-----END BLOCK 4-----\n");

        //This section tests that every method you're supposed to have exists and works
        HospitalEmployee h = new HospitalEmployee(131, 1, "Employee");
        Doctor d = new Doctor("Pediatrics", "Doctor", 132, 10);
        Nurse n = new Nurse(133, "Nurse", 5, 100);
        Surgeon s = new Surgeon(false, "Surgeon", 134, 1000, "Cardiology");
        Administrator a = new Administrator("Finance", "Admin", 135, 10000);
        Janitor j = new Janitor("Maintenance", "Janitor", 136, 100000, true);

        h.work();
        h.setName("HospitalEmployee");
        h.setNumid(1);
        h.setName(h.getName());
        h.setNumid(h.getNumid());
        h.work();

        System.out.println();

        d.diagnose();
        d.setSpeciality("Internal Medicine");
        d.setSpeciality(d.getSpeciality());
        d.diagnose();

        System.out.println();

        n.assist();
        n.setNumPat(3);
        n.setNumPat(n.getNumPat());
        n.assist();

        System.out.println();

        s.operate();
        s.setOper(true);
        s.setOper(s.getOper());
        s.operate();

        System.out.println();

        a.administrate();
        a.setDepartment("Research");
        a.setDepartment(a.getDepartment());
        a.administrate();

        System.out.println();

        j.isSweeping();
        j.setSweeping(false);
        j.setSweeping(j.getSweeping());
        j.isSweeping();

        System.out.println("\n\t-----END TEST CASE-----\n");
    }
}