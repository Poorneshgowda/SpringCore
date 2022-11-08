package com.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	private List addressList;
	private Set addressSet;
	private Map addressMap;

	public List getAddressList() {
		System.out.println("From List");
		return addressList;
	}

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	public Set getAddressSet() {
		System.out.println("From Set");
		return addressSet;
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	public Map getAddressMap() {
		System.out.println("From Map");
		return addressMap;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	@Override
	public String toString() {
		return "CollectionDemo [addressList=" + addressList + ", addressSet=" + addressSet + ", addressMap="
				+ addressMap + "]";
	}

}
