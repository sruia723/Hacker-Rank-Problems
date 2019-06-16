import java.util.Scanner;

public class QuicksortAlgorithm {

    static int Partition(int s, int e, int arr[])
    {
        int pivot = arr[s];
        int i = s, j = e;
        while(i < j)
        {
            do
            {
                if(i == (e-1))
                {
                    break;
                }
                i++;
            }while(arr[i] <= pivot);

            do
            {
                j--;
            }while(arr[j] > pivot);

            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[s];
        arr[s] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void Quicksort(int s, int e, int arr[])
    {
        if(s<e)
        {
            int j;
            j = Partition(s,e,arr);
            Quicksort(s,j,arr);
            Quicksort(j+1,e,arr);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("\nEnter the elements of the array: ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int s = 0, e = n;

        Quicksort(s,e,arr);

        System.out.println("The numbers are: \n");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(" \n"  + arr[i]);
        }

    }
}
