package service;

import entity.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damia on 06.03.2019.
 */
public class ProductServiceTest {
    @Test // 2x get all products
    public void testGetAllProducts(){
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));
        products.add(new Product(2l,"Pen", "Black", 1.5f,1.0f,20));
        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        List<Product> productFromTestClass = productService.getAllProducts();
        //excepted
        Assert.assertEquals(products, productFromTestClass);
    }
    @Test
    public void testGetAllProdusctNotEquals(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));
        products.add(new Product(2l,"Pen", "Black", 1.5f,1.0f,20));
        //then
        ProductServiceImpl productService = new ProductServiceImpl(new ArrayList<Product>(products));
        products.add(new Product(3l, "Rubber", "Grey", 15.5f, 2.5f, 3));
        List<Product> productFromTestList = productService.getAllProducts();
        Assert.assertNotEquals(products, productService);
     }

    @Test // 2x get count products
    public void testCountProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));
        products.add(new Product(2l,"Pen", "Black", 1.5f,1.0f,20));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final int result = productService.getCountProducts();

        Assert.assertEquals(2, result);
    }
    @Test
    public void testCountProductsNotEquals(){
        ProductServiceImpl productService = new ProductServiceImpl();

        int result = productService.getCountProducts();

        Assert.assertEquals(0, result);
    }

    @Test //2x searching product with name
    public void testGetProductWithName(){
        List<Product> products = new ArrayList<Product>();
        Product cloth = new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5);
        products.add(cloth);
        products.add(new Product(2l,"Pen", "Black", 1.5f,1.0f,20));

        ProductServiceImpl productService = new ProductServiceImpl(products);

        Product product = productService.getProductByName("Pasta");

        Assert.assertEquals(cloth, product );
    }
    @Test
    public void testGetProductWithoutName(){
        List<Product> products = new ArrayList<Product>();
        Product cloth = new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5);
        products.add(cloth);
        products.add(new Product(2l,"Pen", "Black", 1.5f,1.0f,20));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        Product product = productService.getProductByName("Random");

        Assert.assertEquals(null, product);
    }

    @Test //2x check products count
    public void testIsProductOnWareHouseWhenIs(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductOnWareHouse = productService.isProductOnWareHouse("Pasta");

        Assert.assertTrue(isProductOnWareHouse);

    }
    @Test
    public void testIsProductOnWareHouseWhenIsNot(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductOnWareHouse = productService.isProductOnWareHouse("Test");

        Assert.assertFalse(isProductOnWareHouse);
    }

    @Test
    public void testIsProductExistByNameWhenExist(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExist = productService.isProductExist("Pasta");

        Assert.assertTrue(isProductExist);
    }
    @Test
    public void testIsProductExistByNamWhenNoExist(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExist = productService.isProductExist("Another Product");

        Assert.assertFalse(isProductExist);
    }

    @Test
    public void testIsProductExistByIdWhenExist(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExist = productService.isProductExist(1l);

        Assert.assertTrue(isProductExist);
    }
    @Test
    public void testIsProductExistByIdWhenNoExist(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "Pasta", "Green", 3.5f, 1.5f, 5));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExist = productService.isProductExist(2l);

        Assert.assertFalse(isProductExist);
    }

}
