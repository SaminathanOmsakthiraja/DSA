import java.util.Scanner;

class OffByOne{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		String str = (n + m) + "1";
        System.out.println(str);
	}
}