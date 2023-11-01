package com.springdatajpa.spingboot.Repository;

import com.springdatajpa.spingboot.entity.Product;
import net.bytebuddy.TypeCache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private  ProductRepository productRepository;

    @Test
    void saveMethod()
    {
    //create product
        Product product = new Product();
        product.setName("Product 1");
        product.setDescription("Product 1 Description");
        product.setSku("100ABC");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageURL("product.jpg");

        //save product
        Product saveProduct=productRepository.save(product);

        //display
        System.out.println(saveProduct.getId());
        System.out.println(saveProduct.toString());
    }

    @Test
    void updateProduct()
    {
        // find are retrieve an entity by id
        Long id =1L;
        Product product=productRepository.findById(id).get();

        //update entity information
        product.setName("Updated product 1");
        product.setDescription("Update product Description");

        //save updated entity
        productRepository.save(product);
    }
@Test
    void   findByIdMethod()
    {
        //FindById to retrieve the data with primarykey
        Long id = 1L;
        Product product=productRepository.findById(id).get();
    }

    @Test
    void saveALlMethod()
    {
        //create product
        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setDescription("Product 2 Description");
        product2.setSku("100ABCD");
        product2.setPrice(new BigDecimal(200));
        product2.setActive(true);
        product2.setImageURL("product2.jpg");


        //create product
        Product product3 = new Product();
        product3.setName("Product 3");
        product3.setDescription("Product 3 Description");
        product3.setSku("100ABCDE");
        product3.setPrice(new BigDecimal(300));
        product3.setActive(true);
        product3.setImageURL("product3.jpg");

        //save product
        productRepository.saveAll(List.of(product2,product3));


    }

    @Test
    void findAllMethod()
    {
        List<Product> products = productRepository.findAll();

        //using Lambda expression
        products.forEach((s) -> {
            System.out.println(s.getName());
                }

        );
    }

    @Test
    void deleteByIdMethod()
    {
        Long id =1L;
        productRepository.deleteById(id);
    }

    @Test
    void deleteMethod()
    {
        //find an entity by id
        Long id =2L;
        Product product=productRepository.findById(id).get();
        //delete entity
        productRepository.delete(product);
    }

    @Test
    void deleteAllMethod()
    {
        //productRepository.deleteAll();

        Product product=productRepository.findById(9L).get();

        Product product1= productRepository.findById(10L).get();

        productRepository.deleteAll(List.of(product,product1));
    }

    @Test
    void  countMethod()
    {
        Long count=productRepository.count();
        System.out.println(count);
    }

    @Test
    void existByIdMethod()
    {
        Long id=9L;
        boolean productId=productRepository.existsById(id);
        System.out.println(productId);
    }

    @Test
    void findByDateCreationBetweenMethod()
    {
        LocalDateTime startDate = LocalDateTime.of(2023,9, 6 ,12 ,14 ,4);

        LocalDateTime endDate = LocalDateTime.of(2023,9, 6 ,14 ,27 ,54);

        List<Product>products=productRepository.findByDateCreatedBetween(startDate,endDate);
        products.forEach((p) ->{
            System.out.println(p.getName());
            System.out.println(p.getId());
        });
    }

    @Test
    void sortingByMultipleFieldsMethod()
    {
        String sortBy = "name";
        String sortByDesc = "Description";
        String sortDir = "asc";

        Sort sortByName = sortDir.equalsIgnoreCase(Sort.Direction.DESC.name())?
                Sort.by(sortBy).descending(): Sort.by(sortBy).ascending();

        Sort sortByDescription = sortDir.equalsIgnoreCase(Sort.Direction.DESC.name())?
                Sort.by(sortByDesc).descending(): Sort.by(sortByDesc).ascending();

        Sort sortByGroup = sortByName.and(sortByDescription);

        List<Product> products=productRepository.findAll(sortByGroup);

        products.forEach((s) ->
        {
            System.out.println(s);
        });
    }




}