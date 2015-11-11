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
@Table(name = "QMS_USER_OPTIONS")
@NamedQueries({
    @NamedQuery(name = "QmsUserOptions.findAll", query = "SELECT q FROM QmsUserOptions q")})
public class QmsUserOptions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "LANGUAGE")
    private String language;
    @Column(name = "MENU_CALL_METHOD")
    private String menuCallMethod;
    @Column(name = "ENABLE_CS_IND")
    private String enableCsInd;
    @Column(name = "HIGHLIGHT_QI_IND")
    private String highlightQiInd;
    @Column(name = "HIGHLIGHT_RI_IND")
    private String highlightRiInd;
    @Column(name = "VA_QUERYABLE_ITEM")
    private String vaQueryableItem;
    @Column(name = "VA_REQUIRED_ITEM")
    private String vaRequiredItem;
    @Column(name = "VA_READONLY_ITEM")
    private String vaReadonlyItem;
    @Column(name = "VA_SELECTED_RECORD")
    private String vaSelectedRecord;
    @Column(name = "RAISE_FIND_WINDOW")
    private String raiseFindWindow;
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

    public QmsUserOptions() {
    }

    public QmsUserOptions(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMenuCallMethod() {
        return menuCallMethod;
    }

    public void setMenuCallMethod(String menuCallMethod) {
        this.menuCallMethod = menuCallMethod;
    }

    public String getEnableCsInd() {
        return enableCsInd;
    }

    public void setEnableCsInd(String enableCsInd) {
        this.enableCsInd = enableCsInd;
    }

    public String getHighlightQiInd() {
        return highlightQiInd;
    }

    public void setHighlightQiInd(String highlightQiInd) {
        this.highlightQiInd = highlightQiInd;
    }

    public String getHighlightRiInd() {
        return highlightRiInd;
    }

    public void setHighlightRiInd(String highlightRiInd) {
        this.highlightRiInd = highlightRiInd;
    }

    public String getVaQueryableItem() {
        return vaQueryableItem;
    }

    public void setVaQueryableItem(String vaQueryableItem) {
        this.vaQueryableItem = vaQueryableItem;
    }

    public String getVaRequiredItem() {
        return vaRequiredItem;
    }

    public void setVaRequiredItem(String vaRequiredItem) {
        this.vaRequiredItem = vaRequiredItem;
    }

    public String getVaReadonlyItem() {
        return vaReadonlyItem;
    }

    public void setVaReadonlyItem(String vaReadonlyItem) {
        this.vaReadonlyItem = vaReadonlyItem;
    }

    public String getVaSelectedRecord() {
        return vaSelectedRecord;
    }

    public void setVaSelectedRecord(String vaSelectedRecord) {
        this.vaSelectedRecord = vaSelectedRecord;
    }

    public String getRaiseFindWindow() {
        return raiseFindWindow;
    }

    public void setRaiseFindWindow(String raiseFindWindow) {
        this.raiseFindWindow = raiseFindWindow;
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
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QmsUserOptions)) {
            return false;
        }
        QmsUserOptions other = (QmsUserOptions) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.QmsUserOptions[ userName=" + userName + " ]";
    }
    
}
