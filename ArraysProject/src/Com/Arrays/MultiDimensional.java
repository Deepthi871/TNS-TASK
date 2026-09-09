package Com.Arrays;

public class MultiDimensional {

	public static void main(String[] args) {
		long[][] arr = new long[3][4];
		
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=(long)(Math.random()*10);
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}