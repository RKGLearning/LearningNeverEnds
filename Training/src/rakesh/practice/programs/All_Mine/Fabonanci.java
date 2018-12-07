package rakesh.practice.programs.All_Mine;

public class Fabonanci {
public static void main(String[] args) {
	int n1 = 0, n2 = 1, n3=0,i=2,count=7;
	System.out.println(n1);
	System.out.println(n2);
	for (i = 2;i< count ; i ++) {
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		System.out.println(n3);
	}
}
}
