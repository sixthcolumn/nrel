package com.sixthc.hbm;
// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PackagesVendorRoleTypesId generated by hbm2java
 */
@Embeddable
public class PackagesVendorRoleTypesId  implements java.io.Serializable {


     private Integer packageId;
     private Integer vendorRoleTypeId;

    public PackagesVendorRoleTypesId() {
    }

    public PackagesVendorRoleTypesId(Integer packageId, Integer vendorRoleTypeId) {
       this.packageId = packageId;
       this.vendorRoleTypeId = vendorRoleTypeId;
    }
   

    @Column(name="package_id")
    public Integer getPackageId() {
        return this.packageId;
    }
    
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    @Column(name="vendor_role_type_id")
    public Integer getVendorRoleTypeId() {
        return this.vendorRoleTypeId;
    }
    
    public void setVendorRoleTypeId(Integer vendorRoleTypeId) {
        this.vendorRoleTypeId = vendorRoleTypeId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PackagesVendorRoleTypesId) ) return false;
		 PackagesVendorRoleTypesId castOther = ( PackagesVendorRoleTypesId ) other; 
         
		 return ( (this.getPackageId()==castOther.getPackageId()) || ( this.getPackageId()!=null && castOther.getPackageId()!=null && this.getPackageId().equals(castOther.getPackageId()) ) )
 && ( (this.getVendorRoleTypeId()==castOther.getVendorRoleTypeId()) || ( this.getVendorRoleTypeId()!=null && castOther.getVendorRoleTypeId()!=null && this.getVendorRoleTypeId().equals(castOther.getVendorRoleTypeId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPackageId() == null ? 0 : this.getPackageId().hashCode() );
         result = 37 * result + ( getVendorRoleTypeId() == null ? 0 : this.getVendorRoleTypeId().hashCode() );
         return result;
   }   


}


