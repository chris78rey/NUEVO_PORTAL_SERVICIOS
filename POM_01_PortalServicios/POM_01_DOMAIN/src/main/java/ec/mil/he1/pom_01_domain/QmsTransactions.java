/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "QMS_TRANSACTIONS")
@NamedQueries({
    @NamedQuery(name = "QmsTransactions.findAll", query = "SELECT q FROM QmsTransactions q")})
public class QmsTransactions implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "TIMESTAMP_OPEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestampOpen;
    @Column(name = "TIMESTAMP_CLOSE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestampClose;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "SESSION_ID")
    private String sessionId;

    public QmsTransactions() {
    }

    public QmsTransactions(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimestampOpen() {
        return timestampOpen;
    }

    public void setTimestampOpen(Date timestampOpen) {
        this.timestampOpen = timestampOpen;
    }

    public Date getTimestampClose() {
        return timestampClose;
    }

    public void setTimestampClose(Date timestampClose) {
        this.timestampClose = timestampClose;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QmsTransactions)) {
            return false;
        }
        QmsTransactions other = (QmsTransactions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.QmsTransactions[ id=" + id + " ]";
    }
    
}
