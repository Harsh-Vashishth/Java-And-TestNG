package day1_secondpart;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,30,40,50};
		
		for(int i = 0 ; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int num:arr) {
			System.out.print(num+ " ");
		}

	}

}
