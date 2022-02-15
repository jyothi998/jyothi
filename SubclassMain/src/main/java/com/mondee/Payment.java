package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment2")
public class Payment {
	@Id
	@Column(name="paymentid")
private int paymentid;
	@Column(name="amount")
private double amount;
public int getPaymentid() {
	return paymentid;
}
public void setPaymentid(int paymentid) {
	this.paymentid = paymentid;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}

}
