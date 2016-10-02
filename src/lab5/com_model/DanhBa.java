package lab5.com_model;

import java.io.Serializable;

public class DanhBa implements Serializable{
	private int ma;
	private String ten;
	private String phone;
	
	public DanhBa() {
		super();
	}

	public DanhBa(int ma, String ten, String phone) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.phone = phone;
	}

	public DanhBa(String ten, String phone) {
		super();
		this.ten = ten;
		this.phone = phone;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	

	


}
