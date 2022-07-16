package com.itheima.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
  @Autowired
  private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("3-hot-fix");
        System.out.println("1");

    }
}
