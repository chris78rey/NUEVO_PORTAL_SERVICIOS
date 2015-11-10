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
@Table(name = "COPAGOS")
@NamedQueries({
    @NamedQuery(name = "Copagos.findAll", query = "SELECT c FROM Copagos c")})
public class Copagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTO_MAXIMO")
    private BigDecimal montoMaximo;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "PAGA_TURNO")
    private Character pagaTurno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "copagos", fetch = FetchType.LAZY)
    private List<DepartamentosCopago> departamentosCopagoList;
    @JoinColumns({
        @JoinColumn(name = "CRG_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "CRG_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Cargos cargos;
    @JoinColumn(name = "MDOPGO_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModoDePago modoDePago;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRM_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Promociones promociones;
    @OneToMany(mappedBy = "copagos", fetch = FetchType.LAZY)
    private List<CopagosPacientes> copagosPacientesList;

    public Copagos() {
    }

    public Copagos(String codigo) {
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

    public BigDecimal getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(BigDecimal montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Character getPagaTurno() {
        return pagaTurno;
    }

    public void setPagaTurno(Character pagaTurno) {
        this.pagaTurno = pagaTurno;
    }

    public List<DepartamentosCopago> getDepartamentosCopagoList() {
        return departamentosCopagoList;
    }

    public void setDepartamentosCopagoList(List<DepartamentosCopago> departamentosCopagoList) {
        this.departamentosCopagoList = departamentosCopagoList;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public ModoDePago getModoDePago() {
        return modoDePago;
    }

    public void setModoDePago(ModoDePago modoDePago) {
        this.modoDePago = modoDePago;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Promociones getPromociones() {
        return promociones;
    }

    public void setPromociones(Promociones promociones) {
        this.promociones = promociones;
    }

    public List<CopagosPacientes> getCopagosPacientesList() {
        return copagosPacientesList;
    }

    public void setCopagosPacientesList(List<CopagosPacientes> copagosPacientesList) {
        this.copagosPacientesList = copagosPacientesList;
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
        if (!(object instanceof Copagos)) {
            return false;
        }
        Copagos other = (Copagos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Copagos[ codigo=" + codigo + " ]";
    }
    
}
