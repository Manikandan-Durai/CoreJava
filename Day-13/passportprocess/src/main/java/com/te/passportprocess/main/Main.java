package com.te.passportprocess.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.passportprocess.bean.BanglorePassportOffice;
import com.te.passportprocess.bean.ChennaiPassportOffice;
import com.te.passportprocess.config.AppConfig;

public class Main 
{
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) 
	{
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Enter the location");
		System.out.println("1.chennai Location \n2.Banglore Location");
		int input=scan.nextInt();
		switch (input) {
		case 1:
			ChennaiPassportOffice cp=(ChennaiPassportOffice)context.getBean("chennaiPassport");
			cp.doPhotoVerification();
			cp.issuePassport();
			break;
		case 2:
			BanglorePassportOffice bp=(BanglorePassportOffice)context.getBean("banglorePassport");
			bp.doPhotoVerification();
			bp.issuePassport();
		default:
			break;
		}
	}
}
