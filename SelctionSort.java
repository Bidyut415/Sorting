public class SelctionSort 
{
  public static void selectionsort(int arr[])
  {
        for(int i=0;i<arr.length;i++)
        {
           int minPos=i;
          for(int j=i+1;j<arr.length;j++)
          {
             if(arr[minPos]>arr[j])
            {
              minPos=j;
            }
          }
      //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    //show function
    public static void printArray(int arr[]) 
    {
        for (int num : arr)
         {
            System.out.print(num + " ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
    int[] arr ={5,4,1,3,2};
    System.out.println("before sort arry");
    printArray(arr);
    System.out.println("after sort arry");
    selectionsort(arr);
    printArray(arr);
  }
}
