/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CATEGORIA_CARGO")
@NamedQueries({
    @NamedQuery(name = "CategoriaCargo.findAll", query = "SELECT c FROM CategoriaCargo c")})
public class CategoriaCargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CCG_IDCATEGORIACARGO")
    private String ccgIdcategoriacargo;
    @Column(name = "CCG_NOMBRE")
    private String ccgNombre;
    @Column(name = "CCG_GRUPOOCACIONAL")
    private String ccgGrupoocacional;
    @Column(name = "CCG_GRADO")
    private String ccgGrado;
    @Column(name = "CCG_UNIDAD")
    private String ccgUnidad;
    @Column(name = "CCG_CODIGOIESS")
    private String ccgCodigoiess;
    @Column(name = "CCG_DESCRIPCION")
    private String ccgDescripcion;
    @Column(name = "CCG_CUENTACONTABLE")
    private String ccgCuentacontable;
    @Column(name = "CCG_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccgFechacreacion;
    @Column(name = "CCG_USER")
    private String ccgUser;
    @OneToMany(mappedBy = "categoriaCargo", fetch = FetchType.LAZY)
    private List<RolAcumulado> rolAcumuladoList;
    @OneToMany(mappedBy = "categoriaCargo", fetch = FetchType.LAZY)
    private List<PersonalCargo> personalCargoList;
    @OneToMany(mappedBy = "categoriaCargo", fetch = FetchType.LAZY)
    private List<RolDetallado> rolDetalladoList;

    public CategoriaCargo() {
    }

    public CategoriaCargo(String ccgIdcategoriacargo) {
        this.ccgIdcategoriacargo = ccgIdcategoriacargo;
    }

    public String getCcgIdcategoriacargo() {
        return ccgIdcategoriacargo;
    }

    public void setCcgIdcategoriacargo(String ccgIdcategoriacargo) {
        this.ccgIdcategoriacargo = ccgIdcategoriacargo;
    }

    public String getCcgNombre() {
        return ccgNombre;
    }

    public void setCcgNombre(String ccgNombre) {
        this.ccgNombre = ccgNombre;
    }

    public String getCcgGrupoocacional() {
        return ccgGrupoocacional;
    }

    public void setCcgGrupoocacional(String ccgGrupoocacional) {
        this.ccgGrupoocacional = ccgGrupoocacional;
    }

    public String getCcgGrado() {
        return ccgGrado;
    }

    public void setCcgGrado(String ccgGrado) {
        this.ccgGrado = ccgGrado;
    }

    public String getCcgUnidad() {
        return ccgUnidad;
    }

    public void setCcgUnidad(String ccgUnidad) {
        this.ccgUnidad = ccgUnidad;
    }

    public String getCcgCodigoiess() {
        return ccgCodigoiess;
    }

    public void setCcgCodigoiess(String ccgCodigoiess) {
        this.ccgCodigoiess = ccgCodigoiess;
    }

    public String getCcgDescripcion() {
        return ccgDescripcion;
    }

    public void setCcgDescripcion(String ccgDescripcion) {
        this.ccgDescripcion = ccgDescripcion;
    }

    public String getCcgCuentacontable() {
        return ccgCuentacontable;
    }

    public void setCcgCuentacontable(String ccgCuentacontable) {
        this.ccgCuentacontable = ccgCuentacontable;
    }

    public Date getCcgFechacreacion() {
        return ccgFechacreacion;
    }

    public void setCcgFechacreacion(Date ccgFechacreacion) {
        this.ccgFechacreacion = ccgFechacreacion;
    }

    public String getCcgUser() {
        return ccgUser;
    }

    public void setCcgUser(String ccgUser) {
        this.ccgUser = ccgUser;
    }

    public List<RolAcumulado> getRolAcumuladoList() {
        return rolAcumuladoList;
    }

    public void setRolAcumuladoList(List<RolAcumulado> rolAcumuladoList) {
        this.rolAcumuladoList = rolAcumuladoList;
    }

    public List<PersonalCargo> getPersonalCargoList() {
        return personalCargoList;
    }

    public void setPersonalCargoList(List<PersonalCargo> personalCargoList) {
        this.personalCargoList = personalCargoList;
    }

    public List<RolDetallado> getRolDetalladoList() {
        return rolDetalladoList;
    }

    public void setRolDetalladoList(List<RolDetallado> rolDetalladoList) {
        this.rolDetalladoList = rolDetalladoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ccgIdcategoriacargo != null ? ccgIdcategoriacargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaCargo)) {
            return false;
        }
        CategoriaCargo other = (CategoriaCargo) object;
        if ((this.ccgIdcategoriacargo == null && other.ccgIdcategoriacargo != null) || (this.ccgIdcategoriacargo != null && !this.ccgIdcategoriacargo.equals(other.ccgIdcategoriacargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CategoriaCargo[ ccgIdcategoriacargo=" + ccgIdcategoriacargo + " ]";
    }
    
}
