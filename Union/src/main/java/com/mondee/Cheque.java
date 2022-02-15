package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="Cheque")
@Entity
public class Cheque extends Payment {
	@Column(name="cqType")
private String chequeType;

public String getChequeType() {
	return chequeType;
}

public void setChequeType(String chequeType) {
	this.chequeType = chequeType;
}

}
