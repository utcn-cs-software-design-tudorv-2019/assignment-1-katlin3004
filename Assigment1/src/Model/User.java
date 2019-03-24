package Model;

import java.util.Date;

public class User {
	private int iduser;
	private String username;
	private String passowrd;
	private String name;
	private String prenoum;
	private int cnp;
	private int idcard;
	private String adress;
	private Date birthday;
	private String role;

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenoum() {
		return prenoum;
	}

	public void setPrenoum(String prenoum) {
		this.prenoum = prenoum;
	}

	public int getCnp() {
		return cnp;
	}

	public void setCnp(int cnp) {
		this.cnp = cnp;
	}

	public int getIdcard() {
		return idcard;
	}

	public void setIdcard(int idcard) {
		this.idcard = idcard;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
