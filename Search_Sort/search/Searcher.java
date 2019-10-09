package search;

public class Searcher {
	public int arr[], arrSize, searchVal;
	
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
	public int getSearchVal() {
		return searchVal;
	}
	public void setSearchVal(int searchVal) {
		this.searchVal = searchVal;
	}
	
	public Searcher(int[] arr, int arrSize, int searchVal) {
		super();
		this.arr = arr;
		this.arrSize = arrSize;
		this.searchVal = searchVal;
	}
	
	public Searcher() {
		super();
	}
	
	public int linearSearch(int arr[],int arrSize, int searchVal) {
		int index=0;
		while (index<arrSize) {
			if (arr[index]==searchVal){
				return index;
			}
			index++;
		}
		return -1;
	}
	
	public int binarySearch(int arr[],int arrSize, int searchVal) {
		int start=0, end=arrSize-1, mid;
		while (start<=end) {
			mid=(start+end)/2;
			if (searchVal == arr[mid]) {
				return mid;
			}if (searchVal < arr[mid]) {
				end = mid-1;
			} if (searchVal > arr[mid]) {
				start = mid+1;
			}
		}
		return -1;
	}
}
