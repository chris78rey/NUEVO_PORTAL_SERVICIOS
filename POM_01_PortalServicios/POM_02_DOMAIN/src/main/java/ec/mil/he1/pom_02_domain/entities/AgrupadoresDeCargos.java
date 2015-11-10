/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "AGRUPADORES_DE_CARGOS")
@NamedQueries({
    @NamedQuery(name = "AgrupadoresDeCargos.findAll", query = "SELECT a FROM AgrupadoresDeCargos a")})
public class AgrupadoresDeCargos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "OBSERVACION")
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "TIPO")
    private String tipo;
    @OneToMany(mappedBy = "agrupadoresDeCargos", fetch = FetchType.LAZY)
    private List<DetalleAgrupadoresDeCargos> detalleAgrupadoresDeCargosList;
    @OneToMany(mappedBy = "agrupadoresDeCargos", fetch = FetchType.LAZY)
    private List<CamasHospitalizacion> camasHospitalizacionList;
    @OneToMany(mappedBy = "agrupadoresDeCargos", fetch = FetchType.LAZY)
    private List<AtencionesPromocionesCargos> atencionesPromocionesCargosList;
    @OneToMany(mappedBy = "agrupadoresDeCargos", fetch = FetchType.LAZY)
    private List<ProcedimientosHospitalarios> procedimientosHospitalariosList;
    @OneToMany(mappedBy = "agrupadoresDeCargos", fetch = FetchType.LAZY)
    private List<TiposPromociones> tiposPromocionesList;

    public AgrupadoresDeCargos() {
    }

    public AgrupadoresDeCargos(String codigo) {
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

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<DetalleAgrupadoresDeCargos> getDetalleAgrupadoresDeCargosList() {
        return detalleAgrupadoresDeCargosList;
    }

    public void setDetalleAgrupadoresDeCargosList(List<DetalleAgrupadoresDeCargos> detalleAgrupadoresDeCargosList) {
        this.detalleAgrupadoresDeCargosList = detalleAgrupadoresDeCargosList;
    }

    public List<CamasHospitalizacion> getCamasHospitalizacionList() {
        return camasHospitalizacionList;
    }

    public void setCamasHospitalizacionList(List<CamasHospitalizacion> camasHospitalizacionList) {
        this.camasHospitalizacionList = camasHospitalizacionList;
    }

    public List<AtencionesPromocionesCargos> getAtencionesPromocionesCargosList() {
        return atencionesPromocionesCargosList;
    }

    public void setAtencionesPromocionesCargosList(List<AtencionesPromocionesCargos> atencionesPromocionesCargosList) {
        this.atencionesPromocionesCargosList = atencionesPromocionesCargosList;
    }

    public List<ProcedimientosHospitalarios> getProcedimientosHospitalariosList() {
        return procedimientosHospitalariosList;
    }

    public void setProcedimientosHospitalariosList(List<ProcedimientosHospitalarios> procedimientosHospitalariosList) {
        this.procedimientosHospitalariosList = procedimientosHospitalariosList;
    }

    public List<TiposPromociones> getTiposPromocionesList() {
        return tiposPromocionesList;
    }

    public void setTiposPromocionesList(List<TiposPromociones> tiposPromocionesList) {
        this.tiposPromocionesList = tiposPromocionesList;
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
        if (!(object instanceof AgrupadoresDeCargos)) {
            return false;
        }
        AgrupadoresDeCargos other = (AgrupadoresDeCargos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AgrupadoresDeCargos[ codigo=" + codigo + " ]";
    }
    
}
