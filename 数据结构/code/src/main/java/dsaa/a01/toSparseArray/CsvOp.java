package dsaa.a01.toSparseArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;

public class CsvOp {
    /**
     * 读取相关文件转化为二维数组
     * @return 二维数组
     * @throws Exception
     */
    public static int[][] readCsvToArray() throws Exception {
        //读取相关csv文件
        ClassLoader classLoader = CsvOp.class.getClassLoader();
        URL resource = classLoader.getResource("sparseArray\\TwoDimensionalArray.csv");
        //读取解决中文路径乱码问题
        String decodePath=URLDecoder.decode(resource.getPath(),"UTF-8");
        BufferedReader reader = new BufferedReader(new FileReader(decodePath));
        int[][] result;
        String line = reader.readLine();
        String rowAndCol[] = line.split(",");
        int row=Integer.parseInt(rowAndCol[0]);
        int col=Integer.parseInt(rowAndCol[1]);
        result=new int[row][col];
        int index = 0;
        while ((line = reader.readLine()) != null) {
            String item[] = line.split(",");
            for(int i =0;i<item.length;i++){
                result[index][i]=Integer.parseInt(item[i]);
            }
            index++;
        }
        return result;
    }
}



