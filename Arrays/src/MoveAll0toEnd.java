
public class MoveAll0toEnd {

//	Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//	Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
//			                 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 0, 4, 3, 0, 0, 5, 0 };

		int index = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}

		while (index <= arr.length - 1) {
			arr[index] = 0;
			index++;
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

	}

}
