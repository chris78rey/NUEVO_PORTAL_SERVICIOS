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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ROLPAGOS")
@NamedQueries({
    @NamedQuery(name = "Rolpagos.findAll", query = "SELECT r FROM Rolpagos r")})
public class Rolpagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RPG_IDROLPAGOS")
    private Long rpgIdrolpagos;
    @Column(name = "RPG_ANIO")
    private Long rpgAnio;
    @Column(name = "RPG_MES")
    private String rpgMes;
    @Column(name = "RPG_QUINCENA")
    private Long rpgQuincena;
    @Column(name = "RPG_ESTADO")
    private Character rpgEstado;
    @Column(name = "RPG_FECHAELABORACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rpgFechaelaboracion;
    @Column(name = "RPG_USER")
    private String rpgUser;
    @Column(name = "RPG_DESCRIPCION")
    private String rpgDescripcion;
    @OneToMany(mappedBy = "rolpagos", fetch = FetchType.LAZY)
    private List<Alimentacion> alimentacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolpagos", fetch = FetchType.LAZY)
    private List<RolPersnDtllTmp> rolPersnDtllTmpList;
    @OneToMany(mappedBy = "rolpagos", fetch = FetchType.LAZY)
    private List<Entradas> entradasList;
    @OneToMany(mappedBy = "rolpagos", fetch = FetchType.LAZY)
    private List<Descuento> descuentoList;
    @OneToMany(mappedBy = "rolpagos", fetch = FetchType.LAZY)
    private List<Horas> horasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolpagos", fetch = FetchType.LAZY)
    private List<AsientoContable> asientoContableList;
    @OneToMany(mappedBy = "rolpagos", fetch = FetchType.LAZY)
    private List<Prestamos> prestamosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolpagos", fetch = FetchType.LAZY)
    private List<RolDetallado> rolDetalladoList;
    @JoinColumn(name = "EMP_IDEMPRESA", referencedColumnName = "EMP_IDEMPRESA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empresa empresa;

    public Rolpagos() {
    }

    public Rolpagos(Long rpgIdrolpagos) {
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    public Long getRpgIdrolpagos() {
        return rpgIdrolpagos;
    }

    public void setRpgIdrolpagos(Long rpgIdrolpagos) {
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    public Long getRpgAnio() {
        return rpgAnio;
    }

    public void setRpgAnio(Long rpgAnio) {
        this.rpgAnio = rpgAnio;
    }

    public String getRpgMes() {
        return rpgMes;
    }

    public void setRpgMes(String rpgMes) {
        this.rpgMes = rpgMes;
    }

    public Long getRpgQuincena() {
        return rpgQuincena;
    }

    public void setRpgQuincena(Long rpgQuincena) {
        this.rpgQuincena = rpgQuincena;
    }

    public Character getRpgEstado() {
        return rpgEstado;
    }

    public void setRpgEstado(Character rpgEstado) {
        this.rpgEstado = rpgEstado;
    }

    public Date getRpgFechaelaboracion() {
        return rpgFechaelaboracion;
    }

    public void setRpgFechaelaboracion(Date rpgFechaelaboracion) {
        this.rpgFechaelaboracion = rpgFechaelaboracion;
    }

    public String getRpgUser() {
        return rpgUser;
    }

    public void setRpgUser(String rpgUser) {
        this.rpgUser = rpgUser;
    }

    public String getRpgDescripcion() {
        return rpgDescripcion;
    }

    public void setRpgDescripcion(String rpgDescripcion) {
        this.rpgDescripcion = rpgDescripcion;
    }

    public List<Alimentacion> getAlimentacionList() {
        return alimentacionList;
    }

    public void setAlimentacionList(List<Alimentacion> alimentacionList) {
        this.alimentacionList = alimentacionList;
    }

    public List<RolPersnDtllTmp> getRolPersnDtllTmpList() {
        return rolPersnDtllTmpList;
    }

    public void setRolPersnDtllTmpList(List<RolPersnDtllTmp> rolPersnDtllTmpList) {
        this.rolPersnDtllTmpList = rolPersnDtllTmpList;
    }

    public List<Entradas> getEntradasList() {
        return entradasList;
    }

    public void setEntradasList(List<Entradas> entradasList) {
        this.entradasList = entradasList;
    }

    public List<Descuento> getDescuentoList() {
        return descuentoList;
    }

    public void setDescuentoList(List<Descuento> descuentoList) {
        this.descuentoList = descuentoList;
    }

    public List<Horas> getHorasList() {
        return horasList;
    }

    public void setHorasList(List<Horas> horasList) {
        this.horasList = horasList;
    }

    public List<AsientoContable> getAsientoContableList() {
        return asientoContableList;
    }

    public void setAsientoContableList(List<AsientoContable> asientoContableList) {
        this.asientoContableList = asientoContableList;
    }

    public List<Prestamos> getPrestamosList() {
        return prestamosList;
    }

    public void setPrestamosList(List<Prestamos> prestamosList) {
        this.prestamosList = prestamosList;
    }

    public List<RolDetallado> getRolDetalladoList() {
        return rolDetalladoList;
    }

    public void setRolDetalladoList(List<RolDetallado> rolDetalladoList) {
        this.rolDetalladoList = rolDetalladoList;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rpgIdrolpagos != null ? rpgIdrolpagos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolpagos)) {
            return false;
        }
        Rolpagos other = (Rolpagos) object;
        if ((this.rpgIdrolpagos == null && other.rpgIdrolpagos != null) || (this.rpgIdrolpagos != null && !this.rpgIdrolpagos.equals(other.rpgIdrolpagos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Rolpagos[ rpgIdrolpagos=" + rpgIdrolpagos + " ]";
    }
    
}
