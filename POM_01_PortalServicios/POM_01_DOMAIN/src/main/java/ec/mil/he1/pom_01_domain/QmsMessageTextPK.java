/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class QmsMessageTextPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LANGUAGE")
    private String language;
    @Basic(optional = false)
    @Column(name = "MSP_CODE")
    private String mspCode;

    public QmsMessageTextPK() {
    }

    public QmsMessageTextPK(String language, String mspCode) {
        this.language = language;
        this.mspCode = mspCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMspCode() {
        return mspCode;
    }

    public void setMspCode(String mspCode) {
        this.mspCode = mspCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (language != null ? language.hashCode() : 0);
        hash += (mspCode != null ? mspCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QmsMessageTextPK)) {
            return false;
        }
        QmsMessageTextPK other = (QmsMessageTextPK) object;
        if ((this.language == null && other.language != null) || (this.language != null && !this.language.equals(other.language))) {
            return false;
        }
        if ((this.mspCode == null && other.mspCode != null) || (this.mspCode != null && !this.mspCode.equals(other.mspCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.QmsMessageTextPK[ language=" + language + ", mspCode=" + mspCode + " ]";
    }
    
}
