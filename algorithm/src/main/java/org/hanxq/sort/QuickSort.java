package org.hanxq.sort;

import java.util.Arrays;

/**
 * 快速排序算法
 * @author hanxq
 *
 */
public class QuickSort {
	
	/**
	 * 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置
	 * @param numbers
	 * @param low
	 * @param high
	 * @return
	 */
	public static int getMidle(int[] numbers,int low,int high){
		// 找到中轴的数组值
		int temp = numbers[low];
		// 中轴必须小于高位
		while(low < high){
			// high开始大于key值的，high-1进行位移
			while(low < high && numbers[high] > temp){
				high--;
			}
			if(numbers[high] < temp){
				// 交换
				numbers[low] = numbers[high];
				numbers[high] = temp;
				System.out.println("向后移" + Arrays.toString(numbers));
			}
			// 从前往后
			while(low < high && numbers[low] < temp){
				low++;
			}
			// 再次交换
			if(low < high && numbers[low] > temp){
				numbers[high] = numbers[low];
				numbers[low] = temp;
				System.out.println("向前移" + Arrays.toString(numbers));
			}
		}
		
		return low;
	}
	
	public static void quickSort(int[] numbers,int low,int high){
		if(low < high){
			int middle = getMidle(numbers, low, high);
			// 前半段
			quickSort(numbers,low,middle - 1);
			// 后半段
			quickSort(numbers,middle + 1,high);
		}
	}
	
	/**
	 * 调用
	 * @param args
	 */
	public static void main(String[] args) {
		// 待排序数组
		int[] numbers = {48,15,24,59,64,79,97,40};
		System.out.println(Arrays.toString(numbers));
		//getMidle(numbers,0,numbers.length - 1);
		quickSort(numbers,0,numbers.length - 1);
		System.out.println(Arrays.toString(numbers));
	}

}
