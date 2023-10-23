package springmvcsearch.objecthandler;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	
	private String name;
	@DateTimeFormat
	private Date date;
	private int singleValue;
	private List<Integer> multiValue;
	private String text;
	private Address address;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getSingleValue() {
		return singleValue;
	}
	public void setSingleValue(int singleValue) {
		this.singleValue = singleValue;
	}
	public List<Integer> getMultiValue() {
		return multiValue;
	}
	public void setMultiValue(List<Integer> multiValue) {
		this.multiValue = multiValue;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", date=" + date + ", singleValue=" + singleValue + ", multiValue="
				+ multiValue + ", text=" + text + ", address=" + address + "]";
	}
	
	
	
	

}
