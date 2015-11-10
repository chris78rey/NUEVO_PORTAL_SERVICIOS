/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "REGISTROS_OPERATORIOS")
@NamedQueries({
    @NamedQuery(name = "RegistrosOperatorios.findAll", query = "SELECT r FROM RegistrosOperatorios r")})
public class RegistrosOperatorios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegistrosOperatoriosPK registrosOperatoriosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "TALLA")
    private Short talla;
    @Column(name = "HORA_CIRUGIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaCirugia;
    @Column(name = "DURACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date duracion;
    @Column(name = "CONDICION_CLINICA")
    private String condicionClinica;
    @Column(name = "CIRCUNSTANCIA_CALIFICANTE")
    private String circunstanciaCalificante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrosOperatorios", fetch = FetchType.LAZY)
    private List<PostAnestesicos> postAnestesicosList;
    @JoinColumns({
        @JoinColumn(name = "PRTOPRSLC_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "PRTOPRSLC_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PartesOperatoriosSolicitud partesOperatoriosSolicitud;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrosOperatorios", fetch = FetchType.LAZY)
    private List<PreAnestesicos> preAnestesicosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrosOperatorios", fetch = FetchType.LAZY)
    private List<RegistrosTransAnestesicos> registrosTransAnestesicosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "registrosOperatorios", fetch = FetchType.LAZY)
    private RecuperacionPostAnestesica recuperacionPostAnestesica;

    public RegistrosOperatorios() {
    }

    public RegistrosOperatorios(RegistrosOperatoriosPK registrosOperatoriosPK) {
        this.registrosOperatoriosPK = registrosOperatoriosPK;
    }

    public RegistrosOperatorios(int prtoprslcNumero, int prtoprslcPcnNumeroHc, String prsCodigo) {
        this.registrosOperatoriosPK = new RegistrosOperatoriosPK(prtoprslcNumero, prtoprslcPcnNumeroHc, prsCodigo);
    }

    public RegistrosOperatoriosPK getRegistrosOperatoriosPK() {
        return registrosOperatoriosPK;
    }

    public void setRegistrosOperatoriosPK(RegistrosOperatoriosPK registrosOperatoriosPK) {
        this.registrosOperatoriosPK = registrosOperatoriosPK;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Short getTalla() {
        return talla;
    }

    public void setTalla(Short talla) {
        this.talla = talla;
    }

    public Date getHoraCirugia() {
        return horaCirugia;
    }

    public void setHoraCirugia(Date horaCirugia) {
        this.horaCirugia = horaCirugia;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
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

    public List<PostAnestesicos> getPostAnestesicosList() {
        return postAnestesicosList;
    }

    public void setPostAnestesicosList(List<PostAnestesicos> postAnestesicosList) {
        this.postAnestesicosList = postAnestesicosList;
    }

    public PartesOperatoriosSolicitud getPartesOperatoriosSolicitud() {
        return partesOperatoriosSolicitud;
    }

    public void setPartesOperatoriosSolicitud(PartesOperatoriosSolicitud partesOperatoriosSolicitud) {
        this.partesOperatoriosSolicitud = partesOperatoriosSolicitud;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<PreAnestesicos> getPreAnestesicosList() {
        return preAnestesicosList;
    }

    public void setPreAnestesicosList(List<PreAnestesicos> preAnestesicosList) {
        this.preAnestesicosList = preAnestesicosList;
    }

    public List<RegistrosTransAnestesicos> getRegistrosTransAnestesicosList() {
        return registrosTransAnestesicosList;
    }

    public void setRegistrosTransAnestesicosList(List<RegistrosTransAnestesicos> registrosTransAnestesicosList) {
        this.registrosTransAnestesicosList = registrosTransAnestesicosList;
    }

    public RecuperacionPostAnestesica getRecuperacionPostAnestesica() {
        return recuperacionPostAnestesica;
    }

    public void setRecuperacionPostAnestesica(RecuperacionPostAnestesica recuperacionPostAnestesica) {
        this.recuperacionPostAnestesica = recuperacionPostAnestesica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registrosOperatoriosPK != null ? registrosOperatoriosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosOperatorios)) {
            return false;
        }
        RegistrosOperatorios other = (RegistrosOperatorios) object;
        if ((this.registrosOperatoriosPK == null && other.registrosOperatoriosPK != null) || (this.registrosOperatoriosPK != null && !this.registrosOperatoriosPK.equals(other.registrosOperatoriosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RegistrosOperatorios[ registrosOperatoriosPK=" + registrosOperatoriosPK + " ]";
    }
    
}
