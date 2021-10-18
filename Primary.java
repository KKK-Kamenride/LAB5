package lab;

import java.util.Random;
import java.util.Scanner;

public class Primary implements Operations{
	public static int num;
	public static int ans;
	public static int res;
	public static double score;
	
	public Primary(int num) {
		this.num=num;
	}
			
	@Override
	public double add() {
		Random r=new Random();
		int a=r.nextInt(101);
		int b=r.nextInt(101);		
        System.out.println(a+"+"+b+"="+"?");
        res=a+b;
		return res;
		
	}


	@Override
	public double sub() {
		Random r=new Random();
		int a=r.nextInt(101);
		int b=r.nextInt(101);
        System.out.println(a+"-"+b+"="+"?");
        res=a-b;
		return res;
		
	}

	@Override
	public double mul() {
		return 0;
	}

	@Override
	public double div() {
		return 0;
	}

	@Override
	public double check() {
		Scanner sc=new Scanner(System.in);
		ans=sc.nextInt();
		if(ans==res) {			
			return score+=100.0/num;
		}else {
			return score;
		}
	}
}
