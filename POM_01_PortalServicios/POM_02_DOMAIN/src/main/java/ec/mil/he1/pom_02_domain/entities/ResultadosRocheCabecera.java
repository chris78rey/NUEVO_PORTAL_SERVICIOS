/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "RESULTADOS_ROCHE_CABECERA")
@NamedQueries({
    @NamedQuery(name = "ResultadosRocheCabecera.findAll", query = "SELECT r FROM ResultadosRocheCabecera r")})
public class ResultadosRocheCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResultadosRocheCabeceraPK resultadosRocheCabeceraPK;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resultadosRocheCabecera", fetch = FetchType.LAZY)
    private List<ResultadosRocheDetalle> resultadosRocheDetalleList;

    public ResultadosRocheCabecera() {
    }

    public ResultadosRocheCabecera(ResultadosRocheCabeceraPK resultadosRocheCabeceraPK) {
        this.resultadosRocheCabeceraPK = resultadosRocheCabeceraPK;
    }

    public ResultadosRocheCabecera(int id, int solicitud) {
        this.resultadosRocheCabeceraPK = new ResultadosRocheCabeceraPK(id, solicitud);
    }

    public ResultadosRocheCabeceraPK getResultadosRocheCabeceraPK() {
        return resultadosRocheCabeceraPK;
    }

    public void setResultadosRocheCabeceraPK(ResultadosRocheCabeceraPK resultadosRocheCabeceraPK) {
        this.resultadosRocheCabeceraPK = resultadosRocheCabeceraPK;
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

    public List<ResultadosRocheDetalle> getResultadosRocheDetalleList() {
        return resultadosRocheDetalleList;
    }

    public void setResultadosRocheDetalleList(List<ResultadosRocheDetalle> resultadosRocheDetalleList) {
        this.resultadosRocheDetalleList = resultadosRocheDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resultadosRocheCabeceraPK != null ? resultadosRocheCabeceraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultadosRocheCabecera)) {
            return false;
        }
        ResultadosRocheCabecera other = (ResultadosRocheCabecera) object;
        if ((this.resultadosRocheCabeceraPK == null && other.resultadosRocheCabeceraPK != null) || (this.resultadosRocheCabeceraPK != null && !this.resultadosRocheCabeceraPK.equals(other.resultadosRocheCabeceraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ResultadosRocheCabecera[ resultadosRocheCabeceraPK=" + resultadosRocheCabeceraPK + " ]";
    }
    
}
