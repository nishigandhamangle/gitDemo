package dateexpire;

import java.sql.Date;

public class medicine {
int id;
String name;
Date expiryDate;
public int getId() {
	return id;
}
public void setId(int mid) {
	this.id = mid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expirydate) {
	this.expiryDate = expirydate;
}
}
