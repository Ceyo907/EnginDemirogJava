package EnginDemiroğJavaGun03Odev._03_Odev.business;

import EnginDemiroğJavaGun03Odev._03_Odev.core_logging.Logger;
import EnginDemiroğJavaGun03Odev._03_Odev.dataAccess.CategoryData.CategoryDao;
import EnginDemiroğJavaGun03Odev._03_Odev.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

   private CategoryDao categoryDao;
   private Logger[] loggers;

   private List<Category> categories;


    public CategoryManager(CategoryDao categoryDao,Logger[] loggers,List<Category> categories){
        this.categoryDao=categoryDao;
        this.loggers=loggers;
        this.categories=categories;

    }

    public void add(Category category) throws Exception{
        //Metod çağrıldığında hata gelebilir.
        for (Category cat:categories) {
            if (cat.getCategoryName()==category.getCategoryName()){
                throw new Exception("Kategori ismi tekrar edemez.");

            }
        }

        categories.add(category);
        categoryDao.add(category);

        for (Logger logger:loggers) {
            logger.log(category.getCategoryName());

        }
    }

}
