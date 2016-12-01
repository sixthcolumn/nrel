package com.sixthc.bpel.spring.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sixthc.bpel.spring.model.Pkg;
import com.sixthc.bpel.spring.model.PkgGroup;

@Repository("PkgGroupDao")
public class PkgGroupDaoImpl extends AbstractDao implements PkgGroupDao {

	@Override
	public void save(PkgGroup PkgGroup) {
		save(PkgGroup);
		// TODO : I know this way of setting default date is kludge. should
		// probably write an even handler or use jpa
	}

	@Override
	public void update(PkgGroup PkgGroup) {
		update(PkgGroup);
	}

	@Override
	public void delete(PkgGroup PkgGroup) {
		delete(PkgGroup);
	}

	@Override
	public PkgGroup findById(int id) {
		Criteria criteria = getSession().createCriteria(PkgGroup.class);
		criteria.add(Restrictions.eq("id", id));
		return (PkgGroup) criteria.uniqueResult();
	}

	public PkgGroup findByName(String pkgGroupName) {
		Criteria criteria = getSession().createCriteria(PkgGroup.class);
		criteria.add(Restrictions.eq("name", pkgGroupName));
		return (PkgGroup) criteria.uniqueResult();
	}
	
	public PkgGroup find(String pkgGroupName,Pkg pkg) {
		Criteria criteria = getSession().createCriteria(PkgGroup.class);
		criteria.add(Restrictions.eq("name", pkgGroupName)).add(Restrictions.eq("id", pkg.getId()));
		return (PkgGroup) criteria.uniqueResult();
	}

}
