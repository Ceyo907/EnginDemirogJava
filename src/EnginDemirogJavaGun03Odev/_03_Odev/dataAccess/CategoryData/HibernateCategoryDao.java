package EnginDemirogJavaGun03Odev._03_Odev.dataAccess.CategoryData;

import EnginDemirogJavaGun03Odev._03_Odev.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
