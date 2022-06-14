package com.te.passportprocess.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.passportprocess.bean.BanglorePassportOffice;
import com.te.passportprocess.bean.ChennaiPassportOffice;
import com.te.passportprocess.bean.Document;

@Configuration
@ComponentScan("com.te")
public class AppConfig 
{
	@Bean("chennaiPassport")
	public ChennaiPassportOffice getChennaiPassport()
	{
		return new ChennaiPassportOffice();
	}
	@Bean("banglorePassport")
	public BanglorePassportOffice getBanglorePassport()
	{
		return new BanglorePassportOffice();
	}
	@Bean("chennai")
	public Document chennaiDocument()
	{
		return new Document("Joe","Driving License","Chennai");
	}
	@Bean("banglore")
	public Document bangloreDocument()
	{
		return new Document("Jhon", "Aadhar id","Banglore");
	}
}
