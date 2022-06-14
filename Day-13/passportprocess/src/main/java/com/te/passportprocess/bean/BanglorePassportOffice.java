package com.te.passportprocess.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.passportprocess.interf.HeadPassportOffice;

public class BanglorePassportOffice implements HeadPassportOffice 
{
	@Autowired
	@Qualifier("banglore")
	private Document bangloreDocument;

//	public Document getBangloreDocument() {
//		return bangloreDocument;
//	}
//
//	public void setBangloreDocument(Document bangloreDocument) {
//		this.bangloreDocument = bangloreDocument;
//	}

	@Override
	public void doPhotoVerification() {
		// TODO Auto-generated method stub
		System.out.println("Photo Verification done using"+bangloreDocument.getIdProof());
	}

	@Override
	public void issuePassport() {
		// TODO Auto-generated method stub
		System.out.println("Passport issue in progress for "+bangloreDocument.getName()+"from"+bangloreDocument.getCity()+"office");
	}

}
