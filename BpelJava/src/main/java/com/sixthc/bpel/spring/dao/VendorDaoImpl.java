package com.sixthc.bpel.spring.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sixthc.bpel.spring.model.Vendor;
import com.sixthc.bpel.spring.service.VendorLookupException;

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

	public String getURLByVendorName(String vendor, String user,
			String operationName) throws VendorLookupException {
		String queryString = "SELECT vendor_test_seq_steps.out_url "
				+ "FROM vendor, users, vendor_test_sequences, vendor_test_seq_steps, test_sequence, test_seq_step "
				+ "WHERE LOWER(vendor.name) = LOWER(:vendor) "
				+ "AND LOWER(users.name) = LOWER(:user) "
				+ "AND vendor_test_sequences.vendor_id = vendor.vendor_id "
				+ "AND vendor_test_sequences.user_id = users.id "
				+ "AND test_sequence.test_sequence_id = vendor_test_sequences.test_sequence_id "
				+ "AND test_seq_step.test_sequence_id = test_sequence.test_sequence_id "
				+ "AND test_sequence.type = 'standalone' "
				+ "AND test_sequence.name = :operation_name "
				+ "AND vendor_test_seq_steps.test_seq_step_id = test_seq_step.test_seq_step_id "
				+ "AND vendor_test_seq_steps.vendor_test_sequences_id = vendor_test_sequences.vendor_test_sequences_id";

		Query query = getSession().createSQLQuery(queryString)
				.setParameter("vendor", vendor).setParameter("user", user)
				.setParameter("operation_name", operationName);
		String result = (String) query.uniqueResult();

		if (result == null)
			throw new VendorLookupException("URL not found for vendor "
					+ vendor + ", user " + user + ", operation "
					+ operationName);
		return result;
	}
}