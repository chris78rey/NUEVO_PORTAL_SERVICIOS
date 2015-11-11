/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "UNIDADES_FAMILIARES")
@NamedQueries({
    @NamedQuery(name = "UnidadesFamiliares.findAll", query = "SELECT u FROM UnidadesFamiliares u")})
public class UnidadesFamiliares implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "APELLIDO_PATERNO_MADRE")
    private String apellidoPaternoMadre;
    @Column(name = "APELLIDO_MATERNO_MADRE")
    private String apellidoMaternoMadre;
    @Column(name = "NOMBRES_MADRE")
    private String nombresMadre;
    @Column(name = "OCUPACION_MADRE")
    private String ocupacionMadre;
    @Column(name = "APELLIDO_PATERNO_PADRE")
    private String apellidoPaternoPadre;
    @Column(name = "APELLIDO_MATERNO_PADRE")
    private String apellidoMaternoPadre;
    @Column(name = "NOMBRES_PADRE")
    private String nombresPadre;
    @Column(name = "OCUPACION_PADRE")
    private String ocupacionPadre;
    @Column(name = "PRQ_CNT_PRV_CODIGO")
    private String prqCntPrvCodigo;
    @Column(name = "PRQ_CNT_CODIGO")
    private String prqCntCodigo;
    @Column(name = "PRQ_CODIGO")
    private String prqCodigo;
    @Column(name = "DIRECCION_DOMICILIO")
    private String direccionDomicilio;
    @Column(name = "TELEFONO")
    private String telefono;

    public UnidadesFamiliares() {
    }

    public UnidadesFamiliares(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getApellidoPaternoMadre() {
        return apellidoPaternoMadre;
    }

    public void setApellidoPaternoMadre(String apellidoPaternoMadre) {
        this.apellidoPaternoMadre = apellidoPaternoMadre;
    }

    public String getApellidoMaternoMadre() {
        return apellidoMaternoMadre;
    }

    public void setApellidoMaternoMadre(String apellidoMaternoMadre) {
        this.apellidoMaternoMadre = apellidoMaternoMadre;
    }

    public String getNombresMadre() {
        return nombresMadre;
    }

    public void setNombresMadre(String nombresMadre) {
        this.nombresMadre = nombresMadre;
    }

    public String getOcupacionMadre() {
        return ocupacionMadre;
    }

    public void setOcupacionMadre(String ocupacionMadre) {
        this.ocupacionMadre = ocupacionMadre;
    }

    public String getApellidoPaternoPadre() {
        return apellidoPaternoPadre;
    }

    public void setApellidoPaternoPadre(String apellidoPaternoPadre) {
        this.apellidoPaternoPadre = apellidoPaternoPadre;
    }

    public String getApellidoMaternoPadre() {
        return apellidoMaternoPadre;
    }

    public void setApellidoMaternoPadre(String apellidoMaternoPadre) {
        this.apellidoMaternoPadre = apellidoMaternoPadre;
    }

    public String getNombresPadre() {
        return nombresPadre;
    }

    public void setNombresPadre(String nombresPadre) {
        this.nombresPadre = nombresPadre;
    }

    public String getOcupacionPadre() {
        return ocupacionPadre;
    }

    public void setOcupacionPadre(String ocupacionPadre) {
        this.ocupacionPadre = ocupacionPadre;
    }

    public String getPrqCntPrvCodigo() {
        return prqCntPrvCodigo;
    }

    public void setPrqCntPrvCodigo(String prqCntPrvCodigo) {
        this.prqCntPrvCodigo = prqCntPrvCodigo;
    }

    public String getPrqCntCodigo() {
        return prqCntCodigo;
    }

    public void setPrqCntCodigo(String prqCntCodigo) {
        this.prqCntCodigo = prqCntCodigo;
    }

    public String getPrqCodigo() {
        return prqCodigo;
    }

    public void setPrqCodigo(String prqCodigo) {
        this.prqCodigo = prqCodigo;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadesFamiliares)) {
            return false;
        }
        UnidadesFamiliares other = (UnidadesFamiliares) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.UnidadesFamiliares[ numero=" + numero + " ]";
    }
    
}
