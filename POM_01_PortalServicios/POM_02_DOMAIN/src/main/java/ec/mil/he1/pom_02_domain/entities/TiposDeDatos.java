/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "TIPOS_DE_DATOS")
@NamedQueries({
    @NamedQuery(name = "TiposDeDatos.findAll", query = "SELECT t FROM TiposDeDatos t")})
public class TiposDeDatos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SECUENCIAL")
    private Short secuencial;
    @Column(name = "LONGITUD")
    private Short longitud;
    @Column(name = "MASCARA")
    private String mascara;
    @Column(name = "RANGO")
    private String rango;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "VALOR_POR_DEFECTO")
    private String valorPorDefecto;
    @Column(name = "TPODTO_DECIMAL")
    private Short tpodtoDecimal;
    @OneToMany(mappedBy = "tiposDeDatos", fetch = FetchType.LAZY)
    private List<VariablesProtocolo> variablesProtocoloList;
    @OneToMany(mappedBy = "tiposDeDatos", fetch = FetchType.LAZY)
    private List<DetallesVariableProtocolo> detallesVariableProtocoloList;
    @OneToMany(mappedBy = "tiposDeDatos", fetch = FetchType.LAZY)
    private List<SubdetallesVariableProtocolo> subdetallesVariableProtocoloList;
    @OneToMany(mappedBy = "tiposDeDatos", fetch = FetchType.LAZY)
    private List<VariablesDeExamenes> variablesDeExamenesList;
    @OneToMany(mappedBy = "tiposDeDatos", fetch = FetchType.LAZY)
    private List<Complementos> complementosList;

    public TiposDeDatos() {
    }

    public TiposDeDatos(Short secuencial) {
        this.secuencial = secuencial;
    }

    public Short getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(Short secuencial) {
        this.secuencial = secuencial;
    }

    public Short getLongitud() {
        return longitud;
    }

    public void setLongitud(Short longitud) {
        this.longitud = longitud;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValorPorDefecto() {
        return valorPorDefecto;
    }

    public void setValorPorDefecto(String valorPorDefecto) {
        this.valorPorDefecto = valorPorDefecto;
    }

    public Short getTpodtoDecimal() {
        return tpodtoDecimal;
    }

    public void setTpodtoDecimal(Short tpodtoDecimal) {
        this.tpodtoDecimal = tpodtoDecimal;
    }

    public List<VariablesProtocolo> getVariablesProtocoloList() {
        return variablesProtocoloList;
    }

    public void setVariablesProtocoloList(List<VariablesProtocolo> variablesProtocoloList) {
        this.variablesProtocoloList = variablesProtocoloList;
    }

    public List<DetallesVariableProtocolo> getDetallesVariableProtocoloList() {
        return detallesVariableProtocoloList;
    }

    public void setDetallesVariableProtocoloList(List<DetallesVariableProtocolo> detallesVariableProtocoloList) {
        this.detallesVariableProtocoloList = detallesVariableProtocoloList;
    }

    public List<SubdetallesVariableProtocolo> getSubdetallesVariableProtocoloList() {
        return subdetallesVariableProtocoloList;
    }

    public void setSubdetallesVariableProtocoloList(List<SubdetallesVariableProtocolo> subdetallesVariableProtocoloList) {
        this.subdetallesVariableProtocoloList = subdetallesVariableProtocoloList;
    }

    public List<VariablesDeExamenes> getVariablesDeExamenesList() {
        return variablesDeExamenesList;
    }

    public void setVariablesDeExamenesList(List<VariablesDeExamenes> variablesDeExamenesList) {
        this.variablesDeExamenesList = variablesDeExamenesList;
    }

    public List<Complementos> getComplementosList() {
        return complementosList;
    }

    public void setComplementosList(List<Complementos> complementosList) {
        this.complementosList = complementosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secuencial != null ? secuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposDeDatos)) {
            return false;
        }
        TiposDeDatos other = (TiposDeDatos) object;
        if ((this.secuencial == null && other.secuencial != null) || (this.secuencial != null && !this.secuencial.equals(other.secuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TiposDeDatos[ secuencial=" + secuencial + " ]";
    }
    
}
