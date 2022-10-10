package EnginDemiroğJavaGun03Odev._03_Odev.dataAccess.CourseData;

import EnginDemiroğJavaGun03Odev._03_Odev.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
