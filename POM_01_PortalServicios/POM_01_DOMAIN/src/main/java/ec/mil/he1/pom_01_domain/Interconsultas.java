/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "INTERCONSULTAS")
@NamedQueries({
    @NamedQuery(name = "Interconsultas.findAll", query = "SELECT i FROM Interconsultas i")})
public class Interconsultas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InterconsultasPK interconsultasPK;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "ESP_CODIGO")
    private String espCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "RESULTADO")
    private String resultado;
    @Column(name = "FECHA_RESULTADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResultado;
    @Column(name = "PRS_CODIGO_REALIZADO")
    private String prsCodigoRealizado;
    @Column(name = "PRCHSP_CODIGO")
    private String prchspCodigo;
    @Column(name = "HJAEVL_NUMERO_CMPINT")
    private BigInteger hjaevlNumeroCmpint;
    @Column(name = "POOL")
    private Integer pool;
    @Column(name = "ELECTRO")
    private Character electro;
    @Column(name = "FECHA_INTERCONSULTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInterconsulta;
    @Column(name = "CONDICION_CLINICA")
    private String condicionClinica;
    @Column(name = "CIRCUNSTANCIA_CALIFICANTE")
    private String circunstanciaCalificante;
    @Column(name = "MINUTOS")
    private Short minutos;

    public Interconsultas() {
    }

    public Interconsultas(InterconsultasPK interconsultasPK) {
        this.interconsultasPK = interconsultasPK;
    }

    public Interconsultas(int pcnNumeroHc, int numero) {
        this.interconsultasPK = new InterconsultasPK(pcnNumeroHc, numero);
    }

    public InterconsultasPK getInterconsultasPK() {
        return interconsultasPK;
    }

    public void setInterconsultasPK(InterconsultasPK interconsultasPK) {
        this.interconsultasPK = interconsultasPK;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public String getEspCodigo() {
        return espCodigo;
    }

    public void setEspCodigo(String espCodigo) {
        this.espCodigo = espCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Date getFechaResultado() {
        return fechaResultado;
    }

    public void setFechaResultado(Date fechaResultado) {
        this.fechaResultado = fechaResultado;
    }

    public String getPrsCodigoRealizado() {
        return prsCodigoRealizado;
    }

    public void setPrsCodigoRealizado(String prsCodigoRealizado) {
        this.prsCodigoRealizado = prsCodigoRealizado;
    }

    public String getPrchspCodigo() {
        return prchspCodigo;
    }

    public void setPrchspCodigo(String prchspCodigo) {
        this.prchspCodigo = prchspCodigo;
    }

    public BigInteger getHjaevlNumeroCmpint() {
        return hjaevlNumeroCmpint;
    }

    public void setHjaevlNumeroCmpint(BigInteger hjaevlNumeroCmpint) {
        this.hjaevlNumeroCmpint = hjaevlNumeroCmpint;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Character getElectro() {
        return electro;
    }

    public void setElectro(Character electro) {
        this.electro = electro;
    }

    public Date getFechaInterconsulta() {
        return fechaInterconsulta;
    }

    public void setFechaInterconsulta(Date fechaInterconsulta) {
        this.fechaInterconsulta = fechaInterconsulta;
    }

    public String getCondicionClinica() {
        return condicionClinica;
    }

    public void setCondicionClinica(String condicionClinica) {
        this.condicionClinica = condicionClinica;
    }

    public String getCircunstanciaCalificante() {
        return circunstanciaCalificante;
    }

    public void setCircunstanciaCalificante(String circunstanciaCalificante) {
        this.circunstanciaCalificante = circunstanciaCalificante;
    }

    public Short getMinutos() {
        return minutos;
    }

    public void setMinutos(Short minutos) {
        this.minutos = minutos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (interconsultasPK != null ? interconsultasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Interconsultas)) {
            return false;
        }
        Interconsultas other = (Interconsultas) object;
        if ((this.interconsultasPK == null && other.interconsultasPK != null) || (this.interconsultasPK != null && !this.interconsultasPK.equals(other.interconsultasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Interconsultas[ interconsultasPK=" + interconsultasPK + " ]";
    }
    
}
