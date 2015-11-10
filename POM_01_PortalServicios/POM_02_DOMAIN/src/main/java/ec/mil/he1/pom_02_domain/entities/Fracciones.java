/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "FRACCIONES")
@NamedQueries({
    @NamedQuery(name = "Fracciones.findAll", query = "SELECT f FROM Fracciones f")})
public class Fracciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "FRACCION")
    private String fraccion;
    @Column(name = "VENCIMIENTO")
    private Integer vencimiento;
    @Column(name = "VOLUMEN_NOMINAL")
    private Short volumenNominal;
    @OneToMany(mappedBy = "fracciones", fetch = FetchType.LAZY)
    private List<Fraccionamientos> fraccionamientosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fracciones", fetch = FetchType.LAZY)
    private List<DetallesTransfusiones> detallesTransfusionesList;

    public Fracciones() {
    }

    public Fracciones(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public Integer getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Integer vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Short getVolumenNominal() {
        return volumenNominal;
    }

    public void setVolumenNominal(Short volumenNominal) {
        this.volumenNominal = volumenNominal;
    }

    public List<Fraccionamientos> getFraccionamientosList() {
        return fraccionamientosList;
    }

    public void setFraccionamientosList(List<Fraccionamientos> fraccionamientosList) {
        this.fraccionamientosList = fraccionamientosList;
    }

    public List<DetallesTransfusiones> getDetallesTransfusionesList() {
        return detallesTransfusionesList;
    }

    public void setDetallesTransfusionesList(List<DetallesTransfusiones> detallesTransfusionesList) {
        this.detallesTransfusionesList = detallesTransfusionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fracciones)) {
            return false;
        }
        Fracciones other = (Fracciones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Fracciones[ codigo=" + codigo + " ]";
    }
    
}
