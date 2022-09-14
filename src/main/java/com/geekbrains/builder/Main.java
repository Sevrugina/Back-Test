package com.geekbrains.builder;

import com.geekbrains.api.ApiSearchResult;
import com.geekbrains.api.ApiUserConnectRequest;
import com.geekbrains.api.ApiUserConnectResult;
import com.geekbrains.api.SpoonaccularService;
import com.geekbrains.db.dao.CategoriesMapper;
import com.geekbrains.db.dao.ProductsMapper;
import com.geekbrains.db.model.Categories;
import com.geekbrains.db.model.Products;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
        //ДОМАШНЯЯ РАБОТА
/*      public class Main {
        public static void main(String[] args) throws IOException {

// USER connect
//       SpoonaccularService spoonaccularService = new SpoonaccularService();
//       ApiUserConnectResult rez = spoonaccularService.connect(new ApiUserConnectRequest());
//       System.out.println(rez);
//
//        // ADD To Shopping List
//        ApiSearchResult added = spoonaccularService.addToShoppingList();
//        System.out.println(added);
//
//        // GET To Shopping List
//        ApiGetResult getResult = spoonaccularService.getShoppingList();
//        System.out.println(getResult);
//
//        //Delete Shopping List
//        ApiGetResult del = spoonaccularService.deleteShoppingList();
//       System.out.println(del);
// Код с урока для поиска в базе данных продукта и категории
           SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
               .build(Resources.getResourceAsStream("MyBatisConfig.xml"));
             try (SqlSession session = sessionFactory.openSession()) {
            //ПОЛУЧИТЬ ДАННЫЕ ИЗ БАЗЫ ДАННЫХ
            ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
            CategoriesMapper categoriesMapper = session.getMapper(CategoriesMapper.class);
            // НАЙТИ ПРОДУКТ ПО КЛЮЧУ
            Products product = productsMapper.selectByPrimaryKey(329L);
            System.out.println(product);
            // НАЙТИ КАТЕГОРИЮ ЭТОГО НАЙДЕННОГО ПРОДУКТА ПО КЛЮЧУ
            Categories category = categoriesMapper.selectByPrimaryKey(product.getCategoryId());
            System.out.println(category);


            // ДОМАШНЯЯ РАБОТА
            // СОЗДАТЬ НОВУЮ КАТЕГОРИЮ "Plants" с ID 9

            Categories new_category = new Categories();
            new_category.setTitle("Plants");
            new_category.setId(9L);
            categoriesMapper.insert(new_category);
            session.commit();

            System.out.println(new_category.getTitle());
            System.out.println(new_category.getId());


           //СОЗДАТЬ НОВЫЙ ПРОДУКТ В КАТЕГОРИИ "Plants" Pion

            Products new_prod = new Products();
            new_prod.setTitle("Pion");
            new_prod.setId(287L);
            new_prod.setPrice(99);
            new_prod.setCategoryId(9L);
            productsMapper.insert(new_prod);
            session.commit();
            System.out.println(new_prod.getTitle());
            System.out.println(new_prod.getPrice());
            System.out.println(new_prod.getId());

        // НАЙТИ В БАЗЕ ДАННЫХ ПРОДУКТ "Pion" в КАТЕГОРИИ "Plants"

            Products pion = productsMapper.selectByPrimaryKey(287L);
            System.out.println(product);

            Categories plants = categoriesMapper.selectByPrimaryKey(product.getCategoryId());
            System.out.println(category);

        // УДАЛИТЬ ИЗ БАЗЫ ДАННЫХ ПРОДУКТ "Pion"

            productsMapper.deleteByPrimaryKey(287L);
            session.commit();

        // УДАЛИТЬ ИЗ БАЗЫ ДАННЫХ КАТЕГОРИЮ "Toys" c ID = 10

            categoriesMapper.deleteByPrimaryKey(10L);
            session.commit();

        }
    }
}
*/
public class Main {
    public static <ProductsMapper> void main(String[] args) throws IOException {

//        SpoonaccularService spoonaccularService = new SpoonaccularService();
//        ApiSearchResult recipes = spoonaccularService.findRecipes("Bread", 3);
//        System.out.println(recipes);
//
//        ApiUserConnectResult connectResult = spoonaccularService.connect(new ApiUserConnectRequest());
//        System.out.println(connectResult);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("myBatisConfig.xml"));

        try (SqlSession session = sessionFactory.openSession()) {
            com.geekbrains.db.dao.ProductsMapper productsMapper = session.getMapper(com.geekbrains.db.dao.ProductsMapper.class);
            CategoriesMapper categoriesMapper = session.getMapper(CategoriesMapper.class);
            Products product = productsMapper.selectByPrimaryKey(444L);
            System.out.println(product);
            Categories category = categoriesMapper.selectByPrimaryKey(product.getCategoryId());
            System.out.println(category);

        }
    }
}