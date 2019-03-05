package sort;

/*
    冒泡排序法
 */
public class DubbleSort {
    public void dubbleSort(int[]a, int length){
        if (length <= 1){
            return;
        }
        for (int i = 0; i < length; i++){
            //退出冒泡标志
            boolean flag = false;
            for (int j = 0; j < n - i; j++){
                if (a[j] > a[j+1]){
                    //交换位置
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }
            //无数据交换，提前退出
            if (!flag){
                break;
            }
        }
    }
}
