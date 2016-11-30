package com.sixthc.bpel.spring.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sixthc.bpel.spring.model.Vendor;

@Repository("VendorDao")
public class VendorDaoImpl extends AbstractDao implements VendorDao {

	@Override
	public void save(Vendor Vendor) {
		save(Vendor);
	}

	@Override
	public void update(Vendor Vendor) {
		update(Vendor);
	}

	@Override
	public void delete(Vendor Vendor) {
		delete(Vendor);
	}

	@Override
	public Vendor findById(int id) {
		Criteria criteria = getSession().createCriteria(Vendor.class);
		criteria.add(Restrictions.eq("id", id));
		return (Vendor) criteria.uniqueResult();
	}

	public Vendor findByName(String name) {
		Criteria criteria = getSession().createCriteria(Vendor.class);
		criteria.add(Restrictions.eq("name", name));
		return (Vendor) criteria.uniqueResult();
	}

}
