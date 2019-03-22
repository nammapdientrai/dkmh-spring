package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "times")
public class Times {
	@Id
	@Column(name = "ma_tg_hoc")
	private String ma_tg_hoc;

	@Column(name = "ngh_lt")
	private int ngh_lt;

	@Column(name = "ngh_th")
	private int ngh_th;

	@Column(name = "tiet_bd_lt")
	private int tiet_bd_lt;

	@Column(name = "tiet_bd_th")
	private int tiet_bd_th;

	@Column(name = "sotiet")
	private int sotiet;

	public Times() {
	}

	public Times(String ma_tg_hoc, int ngh_lt, int ngh_th, int tiet_bd_lt, int tiet_bd_th, int sotiet) {
		this.ma_tg_hoc = ma_tg_hoc;
		this.ngh_lt = ngh_lt;
		this.ngh_th = ngh_th;
		this.tiet_bd_lt = tiet_bd_lt;
		this.tiet_bd_th = tiet_bd_th;
		this.sotiet = sotiet;
	}

	public String getMa_tg_hoc() {
		return ma_tg_hoc;
	}

	public void setMa_tg_hoc(String ma_tg_hoc) {
		this.ma_tg_hoc = ma_tg_hoc;
	}

	public int getNgh_lt() {
		return ngh_lt;
	}

	public void setNgh_lt(int ngh_lt) {
		this.ngh_lt = ngh_lt;
	}

	public int getNgh_th() {
		return ngh_th;
	}

	public void setNgh_th(int ngh_th) {
		this.ngh_th = ngh_th;
	}

	public int getTiet_bd_lt() {
		return tiet_bd_lt;
	}

	public void setTiet_bd_lt(int tiet_bd_lt) {
		this.tiet_bd_lt = tiet_bd_lt;
	}

	public int getTiet_bd_th() {
		return tiet_bd_th;
	}

	public void setTiet_bd_th(int tiet_bd_th) {
		this.tiet_bd_th = tiet_bd_th;
	}

	public int getSotiet() {
		return sotiet;
	}

	public void setSotiet(int sotiet) {
		this.sotiet = sotiet;
	}

	
}
