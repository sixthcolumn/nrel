package com.sixthc.bpel.spring.dao;

import com.sixthc.bpel.spring.model.Vendor;
import com.sixthc.bpel.spring.service.VendorLookupException;

public interface VendorDao {

	public void save(Vendor Vendor);

	public void update(Vendor Vendor);

	public void delete(Vendor Vendor);

	public Vendor findById(int id);

	public Vendor findByName(String name);

	public String getURLByVendorName(String vendor, String user,
			String operationName) throws VendorLookupException;
}
