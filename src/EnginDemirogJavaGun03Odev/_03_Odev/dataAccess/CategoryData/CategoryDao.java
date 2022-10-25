package EnginDemirogJavaGun03Odev._03_Odev.dataAccess.CategoryData;

import EnginDemirogJavaGun03Odev._03_Odev.entities.Category;

public interface CategoryDao {
    //CategoryDao ile ilgili olan alternatifler (HibernateCategoryDao , JdbcCategoryDao) add operasyonu içerir.

void add(Category category);
}
