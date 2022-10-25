package EnginDemirogJavaGun03Odev._03_Odev.business;

import EnginDemirogJavaGun03Odev._03_Odev.core_logging.Logger;
import EnginDemirogJavaGun03Odev._03_Odev.dataAccess.CourseData.CourseDao;
import EnginDemirogJavaGun03Odev._03_Odev.entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception{
        for (Course co:courses) {
            if (co.getCourseName() == course.getCourseName()){
                throw new Exception("Kurs ismi tekrar edemez");
            }

        }
        if (course.getCoursePrice()<=0) {
            throw new Exception("Kurs fiyatı sıfırdan yüksek olmalıdır");
        }


        courses.add(course);
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());

        }


    }


}
