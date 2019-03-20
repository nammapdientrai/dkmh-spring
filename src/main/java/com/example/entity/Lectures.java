package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lectures")
public class Lectures {

	@Id
	@Column(name = "ma_gv")
	private String ma_gv;

	@Column(name = "ten_gv")
	private String ten_gv;

	@Column(name = "chuyen_nghanh")
	private String chuyen_nghanh;

	@Column(name = "email")
	private String email;

	@Column(name = "sdt")
	private int sdt;

	public Lectures() {
	}

	public Lectures(String ma_gv, String ten_gv, String chuyen_nghanh, String email, int sdt) {
		this.ma_gv = ma_gv;
		this.ten_gv = ten_gv;
		this.chuyen_nghanh = chuyen_nghanh;
		this.email = email;
		this.sdt = sdt;
	}

	public String getMa_gv() {
		return ma_gv;
	}

	public void setMa_gv(String ma_gv) {
		this.ma_gv = ma_gv;
	}

	public String getTen_gv() {
		return ten_gv;
	}

	public void setTen_gv(String ten_gv) {
		this.ten_gv = ten_gv;
	}

	public String getChuyen_nghanh() {
		return chuyen_nghanh;
	}

	public void setChuyen_nghanh(String chuyen_nghanh) {
		this.chuyen_nghanh = chuyen_nghanh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

}
