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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "PROTOCOLOS")
@NamedQueries({
    @NamedQuery(name = "Protocolos.findAll", query = "SELECT p FROM Protocolos p")})
public class Protocolos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Short codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "TIPO")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "protocolos", fetch = FetchType.LAZY)
    private List<VariablesProtocolo> variablesProtocoloList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "protocolos", fetch = FetchType.LAZY)
    private List<ProtocolosPaciente> protocolosPacienteList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;

    public Protocolos() {
    }

    public Protocolos(Short codigo) {
        this.codigo = codigo;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<VariablesProtocolo> getVariablesProtocoloList() {
        return variablesProtocoloList;
    }

    public void setVariablesProtocoloList(List<VariablesProtocolo> variablesProtocoloList) {
        this.variablesProtocoloList = variablesProtocoloList;
    }

    public List<ProtocolosPaciente> getProtocolosPacienteList() {
        return protocolosPacienteList;
    }

    public void setProtocolosPacienteList(List<ProtocolosPaciente> protocolosPacienteList) {
        this.protocolosPacienteList = protocolosPacienteList;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
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
        if (!(object instanceof Protocolos)) {
            return false;
        }
        Protocolos other = (Protocolos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Protocolos[ codigo=" + codigo + " ]";
    }
    
}
