package com.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

	@Id
	@Column(name = "maso_sv")
	private int maso_sv;

	@Column(name = "hoten_sv")
	private String hoten_sv;

	@Column(name = "gt_sv")
	private String gt_sv;

	@Column(name = "mk_sv")
	private String mk_sv;

	@Column(name = "lop")
	private String lop;

	@Column(name = "khoa")
	private String khoa;

	@Column(name = "ngaysinh")
	private Date ngaysinh;

	@Column(name = "dt_sv")
	private String dt_sv;

	@Column(name = "dc_sv")
	private String dc_sv;

	@ManyToMany
	@JoinTable(name = "dkmh", joinColumns = @JoinColumn(name = "maso_sv"), inverseJoinColumns = @JoinColumn(name = "ma_mh"))
	private List<Subjects> subjects;

	public Students() {
	}

	public Students(int maso_sv, String hoten_sv, String gt_sv, String mk_sv, String lop, String khoa, Date ngaysinh,
			String dt_sv, String dc_sv) {
		this.maso_sv = maso_sv;
		this.hoten_sv = hoten_sv;
		this.gt_sv = gt_sv;
		this.mk_sv = mk_sv;
		this.lop = lop;
		this.khoa = khoa;
		this.ngaysinh = ngaysinh;
		this.dt_sv = dt_sv;
		this.dc_sv = dc_sv;
	}

	public int getMaso_sv() {
		return maso_sv;
	}

	public void setMaso_sv(int maso_sv) {
		this.maso_sv = maso_sv;
	}

	public String getHoten_sv() {
		return hoten_sv;
	}

	public void setHoten_sv(String hoten_sv) {
		this.hoten_sv = hoten_sv;
	}

	public String getGt_sv() {
		return gt_sv;
	}

	public void setGt_sv(String gt_sv) {
		this.gt_sv = gt_sv;
	}

	public String getMk_sv() {
		return mk_sv;
	}

	public void setMk_sv(String mk_sv) {
		this.mk_sv = mk_sv;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDt_sv() {
		return dt_sv;
	}

	public void setDt_sv(String dt_sv) {
		this.dt_sv = dt_sv;
	}

	public String getDc_sv() {
		return dc_sv;
	}

	public void setDc_sv(String dc_sv) {
		this.dc_sv = dc_sv;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

}
