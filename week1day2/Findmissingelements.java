package week1day2;
import java.util.Arrays;
public class Findmissingelements {
	public static void main(String[] args) {
		System.out.println("missing element is:");
		int[] num= {1,4,3,2,8,6,7};
		Arrays.sort(num);
		for (int i = 0; i < num.length;i++) {
			if(num[i]!=i+1)
			{
		System.out.println(i+1);	
		break;
			}
		}
	}

}
