package rakesh.practice.programs.All_Mine;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundUp {
	
	public static void main(String[] args) {
		BigDecimal nbr1 = new BigDecimal(10.99);
		BigDecimal nbr2 = new BigDecimal(11.00);
		nbr2 = nbr2.subtract(nbr1);
		nbr2 = nbr2.setScale(2,BigDecimal.ROUND_HALF_EVEN);
		System.out.println(nbr2);
		nbr1 = nbr1.setScale(0,RoundingMode.CEILING);
		System.out.println(nbr1);
	}

}
