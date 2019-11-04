package sort;

import java.util.jar.JarEntry;

//堆排序
public class HeapSort {
    public static void heapSort(int[] arr) {
        //构建大根堆：将array看成完全二叉树的顺序存储结构
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            //从最后一个节点array.length-1的父节点（array.length-1-1）/2开始(即第一个非叶子的节点)，直到根节点0，反复调整堆
            adjustHeap(arr,i,arr.length);

        }
        //堆排序
        for (int i=arr.length-1;i>1;i--){
            swap(arr, 0, i);
            adjustHeap(arr, 0, i);
        }
    }
    private static void adjustHeap(int[] arr, int k, int length){
        //把当前节点的值取出来
        int temp=arr[k];
        for (int i=2*k+1;i<length;i=2*k+1){
            if (i<length && arr[i]<arr[i+1]){
                i++;
            }
            if (temp>=arr[i]){
                break;
            }else {
                arr[k]=arr[i];
                k=i;

            }
        }
        arr[k]=temp;
    }
    private static void swap(int[] arr, int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;

    }
    }
