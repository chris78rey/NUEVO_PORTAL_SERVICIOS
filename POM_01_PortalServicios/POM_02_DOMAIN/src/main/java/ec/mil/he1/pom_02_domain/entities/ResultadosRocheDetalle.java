/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "RESULTADOS_ROCHE_DETALLE")
@NamedQueries({
    @NamedQuery(name = "ResultadosRocheDetalle.findAll", query = "SELECT r FROM ResultadosRocheDetalle r")})
public class ResultadosRocheDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResultadosRocheDetallePK resultadosRocheDetallePK;
    @Column(name = "TPO_DTR")
    private String tpoDtr;
    @Column(name = "RESULTADO")
    private String resultado;
    @Column(name = "RESULTADO_TEXTO")
    private String resultadoTexto;
    @Column(name = "UNIDAD")
    private String unidad;
    @Column(name = "RANGO_INFERIOR")
    private String rangoInferior;
    @Column(name = "RANGO_SUPERIOR")
    private String rangoSuperior;
    @Column(name = "RANGO_TEXTO")
    private String rangoTexto;
    @Column(name = "ID_RANGO")
    private BigInteger idRango;
    @Column(name = "USUARIO_VALIDA")
    private String usuarioValida;
    @JoinColumns({
        @JoinColumn(name = "ID_CAB", referencedColumnName = "ID", insertable = false, updatable = false),
        @JoinColumn(name = "SLC_NUMERO", referencedColumnName = "SOLICITUD", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ResultadosRocheCabecera resultadosRocheCabecera;

    public ResultadosRocheDetalle() {
    }

    public ResultadosRocheDetalle(ResultadosRocheDetallePK resultadosRocheDetallePK) {
        this.resultadosRocheDetallePK = resultadosRocheDetallePK;
    }

    public ResultadosRocheDetalle(BigInteger idCab, BigInteger slcNumero, int exmNumero, int vrbCmpCodigo) {
        this.resultadosRocheDetallePK = new ResultadosRocheDetallePK(idCab, slcNumero, exmNumero, vrbCmpCodigo);
    }

    public ResultadosRocheDetallePK getResultadosRocheDetallePK() {
        return resultadosRocheDetallePK;
    }

    public void setResultadosRocheDetallePK(ResultadosRocheDetallePK resultadosRocheDetallePK) {
        this.resultadosRocheDetallePK = resultadosRocheDetallePK;
    }

    public String getTpoDtr() {
        return tpoDtr;
    }

    public void setTpoDtr(String tpoDtr) {
        this.tpoDtr = tpoDtr;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultadoTexto() {
        return resultadoTexto;
    }

    public void setResultadoTexto(String resultadoTexto) {
        this.resultadoTexto = resultadoTexto;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getRangoInferior() {
        return rangoInferior;
    }

    public void setRangoInferior(String rangoInferior) {
        this.rangoInferior = rangoInferior;
    }

    public String getRangoSuperior() {
        return rangoSuperior;
    }

    public void setRangoSuperior(String rangoSuperior) {
        this.rangoSuperior = rangoSuperior;
    }

    public String getRangoTexto() {
        return rangoTexto;
    }

    public void setRangoTexto(String rangoTexto) {
        this.rangoTexto = rangoTexto;
    }

    public BigInteger getIdRango() {
        return idRango;
    }

    public void setIdRango(BigInteger idRango) {
        this.idRango = idRango;
    }

    public String getUsuarioValida() {
        return usuarioValida;
    }

    public void setUsuarioValida(String usuarioValida) {
        this.usuarioValida = usuarioValida;
    }

    public ResultadosRocheCabecera getResultadosRocheCabecera() {
        return resultadosRocheCabecera;
    }

    public void setResultadosRocheCabecera(ResultadosRocheCabecera resultadosRocheCabecera) {
        this.resultadosRocheCabecera = resultadosRocheCabecera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resultadosRocheDetallePK != null ? resultadosRocheDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultadosRocheDetalle)) {
            return false;
        }
        ResultadosRocheDetalle other = (ResultadosRocheDetalle) object;
        if ((this.resultadosRocheDetallePK == null && other.resultadosRocheDetallePK != null) || (this.resultadosRocheDetallePK != null && !this.resultadosRocheDetallePK.equals(other.resultadosRocheDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ResultadosRocheDetalle[ resultadosRocheDetallePK=" + resultadosRocheDetallePK + " ]";
    }
    
}
