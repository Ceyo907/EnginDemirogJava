package EnginDemirogJavaGun03Odev._03_Odev.dataAccess.CourseData;

import EnginDemirogJavaGun03Odev._03_Odev.entities.Course;

public interface CourseDao {
    //CourseDao ile ilgili olan alternatifler (HibernateCourseDao , JdbcCourseDao) add operasyonu içerir.

    void add(Course course);


}
