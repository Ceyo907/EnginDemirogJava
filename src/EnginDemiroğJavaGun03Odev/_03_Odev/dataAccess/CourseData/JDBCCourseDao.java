package EnginDemiroğJavaGun03Odev._03_Odev.dataAccess.CourseData;

import EnginDemiroğJavaGun03Odev._03_Odev.entities.Course;

public class JDBCCourseDao implements CourseDao{
    @Override
    public void add(Course course) {

        System.out.println("JDBC ile veritabanına eklendi");

    }
}
