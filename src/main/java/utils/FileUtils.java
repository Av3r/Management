package utils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Damia on 10.03.2019.
 */
public class FileUtils {

    public static void createNewFile(String fileName) throws IOException{
        File file = new File(fileName);
        file.createNewFile();
    }
}
