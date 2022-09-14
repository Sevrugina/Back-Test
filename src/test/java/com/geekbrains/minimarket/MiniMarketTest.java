package com.geekbrains.minimarket;

import com.geekbrains.db.dao.ProductsMapper;
import com.geekbrains.db.model.CategoriesExample;
import com.geekbrains.db.model.Products;
import io.restassured.RestAssured;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.IOException;

public class MiniMarketTest {

    @Test
    void testMiniMarket() throws IOException {

        //RestAssured.baseURI = "https://minimarket1.herokuapp.com/market";
        RestAssured.given()
                .pathParams("id", 5L)
                .log()
                .all()
                .expect()
                .statusCode(Integer.parseInt("200"))
                .log()
                .all()
                .when()
                .get("https://minimarket1.herokuapp.com/market/api/v1/categories/{id}");

    }
}
