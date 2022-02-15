package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="CreditCard")
@Entity
public class CreditCard extends Payment{
	@Column(name="ccType")
private String creditCardType;

public String getCreditCardType() {
	return creditCardType;
}

public void setCreditCardType(String creditCardType) {
	this.creditCardType = creditCardType;
}

}
