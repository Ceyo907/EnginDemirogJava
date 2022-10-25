package EnginDemirogJavaGun03Odev._03_Odev.dataAccess.CategoryData;

import EnginDemirogJavaGun03Odev._03_Odev.entities.Category;

public class JDBCCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
