package com.sixthc.hbm;
// Generated May 31, 2015 2:36:12 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * WorkOrderAttachments generated by hbm2java
 */
@Entity
@Table(name="work_order_attachments"

)
public class WorkOrderAttachments  implements java.io.Serializable {


     private Integer id;
     private Attachment attachment;
     private WorkOrder workOrder;

    public WorkOrderAttachments() {
    }

    public WorkOrderAttachments(Attachment attachment, WorkOrder workOrder) {
       this.attachment = attachment;
       this.workOrder = workOrder;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="attachment_id", nullable=false)
    public Attachment getAttachment() {
        return this.attachment;
    }
    
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="work_order_id", nullable=false)
    public WorkOrder getWorkOrder() {
        return this.workOrder;
    }
    
    public void setWorkOrder(WorkOrder workOrder) {
        this.workOrder = workOrder;
    }




}


