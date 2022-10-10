package EnginDemiroğJavaGun03Odev._03_Odev.dataAccess.InstructorData;

import EnginDemiroğJavaGun03Odev._03_Odev.entities.Instructor;

public interface InstructorDao {
    //InstructorDao ile ilgili olan alternatifler (HibernateInstructorDao , JdbcInstructorDao) add operasyonu içerir.

    void add(Instructor instructor);

}
