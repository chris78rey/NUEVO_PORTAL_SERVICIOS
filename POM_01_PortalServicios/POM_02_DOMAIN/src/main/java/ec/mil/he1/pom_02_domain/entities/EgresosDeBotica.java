/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "EGRESOS_DE_BOTICA")
@NamedQueries({
    @NamedQuery(name = "EgresosDeBotica.findAll", query = "SELECT e FROM EgresosDeBotica e")})
public class EgresosDeBotica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EgresosDeBoticaPK egresosDeBoticaPK;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "TIPO_CEDULA")
    private String tipoCedula;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONCEPTO")
    private String concepto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CAMA")
    private String cama;
    @Column(name = "CLASE")
    private String clase;
    @Column(name = "DESCARGOS")
    private String descargos;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "CAJA")
    private String caja;
    @Column(name = "FACTURA_HASTA")
    private BigInteger facturaHasta;
    @Column(name = "FACTURA_DESDE")
    private BigInteger facturaDesde;
    @Column(name = "VALOR_ELABORACION_MEDICAMENTOS")
    private BigDecimal valorElaboracionMedicamentos;
    @OneToMany(mappedBy = "egresosDeBotica", fetch = FetchType.LAZY)
    private List<DescargosDeBotica> descargosDeBoticaList;
    @OneToMany(mappedBy = "egresosDeBotica", fetch = FetchType.LAZY)
    private List<Transacciones> transaccionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "egresosDeBotica", fetch = FetchType.LAZY)
    private List<DetallesTemporales> detallesTemporalesList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "MDCRCT_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MedicosReceta medicosReceta;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PCNTMP_PCNTMP_ID", referencedColumnName = "PCNTMP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PacientesTemporales pacientesTemporales;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_RECIBIDO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;

    public EgresosDeBotica() {
    }

    public EgresosDeBotica(EgresosDeBoticaPK egresosDeBoticaPK) {
        this.egresosDeBoticaPK = egresosDeBoticaPK;
    }

    public EgresosDeBotica(String tipo, int numero) {
        this.egresosDeBoticaPK = new EgresosDeBoticaPK(tipo, numero);
    }

    public EgresosDeBoticaPK getEgresosDeBoticaPK() {
        return egresosDeBoticaPK;
    }

    public void setEgresosDeBoticaPK(EgresosDeBoticaPK egresosDeBoticaPK) {
        this.egresosDeBoticaPK = egresosDeBoticaPK;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoCedula() {
        return tipoCedula;
    }

    public void setTipoCedula(String tipoCedula) {
        this.tipoCedula = tipoCedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDescargos() {
        return descargos;
    }

    public void setDescargos(String descargos) {
        this.descargos = descargos;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public BigInteger getFacturaHasta() {
        return facturaHasta;
    }

    public void setFacturaHasta(BigInteger facturaHasta) {
        this.facturaHasta = facturaHasta;
    }

    public BigInteger getFacturaDesde() {
        return facturaDesde;
    }

    public void setFacturaDesde(BigInteger facturaDesde) {
        this.facturaDesde = facturaDesde;
    }

    public BigDecimal getValorElaboracionMedicamentos() {
        return valorElaboracionMedicamentos;
    }

    public void setValorElaboracionMedicamentos(BigDecimal valorElaboracionMedicamentos) {
        this.valorElaboracionMedicamentos = valorElaboracionMedicamentos;
    }

    public List<DescargosDeBotica> getDescargosDeBoticaList() {
        return descargosDeBoticaList;
    }

    public void setDescargosDeBoticaList(List<DescargosDeBotica> descargosDeBoticaList) {
        this.descargosDeBoticaList = descargosDeBoticaList;
    }

    public List<Transacciones> getTransaccionesList() {
        return transaccionesList;
    }

    public void setTransaccionesList(List<Transacciones> transaccionesList) {
        this.transaccionesList = transaccionesList;
    }

    public List<DetallesTemporales> getDetallesTemporalesList() {
        return detallesTemporalesList;
    }

    public void setDetallesTemporalesList(List<DetallesTemporales> detallesTemporalesList) {
        this.detallesTemporalesList = detallesTemporalesList;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public MedicosReceta getMedicosReceta() {
        return medicosReceta;
    }

    public void setMedicosReceta(MedicosReceta medicosReceta) {
        this.medicosReceta = medicosReceta;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public PacientesTemporales getPacientesTemporales() {
        return pacientesTemporales;
    }

    public void setPacientesTemporales(PacientesTemporales pacientesTemporales) {
        this.pacientesTemporales = pacientesTemporales;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (egresosDeBoticaPK != null ? egresosDeBoticaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresosDeBotica)) {
            return false;
        }
        EgresosDeBotica other = (EgresosDeBotica) object;
        if ((this.egresosDeBoticaPK == null && other.egresosDeBoticaPK != null) || (this.egresosDeBoticaPK != null && !this.egresosDeBoticaPK.equals(other.egresosDeBoticaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EgresosDeBotica[ egresosDeBoticaPK=" + egresosDeBoticaPK + " ]";
    }
    
}
