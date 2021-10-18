package lab;

import java.util.Random;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your grade?");
		String s1=sc.nextLine();
		int grade=Integer.parseInt(s1.substring(6, 7));
		System.out.println("Please enter the number of questions?");
		int num=sc.nextInt();
		int fun;//º¯Êý¶ÔÓ¦Ëæ»úÊý
		Random r=new Random();
		if(grade==1|grade==2) {
			Primary p=new Primary(num);
			for (int i = 0; i < num; i++) {
				fun=r.nextInt(2);//0or1
				switch(fun) {
				case 0:
					p.add();
					p.check();
				    break;
				case 1:
					p.add();
					p.check();
				    break;
				}
			}
			if (p.score==100) {
				System.out.println("end! All right, that's great! Your score is 100.");
			}else {
				System.out.println("end! Wrong question, your score is "+Math.round(p.score) );
			}
		}else if(grade==3|grade==4) {
			Middle m=new Middle(num);
			for (int i = 0; i < num; i++) {
				fun=r.nextInt(4);//0or1or2or3
				switch(fun) {
				case 0:
					m.add();
					m.check();
				    break;
				case 1:
					m.sub();
					m.check();
				    break;
				case 2:
					m.mul();
					m.check();
				    break;
				case 3:
					m.div();
					m.check();
				    break;
				}
			}
			if (m.score==100) {
				System.out.println("end! All right, that's great! Your score is 100.");
			}else {
				System.out.println("end! Wrong question, your score is "+Math.round(m.score) );
			}
		}else if(grade==5|grade==6) {
			High h=new High(num);
			for (int i = 0; i < num; i++) {
				fun=r.nextInt(4);//0or1or2or3
				switch(fun) {
				case 0:
					h.add();
					h.check();
				    break;
				case 1:
					h.sub();
					h.check();
				    break;
				case 2:
					h.mul();
					h.check();
				    break;
				case 3:
					h.div();
					h.check();
				    break;
				}
			}
			if (h.score==100) {
				System.out.println("end! All right, that's great! Your score is 100.");
			}else {
				System.out.println("end! Wrong question, your score is "+Math.round(h.score) );
			}
		}else {
			System.out.println("Invalid input");
		}

	}

}
