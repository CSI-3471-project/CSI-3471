package project.iterationII;

import java.util.Date;

public class PaymentMethod {

	private char[] cardNum;
	
	private char[] cardCode;
	
	private Date expDate;

	public char[] getCardNum() {
		return cardNum;
	}

	public void setCardNum(char[] cardNum) {
		this.cardNum = cardNum;
	}

	public char[] getCardCode() {
		return cardCode;
	}

	public void setCardCode(char[] cardCode) {
		this.cardCode = cardCode;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public PaymentMethod(char[] cardNum, char[] cardCode, Date expDate) {
		super();
		this.cardNum = cardNum;
		this.cardCode = cardCode;
		this.expDate = expDate;
	}
	
	
}
