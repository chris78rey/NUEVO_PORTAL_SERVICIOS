/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "RESULTADOS_ROCHE_CABMIC")
@NamedQueries({
    @NamedQuery(name = "ResultadosRocheCabmic.findAll", query = "SELECT r FROM ResultadosRocheCabmic r")})
public class ResultadosRocheCabmic implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResultadosRocheCabmicPK resultadosRocheCabmicPK;
    @Column(name = "HC")
    private Integer hc;
    @Column(name = "FECHA_GENERACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaGeneracion;
    @Column(name = "FECHA_LECTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLectura;
    @Column(name = "ARCHIVO")
    private String archivo;
    @Column(name = "NOMBRE_ARCHIVO")
    private String nombreArchivo;
    @Column(name = "SECUENCIA")
    private Integer secuencia;
    @Column(name = "LEIDO")
    private String leido;

    public ResultadosRocheCabmic() {
    }

    public ResultadosRocheCabmic(ResultadosRocheCabmicPK resultadosRocheCabmicPK) {
        this.resultadosRocheCabmicPK = resultadosRocheCabmicPK;
    }

    public ResultadosRocheCabmic(int id, int solicitud) {
        this.resultadosRocheCabmicPK = new ResultadosRocheCabmicPK(id, solicitud);
    }

    public ResultadosRocheCabmicPK getResultadosRocheCabmicPK() {
        return resultadosRocheCabmicPK;
    }

    public void setResultadosRocheCabmicPK(ResultadosRocheCabmicPK resultadosRocheCabmicPK) {
        this.resultadosRocheCabmicPK = resultadosRocheCabmicPK;
    }

    public Integer getHc() {
        return hc;
    }

    public void setHc(Integer hc) {
        this.hc = hc;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Date getFechaLectura() {
        return fechaLectura;
    }

    public void setFechaLectura(Date fechaLectura) {
        this.fechaLectura = fechaLectura;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public String getLeido() {
        return leido;
    }

    public void setLeido(String leido) {
        this.leido = leido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resultadosRocheCabmicPK != null ? resultadosRocheCabmicPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultadosRocheCabmic)) {
            return false;
        }
        ResultadosRocheCabmic other = (ResultadosRocheCabmic) object;
        if ((this.resultadosRocheCabmicPK == null && other.resultadosRocheCabmicPK != null) || (this.resultadosRocheCabmicPK != null && !this.resultadosRocheCabmicPK.equals(other.resultadosRocheCabmicPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ResultadosRocheCabmic[ resultadosRocheCabmicPK=" + resultadosRocheCabmicPK + " ]";
    }
    
}
