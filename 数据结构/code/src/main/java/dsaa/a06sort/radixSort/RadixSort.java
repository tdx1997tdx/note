package dsaa.a06sort.radixSort;

public class RadixSort {

    public static void radixSort(int[] arr) {
        //初始化一个桶
        int[][] buckets = new int[10][arr.length];
        //存储每个桶中的数量
        int[] bucketCount = new int[10];
        //寻找元素中最大的数
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //统计最大数的位数
        int digitNum = String.valueOf(max).length();
        //模的数量
        int modNum = 10;
        for (int count = 0; count < digitNum; count++) {
            for (int i = 0; i < arr.length; i++) {
                modNum = (int) Math.pow(10, count);
                int n = (int) arr[i] / modNum;
                int digit = n % 10;
                buckets[digit][bucketCount[digit]] = arr[i];
                bucketCount[digit]++;
            }
            //将桶中的元素放回数组中
            int index = 0;
            for (int i = 0; i < 10; i++) {
                int[] bucket = buckets[i];
                for (int j = 0; j < bucketCount[i]; j++) {
                    arr[index] = bucket[j];
                    index++;
                }
            }
            //清空桶
            buckets = new int[10][arr.length];
            bucketCount = new int[10];
        }

    }

}
