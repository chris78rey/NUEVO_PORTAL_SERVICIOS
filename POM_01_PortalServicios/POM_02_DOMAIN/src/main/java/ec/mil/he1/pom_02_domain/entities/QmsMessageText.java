/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "QMS_MESSAGE_TEXT")
@NamedQueries({
    @NamedQuery(name = "QmsMessageText.findAll", query = "SELECT q FROM QmsMessageText q")})
public class QmsMessageText implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QmsMessageTextPK qmsMessageTextPK;
    @Column(name = "TEXT")
    private String text;
    @Column(name = "HELP_TEXT")
    private String helpText;
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
    @JoinColumn(name = "MSP_CODE", referencedColumnName = "CODE", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private QmsMessageProperties qmsMessageProperties;

    public QmsMessageText() {
    }

    public QmsMessageText(QmsMessageTextPK qmsMessageTextPK) {
        this.qmsMessageTextPK = qmsMessageTextPK;
    }

    public QmsMessageText(String language, String mspCode) {
        this.qmsMessageTextPK = new QmsMessageTextPK(language, mspCode);
    }

    public QmsMessageTextPK getQmsMessageTextPK() {
        return qmsMessageTextPK;
    }

    public void setQmsMessageTextPK(QmsMessageTextPK qmsMessageTextPK) {
        this.qmsMessageTextPK = qmsMessageTextPK;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
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

    public QmsMessageProperties getQmsMessageProperties() {
        return qmsMessageProperties;
    }

    public void setQmsMessageProperties(QmsMessageProperties qmsMessageProperties) {
        this.qmsMessageProperties = qmsMessageProperties;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qmsMessageTextPK != null ? qmsMessageTextPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QmsMessageText)) {
            return false;
        }
        QmsMessageText other = (QmsMessageText) object;
        if ((this.qmsMessageTextPK == null && other.qmsMessageTextPK != null) || (this.qmsMessageTextPK != null && !this.qmsMessageTextPK.equals(other.qmsMessageTextPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.QmsMessageText[ qmsMessageTextPK=" + qmsMessageTextPK + " ]";
    }
    
}
