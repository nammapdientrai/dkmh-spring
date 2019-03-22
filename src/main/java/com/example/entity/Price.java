package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "price")
public class Price {

	@Id
	@Column(name = "ma_gia")
	private String ma_gia;

	@Column(name = "gia_tc")
	private int gia_tc;

	public Price() {
	}

	public Price(String ma_gia, int gia_tc) {
		this.ma_gia = ma_gia;
		this.gia_tc = gia_tc;
	}

	public String getMa_gia() {
		return ma_gia;
	}

	public void setMa_gia(String ma_gia) {
		this.ma_gia = ma_gia;
	}

	public int getGia_tc() {
		return gia_tc;
	}

	public void setGia_tc(int gia_tc) {
		this.gia_tc = gia_tc;
	}

}
