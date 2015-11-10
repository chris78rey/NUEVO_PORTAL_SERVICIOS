/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "QMS_MDE_PARAMS")
@NamedQueries({
    @NamedQuery(name = "QmsMdeParams.findAll", query = "SELECT q FROM QmsMdeParams q")})
public class QmsMdeParams implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MPM_SUBTYPE")
    private String mpmSubtype;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "IND_MANDATORY")
    private String indMandatory;
    @Column(name = "IND_HIDE")
    private String indHide;
    @Column(name = "IND_UPPERCASE")
    private String indUppercase;
    @Column(name = "PROMPT")
    private String prompt;
    @Column(name = "DISPLAY_SEQNO")
    private Integer displaySeqno;
    @Column(name = "PLENGTH")
    private Integer plength;
    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;
    @Column(name = "PFORMAT")
    private String pformat;
    @Column(name = "HINT_TEXT")
    private String hintText;
    @Column(name = "VALIDATION_CLAUSE")
    private String validationClause;
    @Column(name = "ERROR_CODE")
    private String errorCode;
    @Column(name = "LOV_QUERY")
    private String lovQuery;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LOV_WIDTH")
    private BigDecimal lovWidth;
    @Column(name = "LOV_COL1_WIDTH")
    private BigDecimal lovCol1Width;
    @Column(name = "LOV_COL2_WIDTH")
    private BigDecimal lovCol2Width;
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
    @JoinColumn(name = "MDE_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QmsModules qmsModules;

    public QmsMdeParams() {
    }

    public QmsMdeParams(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMpmSubtype() {
        return mpmSubtype;
    }

    public void setMpmSubtype(String mpmSubtype) {
        this.mpmSubtype = mpmSubtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getIndMandatory() {
        return indMandatory;
    }

    public void setIndMandatory(String indMandatory) {
        this.indMandatory = indMandatory;
    }

    public String getIndHide() {
        return indHide;
    }

    public void setIndHide(String indHide) {
        this.indHide = indHide;
    }

    public String getIndUppercase() {
        return indUppercase;
    }

    public void setIndUppercase(String indUppercase) {
        this.indUppercase = indUppercase;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public Integer getDisplaySeqno() {
        return displaySeqno;
    }

    public void setDisplaySeqno(Integer displaySeqno) {
        this.displaySeqno = displaySeqno;
    }

    public Integer getPlength() {
        return plength;
    }

    public void setPlength(Integer plength) {
        this.plength = plength;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getPformat() {
        return pformat;
    }

    public void setPformat(String pformat) {
        this.pformat = pformat;
    }

    public String getHintText() {
        return hintText;
    }

    public void setHintText(String hintText) {
        this.hintText = hintText;
    }

    public String getValidationClause() {
        return validationClause;
    }

    public void setValidationClause(String validationClause) {
        this.validationClause = validationClause;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getLovQuery() {
        return lovQuery;
    }

    public void setLovQuery(String lovQuery) {
        this.lovQuery = lovQuery;
    }

    public BigDecimal getLovWidth() {
        return lovWidth;
    }

    public void setLovWidth(BigDecimal lovWidth) {
        this.lovWidth = lovWidth;
    }

    public BigDecimal getLovCol1Width() {
        return lovCol1Width;
    }

    public void setLovCol1Width(BigDecimal lovCol1Width) {
        this.lovCol1Width = lovCol1Width;
    }

    public BigDecimal getLovCol2Width() {
        return lovCol2Width;
    }

    public void setLovCol2Width(BigDecimal lovCol2Width) {
        this.lovCol2Width = lovCol2Width;
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

    public QmsModules getQmsModules() {
        return qmsModules;
    }

    public void setQmsModules(QmsModules qmsModules) {
        this.qmsModules = qmsModules;
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
        if (!(object instanceof QmsMdeParams)) {
            return false;
        }
        QmsMdeParams other = (QmsMdeParams) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.QmsMdeParams[ id=" + id + " ]";
    }
    
}
