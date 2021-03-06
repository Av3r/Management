package dao;

import api.ProductDao;
import entity.Product;
import entity.parser.ProductParser;
import utils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damia on 09.03.2019.
 */
public class ProductDaoImpl implements ProductDao{
    private String fileName;
   // private String productType;
/*
    public ProductDaoImpl(String fileName, String productType) {
        this.fileName = fileName;
       // this.productType = productType;
        try {
            FileUtils.createNewFile(fileName);
        } catch (IOException e){
            e.printStackTrace();
        }
    }*/
    private static ProductDaoImpl instance = null;

    private ProductDaoImpl(){}

    public static ProductDaoImpl getInstance(){
        if(instance == null){
            instance = new ProductDaoImpl();
        }
        return instance;
    }

    public void saveProduct(Product product) throws IOException{
        List<Product> products = getAllProducts();
        products.add(product);
        saveProducts(products);
    }

    public void saveProducts(List<Product> products) throws FileNotFoundException{
        FileUtils.clearFile(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        for(Product product : products){
            printWriter.write(product.toString() + "\n");
        }
        printWriter.close();
    }

    public void removeProductById(Long productId) throws IOException{
        List<Product> products = getAllProducts();

        for(int i =0; i < products.size(); i++){
            boolean isFoundProduct = products.get(i).getId().equals(productId);
            if(isFoundProduct){
                products.remove(i);
            }
        }
        saveProducts(products);
    }

    public void removeProductByName(String productName) throws IOException{
        List<Product> products = getAllProducts();

        for(int i = 0; i < products.size(); i++){
            boolean isFoundProduct = products.get(i).getProductName().equals(productName);
            if(isFoundProduct){
                products.remove(i);
            }
        }
        saveProducts(products);
    }

    public List<Product> getAllProducts() throws IOException{
        List<Product> products = new ArrayList<Product>();
        FileReader fileReader = new FileReader(fileName);

        BufferedReader reader = new BufferedReader(fileReader);
        String readLine = reader.readLine();
        while(readLine != null){
            Product product = ProductParser.stringToProduct(readLine, productType);
            if(product != null){
                products.add(product);
            }
            readLine = reader.readLine();
        }
        reader.close();
        return products;
    }

    public Product getProductById(Long productId) throws IOException{
        List<Product> products = getAllProducts();

        for(Product product : products){
            boolean isFoundProduct = product.getId().equals(productId);
            if(isFoundProduct) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByProductName(String productName) throws IOException{
        List<Product> products = getAllProducts();

        for(Product product: products){
            boolean isFoundProduct = product.getProductName().equals(productName);
            if(isFoundProduct){
                return product;
            }
        }
        return null;
    }
}
