package EnginDemiroğJavaGun03Odev._03_Odev.dataAccess.InstructorData;

import EnginDemiroğJavaGun03Odev._03_Odev.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
