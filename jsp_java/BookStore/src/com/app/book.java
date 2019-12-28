package com.app;

public class book {
int bkid;
String author;
public String getPath() {
	return path;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public void setPath(String path) {
	this.path = path;
}
String bname;
double price;
String path;
@Override
public String toString() {
	return "book [bkid=" + bkid + ", bname=" + bname + ", price=" + price + ", path=" + path + "]";
}
public int getBkid() {
	return bkid;
}
public void setBkid(int bkid) {
	this.bkid = bkid;
}

public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
