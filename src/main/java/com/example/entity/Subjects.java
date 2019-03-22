package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subjects {

	@Id
	@Column(name = "ma_mh")
	private int ma_mh;

	@Column(name = "ten_mh")
	private String ten_mh;

	@Column(name = "stc")
	private int stc;

	@Column(name = "so_tiet_lt")
	private int so_tiet_lt;

	@Column(name = "so_tiet_th")
	private int so_tiet_th;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ma_gv_lt", referencedColumnName = "ma_gv")
	private Lectures gv_lt;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ma_gv_th", referencedColumnName = "ma_gv")
	private Lectures gv_th;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ma_gia", referencedColumnName = "ma_gia")
	private Price gia;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ma_tg_hoc", referencedColumnName = "ma_tg_hoc")
	private Times times;

	@Column(name = "ma_ph")
	private String ma_ph;

	public Subjects() {
	}

	public Subjects(int ma_mh, String ten_mh, int stc, int so_tiet_lt, int so_tiet_th, Lectures gv_lt, Lectures gv_th,
			Price gia, Times times, String ma_ph) {
		this.ma_mh = ma_mh;
		this.ten_mh = ten_mh;
		this.stc = stc;
		this.so_tiet_lt = so_tiet_lt;
		this.so_tiet_th = so_tiet_th;
		this.gv_lt = gv_lt;
		this.gv_th = gv_th;
		this.gia = gia;
		this.times = times;
		this.ma_ph = ma_ph;
	}

	public int getMa_mh() {
		return ma_mh;
	}

	public void setMa_mh(int ma_mh) {
		this.ma_mh = ma_mh;
	}

	public String getTen_mh() {
		return ten_mh;
	}

	public void setTen_mh(String ten_mh) {
		this.ten_mh = ten_mh;
	}

	public int getStc() {
		return stc;
	}

	public void setStc(int stc) {
		this.stc = stc;
	}

	public int getSo_tiet_lt() {
		return so_tiet_lt;
	}

	public void setSo_tiet_lt(int so_tiet_lt) {
		this.so_tiet_lt = so_tiet_lt;
	}

	public int getSo_tiet_th() {
		return so_tiet_th;
	}

	public void setSo_tiet_th(int so_tiet_th) {
		this.so_tiet_th = so_tiet_th;
	}

	public Lectures getGv_lt() {
		return gv_lt;
	}

	public void setGv_lt(Lectures gv_lt) {
		this.gv_lt = gv_lt;
	}

	public Lectures getGv_th() {
		return gv_th;
	}

	public void setGv_th(Lectures gv_th) {
		this.gv_th = gv_th;
	}

	public Price getGia() {
		return gia;
	}

	public void setGia(Price gia) {
		this.gia = gia;
	}

	public Times getTimes() {
		return times;
	}

	public void setTimes(Times times) {
		this.times = times;
	}

	public String getMa_ph() {
		return ma_ph;
	}

	public void setMa_ph(String ma_ph) {
		this.ma_ph = ma_ph;
	}

}