package com.te.passportprocess.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.passportprocess.interf.HeadPassportOffice;

public class ChennaiPassportOffice implements HeadPassportOffice
{
	@Autowired
	@Qualifier("chennai")
	private Document chennaiDocument;
//	public Document getChennaiDocument() {
//		return chennaiDocument;
//	}
//
//	public void setChennaiDocument(Document chennaiDocument) {
//		this.chennaiDocument = chennaiDocument;
//	}

	@Override
	public void doPhotoVerification() {
		// TODO Auto-generated method stub
		System.out.println("Photo Verification done using"+chennaiDocument.getIdProof());
		
	}

	@Override
	public void issuePassport() {
		// TODO Auto-generated method stub
		System.out.println("Passport issue in progress for "+chennaiDocument.getName()+"from"+chennaiDocument.getCity()+"office");
	}

}
