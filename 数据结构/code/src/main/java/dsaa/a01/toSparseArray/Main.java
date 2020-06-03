package dsaa.a01.toSparseArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[][] towDArr=CsvOp.readCsvToArray();
        int[][] sparseArray=toSparseArray(towDArr);
        for(int[] i:sparseArray){
            System.out.println(Arrays.toString(i));
        }
    }

    /**
     * 输入二维数组输出稀疏数组
     * @param towDArr :二维数组
     * @return稀疏数组
     * @throws Exception
     */
    public static int[][] toSparseArray(int[][] towDArr) throws Exception{
        if (towDArr==null) return null;
        int row,col,value=0;
        row=towDArr.length;
        col=towDArr[0].length;
        for(int[] x:towDArr){
            for(int y:x){
                if(y!=0) value++;
            }
        }
        int[][] sparseArray=new int[value+1][3];
        sparseArray[0][0]=row;
        sparseArray[0][1]=col;
        sparseArray[0][2]=value;
        int index=1;
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(towDArr[i][j]!=0){
                    sparseArray[index][0]=i;
                    sparseArray[index][1]=j;
                    sparseArray[index][2]=towDArr[i][j];
                    index++;
                }
            }
        }
        return sparseArray;
    }
}
