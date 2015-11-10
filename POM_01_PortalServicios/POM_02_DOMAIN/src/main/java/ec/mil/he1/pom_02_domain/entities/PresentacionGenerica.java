/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PRESENTACION_GENERICA")
@NamedQueries({
    @NamedQuery(name = "PresentacionGenerica.findAll", query = "SELECT p FROM PresentacionGenerica p")})
public class PresentacionGenerica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PresentacionGenericaPK presentacionGenericaPK;
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "presentacionGenerica", fetch = FetchType.LAZY)
    private List<Posologia> posologiaList;
    @JoinColumn(name = "GEN_CODIGO_P", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Genericos genericos;
    @JoinColumn(name = "GEN_CODIGO_S", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Genericos genericos1;
    @JoinColumn(name = "PRE_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Presentaciones presentaciones;
    @OneToMany(mappedBy = "presentacionGenerica", fetch = FetchType.LAZY)
    private List<Items> itemsList;

    public PresentacionGenerica() {
    }

    public PresentacionGenerica(PresentacionGenericaPK presentacionGenericaPK) {
        this.presentacionGenericaPK = presentacionGenericaPK;
    }

    public PresentacionGenerica(String genCodigoP, int preCodigo) {
        this.presentacionGenericaPK = new PresentacionGenericaPK(genCodigoP, preCodigo);
    }

    public PresentacionGenericaPK getPresentacionGenericaPK() {
        return presentacionGenericaPK;
    }

    public void setPresentacionGenericaPK(PresentacionGenericaPK presentacionGenericaPK) {
        this.presentacionGenericaPK = presentacionGenericaPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Posologia> getPosologiaList() {
        return posologiaList;
    }

    public void setPosologiaList(List<Posologia> posologiaList) {
        this.posologiaList = posologiaList;
    }

    public Genericos getGenericos() {
        return genericos;
    }

    public void setGenericos(Genericos genericos) {
        this.genericos = genericos;
    }

    public Genericos getGenericos1() {
        return genericos1;
    }

    public void setGenericos1(Genericos genericos1) {
        this.genericos1 = genericos1;
    }

    public Presentaciones getPresentaciones() {
        return presentaciones;
    }

    public void setPresentaciones(Presentaciones presentaciones) {
        this.presentaciones = presentaciones;
    }

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (presentacionGenericaPK != null ? presentacionGenericaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresentacionGenerica)) {
            return false;
        }
        PresentacionGenerica other = (PresentacionGenerica) object;
        if ((this.presentacionGenericaPK == null && other.presentacionGenericaPK != null) || (this.presentacionGenericaPK != null && !this.presentacionGenericaPK.equals(other.presentacionGenericaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PresentacionGenerica[ presentacionGenericaPK=" + presentacionGenericaPK + " ]";
    }
    
}
