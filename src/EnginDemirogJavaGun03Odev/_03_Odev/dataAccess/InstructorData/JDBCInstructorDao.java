package EnginDemirogJavaGun03Odev._03_Odev.dataAccess.InstructorData;

import EnginDemirogJavaGun03Odev._03_Odev.entities.Instructor;

public class JDBCInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi");

    }
}
