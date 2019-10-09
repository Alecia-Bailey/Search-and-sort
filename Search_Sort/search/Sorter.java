package search;

public class Sorter {
	public int arr[],arrSize;
	
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getArrSize() {
		return arrSize;
	}
	public void setArrSize(int arrSize) {
		this.arrSize = arrSize;
	}
	public Sorter(int[] arr, int arrSize) {
		super();
		this.arr = arr;
		this.arrSize = arrSize;
	}
	public Sorter() {
		super();
	}
	
	public int bubbleSort(int arr[],int arrSize) {
		int index=0, temp, count, swap=1;
		while(index<arrSize && swap==1) {
			swap=0;
			count=arrSize-1;
			while (count>index) {
				if(arr[count]<arr[count-1]) {
					temp=arr[count-1];
					arr[count-1]= arr[count];
					arr[count]=temp;
					swap=1;
				}
				count--;
			}
			index++;
		}
		return arrSize;
	}
	
	public int selectionSort(int arr[],int arrSize) {
		int index=0, small, temp, count;
		while(index<arrSize) {
			small=index;
			count=index+1;
			while (count<arrSize) {
				if (arr[count]<arr[small]) {
					small=count;
				}
				count++;
			}
			temp=arr[index];
			arr[index]=arr[small];
			arr[small]=temp;
			index++;
		}	
		return arrSize;		
	}
	
	public int insertionSort(int arr[],int arrSize) {
		int index=1,count = 0,temp = 0;
		while(index<arrSize) {
			temp=arr[index];
			count=index;
			while (count>=0 && temp<=arr[count-2]) {
				arr[count]=arr[count-1];
				count--;
			}
			arr[count]=temp;
			index++;
		}	
		return arrSize;
	
    }

}
