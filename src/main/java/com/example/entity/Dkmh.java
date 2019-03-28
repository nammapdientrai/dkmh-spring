package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dkmh")
public class Dkmh {

	@Id
	@Column(name = "dkmh_id")
	private String dkmh_id;

	@Column(name = "maso_sv")
	private int maso_sv;

	@Column(name = "ma_mh")
	private int ma_mh;

	public Dkmh() {

	}

	public Dkmh(String dkmh_id, int maso_sv, int ma_mh) {
		this.dkmh_id = dkmh_id;
		this.maso_sv = maso_sv;
		this.ma_mh = ma_mh;
	}

	public String getDkmh_id() {
		return dkmh_id;
	}

	public int getMaso_sv() {
		return maso_sv;
	}

	public void setMaso_sv(int maso_sv) {
		this.maso_sv = maso_sv;
	}

	public int getMa_mh() {
		return ma_mh;
	}

	public void setMa_mh(int ma_mh) {
		this.ma_mh = ma_mh;
	}

}
