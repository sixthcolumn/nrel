package com.sixthc.bpel.spring.dao;

import com.sixthc.bpel.spring.model.Pkg;
import com.sixthc.bpel.spring.model.PkgGroup;

public interface PkgGroupDao {

	public void save(PkgGroup PkgGroup);

	public void update(PkgGroup PkgGroup);

	public void delete(PkgGroup PkgGroup);

	public PkgGroup findById(int id);

	public PkgGroup findByName(String pkgGroupName);

	public PkgGroup find(String pkgGroupName,Pkg pkg);
}
