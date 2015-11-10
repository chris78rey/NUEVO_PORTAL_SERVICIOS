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
@Table(name = "MAESTROS_BENEFICIARIOS")
@NamedQueries({
    @NamedQuery(name = "MaestrosBeneficiarios.findAll", query = "SELECT m FROM MaestrosBeneficiarios m")})
public class MaestrosBeneficiarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maestrosBeneficiarios", fetch = FetchType.LAZY)
    private List<EntidadesBeneficiarias> entidadesBeneficiariasList;
    @OneToMany(mappedBy = "maestrosBeneficiarios", fetch = FetchType.LAZY)
    private List<FormulasCalculoPagos> formulasCalculoPagosList;

    public MaestrosBeneficiarios() {
    }

    public MaestrosBeneficiarios(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<EntidadesBeneficiarias> getEntidadesBeneficiariasList() {
        return entidadesBeneficiariasList;
    }

    public void setEntidadesBeneficiariasList(List<EntidadesBeneficiarias> entidadesBeneficiariasList) {
        this.entidadesBeneficiariasList = entidadesBeneficiariasList;
    }

    public List<FormulasCalculoPagos> getFormulasCalculoPagosList() {
        return formulasCalculoPagosList;
    }

    public void setFormulasCalculoPagosList(List<FormulasCalculoPagos> formulasCalculoPagosList) {
        this.formulasCalculoPagosList = formulasCalculoPagosList;
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
        if (!(object instanceof MaestrosBeneficiarios)) {
            return false;
        }
        MaestrosBeneficiarios other = (MaestrosBeneficiarios) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MaestrosBeneficiarios[ codigo=" + codigo + " ]";
    }
    
}
