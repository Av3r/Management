package dao;

import api.ProductDao;
import entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damia on 09.03.2019.
 */
public class ProductDaoImpl implements ProductDao{
    String fileName;

    public ProductDaoImpl(String fileName){
        this.fileName = fileName;
    }

    public void saveProduct(Product product) throws IOException{
        List<Product> products = getAllProducts();
    }

    public void saveProducts(List<Product> products) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        for(int i = 0 ; i < products.size(); i++){
            printWriter.write(products.get(i) + "\n");
        }
    }

    public void removeProductById(Long productId) throws IOException{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        String readLine = reader.readLine();
        while(readLine != null){
            readLine = reader.readLine();
        }
        for(Product product : )
    }

    public List<Product> getAllProducts() throws IOException{
        List<Product> products = new ArrayList<Product>();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        String readLine = reader.readLine();
        while(readLine != null){
            Product product =
            products.add(readLine);
            readLine = reader.readLine();
        }

    }
}
