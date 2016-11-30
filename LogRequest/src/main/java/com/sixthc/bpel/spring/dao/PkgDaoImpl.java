package com.sixthc.bpel.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sixthc.bpel.spring.model.MessageLog;
import com.sixthc.bpel.spring.model.Pkg;

@Repository("PkgDao")
public class PkgDaoImpl extends AbstractDao implements PkgDao {

	@Override
	public void save(Pkg pkg) {
		save(pkg);
		// TODO : I know this way of setting default date is kludge. should
		// probably write an even handler or use jpa
	}

	@Override
	public void update(Pkg pkg) {
		update(pkg);
	}

	@Override
	public void delete(Pkg pkg) {
		delete(pkg);
	}

	@Override
	public Pkg findById(int id) {
		Criteria criteria = getSession().createCriteria(Pkg.class);
		criteria.add(Restrictions.eq("id", id));
		return (Pkg) criteria.uniqueResult();
	}

	public Pkg findByName(String name) {
		Criteria criteria = getSession().createCriteria(Pkg.class);
		criteria.add(Restrictions.eq("name", name));
		return (Pkg) criteria.uniqueResult();
	}

}
