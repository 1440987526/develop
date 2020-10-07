package main;

import java.text.DecimalFormat;

public class Mv {
	public void mv(int a[]){
		if(a.length % 2 == 1){
			double m= Math.round((a.length / 2)+1);
			System.out.println(m);
		}else{
			double b=(a[a.length/2-1]+a[(a.length/2)])/2;
			DecimalFormat df=new DecimalFormat("0.00");
			String num = df.format((float)(a[a.length/2-1]+a[(a.length/2)])/2);
		  System.out.println(num);
		}
	}

}
