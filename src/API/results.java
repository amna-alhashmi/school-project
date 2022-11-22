package API;

public class results {

private String gender;
private String email;
private String  phone;
private String cell;
private String nat;


private Name name;
private Location location;
private Login login;
private dob DOB;
private registered REGISTERED;
private id ID;
private picture PICTURE;



public Login getLOGIN() {
	return login;
}
public void setLOGIN(Login lOGIN) {
	login = lOGIN;
}
public Location getLOCATION() {
	return location;
}
public void setLOCATION(Location lOCATION) {
	location = lOCATION;
}
public Name getName() {
	return name;
}
public void setName(Name name) {
	name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getCell() {
	return cell;
}
public void setCell(String cell) {
	this.cell = cell;
}
public String getNat() {
	return nat;
}
public void setNat(String nat) {
	this.nat = nat;
}


}
