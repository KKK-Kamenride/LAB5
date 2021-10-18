package lab;

import java.util.Random;
import java.util.Scanner;

public class High implements Operations{
	public static int num;
	public static double ans;
	public static double res;
	public static double score;
	
	public High(int num) {
		this.num=num;
	}
	
	@Override
	public double add() {
		Random r=new Random();
		double a=r.nextInt(100000)/100.0;
		double b=r.nextInt(100000)/100.0;
        System.out.println(a+"+"+b+"="+"?");
        res=Math.round((a+b)*100)/100.0;
		return res;
	}

	@Override
	public double mul() {
		Random r=new Random();
		double a=r.nextInt(100000)/100.0;
		double b=r.nextInt(100000)/100.0;
        System.out.println(a+"x"+b+"="+"? (If there are more than one decimal place, keep two decimal places)");
        res=Math.round(a*b*100)/100.0;
		return res;
	}

	@Override
	public double sub() {
		Random r=new Random();
		double a=r.nextInt(100000)/100.0;
		double b=r.nextInt(100000)/100.0;
        System.out.println(a+"-"+b+"="+"?");
        res=Math.round((a-b)*100)/100.0;
		return res;
	}

	@Override
	public double div() {
		Random r=new Random();
		double a=r.nextInt(100000)/100.0;
		double b=r.nextInt(100000)/100.0;
        System.out.println(a+"/"+b+"="+"? (If there are more than one decimal place, keep two decimal places)");
        res= Math.round(a/b*100)/100.0;
		return res;
	}

	@Override
	public double check() {
		Scanner sc=new Scanner(System.in);
		ans=sc.nextDouble();
		if(ans==res) {			
			return score+=100.0/num;
		}else {
			return score;
		}
	}
	
}
