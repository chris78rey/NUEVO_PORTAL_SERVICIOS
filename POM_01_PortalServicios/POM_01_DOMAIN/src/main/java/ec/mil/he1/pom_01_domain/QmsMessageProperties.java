/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "QMS_MESSAGE_PROPERTIES")
@NamedQueries({
    @NamedQuery(name = "QmsMessageProperties.findAll", query = "SELECT q FROM QmsMessageProperties q")})
public class QmsMessageProperties implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SEVERITY")
    private String severity;
    @Column(name = "LOGGING_IND")
    private String loggingInd;
    @Column(name = "SUPPR_WRNG_IND")
    private String supprWrngInd;
    @Column(name = "SUPPR_ALWAYS_IND")
    private String supprAlwaysInd;
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;

    public QmsMessageProperties() {
    }

    public QmsMessageProperties(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getLoggingInd() {
        return loggingInd;
    }

    public void setLoggingInd(String loggingInd) {
        this.loggingInd = loggingInd;
    }

    public String getSupprWrngInd() {
        return supprWrngInd;
    }

    public void setSupprWrngInd(String supprWrngInd) {
        this.supprWrngInd = supprWrngInd;
    }

    public String getSupprAlwaysInd() {
        return supprAlwaysInd;
    }

    public void setSupprAlwaysInd(String supprAlwaysInd) {
        this.supprAlwaysInd = supprAlwaysInd;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QmsMessageProperties)) {
            return false;
        }
        QmsMessageProperties other = (QmsMessageProperties) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.QmsMessageProperties[ code=" + code + " ]";
    }
    
}
