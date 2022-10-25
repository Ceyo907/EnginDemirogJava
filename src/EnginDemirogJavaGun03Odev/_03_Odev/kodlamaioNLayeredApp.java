package EnginDemirogJavaGun03Odev._03_Odev;

import EnginDemirogJavaGun03Odev._03_Odev.business.CategoryManager;
import EnginDemirogJavaGun03Odev._03_Odev.business.CourseManager;
import EnginDemirogJavaGun03Odev._03_Odev.business.InstructorManager;
import EnginDemirogJavaGun03Odev._03_Odev.core_logging.DataabaseLogger;
import EnginDemirogJavaGun03Odev._03_Odev.core_logging.FileLogger;
import EnginDemirogJavaGun03Odev._03_Odev.core_logging.Logger;
import EnginDemirogJavaGun03Odev._03_Odev.core_logging.MailLogger;
import EnginDemirogJavaGun03Odev._03_Odev.dataAccess.CategoryData.JDBCCategoryDao;
import EnginDemirogJavaGun03Odev._03_Odev.dataAccess.CourseData.HibernateCourseDao;
import EnginDemirogJavaGun03Odev._03_Odev.dataAccess.InstructorData.HibernateInstructorDao;
import EnginDemirogJavaGun03Odev._03_Odev.entities.Category;
import EnginDemirogJavaGun03Odev._03_Odev.entities.Course;
import EnginDemirogJavaGun03Odev._03_Odev.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class kodlamaioNLayeredApp {
    public static void main(String[] args) throws Exception {

        Course course=new Course(1,"Java+React",425);
        Course course1=new Course(2,"Python",250);

        List<Course> courses=new ArrayList<Course>();

        Logger[]loggers={new DataabaseLogger(),new FileLogger(),new MailLogger()};


        CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers,courses);
        courseManager.add(course);
        courseManager.add(course1);

        System.out.println("-------------------------------------");
        System.out.println("");

        Category category=new Category(1,"programlama");
        Category category1=new Category(1,"kodlama");

        List<Category>categories=new ArrayList<Category>();
        Logger[]loggers1={new DataabaseLogger(),new FileLogger(),new MailLogger()};

        CategoryManager categoryManager=new CategoryManager(new JDBCCategoryDao(),loggers,categories);
        categoryManager.add(category);
        categoryManager.add(category1);

        System.out.println("-------------------------------------");
        System.out.println("");

        Instructor instructor=new Instructor(1,"Engin","Demiroğ");
        Instructor instructor1=new Instructor(1,"Engin","Demiroğ");

        List<Instructor>instructors=new ArrayList<Instructor>();
        Logger[]loggers2={new DataabaseLogger(),new FileLogger(),new MailLogger()};

        InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(),loggers,instructors);
        instructorManager.add(instructor);
        instructorManager.add(instructor1);



    }
}
