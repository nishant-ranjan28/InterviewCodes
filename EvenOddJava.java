package BasicInterviewCodes;

import java.util.Scanner;

public class EvenOddJava {
	
	static void arrangeEvenOdd(int arr[], int n) {
		
		int j=-1, temp;
		
		//Quick Sort method
		for(int i=0; i<n; i++) {
			//If array of element is odd then swap
			if (arr[i]%2==0) {
				j++;
				
				//swap the element
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            //sum = sum + a[i];
        }
        
        arrangeEvenOdd(a, n);
		
        System.out.print("arranged array: ");
        for (int i = 0; i < n; i++) 
            System.out.print(a[i] + " ");
	}

}
