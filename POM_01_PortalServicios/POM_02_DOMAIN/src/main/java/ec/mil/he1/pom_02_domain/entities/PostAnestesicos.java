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
@Table(name = "POST_ANESTESICOS")
@NamedQueries({
    @NamedQuery(name = "PostAnestesicos.findAll", query = "SELECT p FROM PostAnestesicos p")})
public class PostAnestesicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PostAnestesicosPK postAnestesicosPK;
    @Column(name = "PRSMDC_CODIGO")
    private String prsmdcCodigo;
    @Column(name = "GENERAL")
    private Character general;
    @Column(name = "CONDUCTIVA")
    private Character conductiva;
    @Column(name = "LOCAL")
    private Character local;
    @Column(name = "INDUCCION")
    private String induccion;
    @Column(name = "MANTENIMIENTO")
    private String mantenimiento;
    @Column(name = "CONSCIENTE")
    private Character consciente;
    @Column(name = "SEMICONSCIENTE")
    private Character semiconsciente;
    @Column(name = "FECHA_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Column(name = "FECHA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrada;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "INCONCIENTE")
    private Character inconciente;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "COMPLICACIONES")
    private String complicaciones;
    @Column(name = "MUERTE_NATURAL")
    private Character muerteNatural;
    @Column(name = "PARO_CARDIACO")
    private Character paroCardiaco;
    @Column(name = "EN_CIRUGIA")
    private Character enCirugia;
    @Column(name = "EN_RECUPERACION")
    private Character enRecuperacion;
    @Column(name = "CAUSA_QUIRURGICA")
    private Character causaQuirurgica;
    @Column(name = "ANESTESIA")
    private Character anestesia;
    @Column(name = "PREEXISTENTE")
    private Character preexistente;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumns({
        @JoinColumn(name = "RGSOPR_PRTOPRSLC_PCN_NUMERO_HC", referencedColumnName = "PRTOPRSLC_PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "RGSOPR_PRTOPRSLC_NUMERO", referencedColumnName = "PRTOPRSLC_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "RGSOPR_PRS_CODIGO", referencedColumnName = "PRS_CODIGO")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RegistrosOperatorios registrosOperatorios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postAnestesicos", fetch = FetchType.LAZY)
    private List<PostAnesMedicamentos> postAnesMedicamentosList;

    public PostAnestesicos() {
    }

    public PostAnestesicos(PostAnestesicosPK postAnestesicosPK) {
        this.postAnestesicosPK = postAnestesicosPK;
    }

    public PostAnestesicos(int rgsoprPrtoprslcNumero, int rgsoprPrtoprslcPcnNumeroHc) {
        this.postAnestesicosPK = new PostAnestesicosPK(rgsoprPrtoprslcNumero, rgsoprPrtoprslcPcnNumeroHc);
    }

    public PostAnestesicosPK getPostAnestesicosPK() {
        return postAnestesicosPK;
    }

    public void setPostAnestesicosPK(PostAnestesicosPK postAnestesicosPK) {
        this.postAnestesicosPK = postAnestesicosPK;
    }

    public String getPrsmdcCodigo() {
        return prsmdcCodigo;
    }

    public void setPrsmdcCodigo(String prsmdcCodigo) {
        this.prsmdcCodigo = prsmdcCodigo;
    }

    public Character getGeneral() {
        return general;
    }

    public void setGeneral(Character general) {
        this.general = general;
    }

    public Character getConductiva() {
        return conductiva;
    }

    public void setConductiva(Character conductiva) {
        this.conductiva = conductiva;
    }

    public Character getLocal() {
        return local;
    }

    public void setLocal(Character local) {
        this.local = local;
    }

    public String getInduccion() {
        return induccion;
    }

    public void setInduccion(String induccion) {
        this.induccion = induccion;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public Character getConsciente() {
        return consciente;
    }

    public void setConsciente(Character consciente) {
        this.consciente = consciente;
    }

    public Character getSemiconsciente() {
        return semiconsciente;
    }

    public void setSemiconsciente(Character semiconsciente) {
        this.semiconsciente = semiconsciente;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getInconciente() {
        return inconciente;
    }

    public void setInconciente(Character inconciente) {
        this.inconciente = inconciente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getComplicaciones() {
        return complicaciones;
    }

    public void setComplicaciones(String complicaciones) {
        this.complicaciones = complicaciones;
    }

    public Character getMuerteNatural() {
        return muerteNatural;
    }

    public void setMuerteNatural(Character muerteNatural) {
        this.muerteNatural = muerteNatural;
    }

    public Character getParoCardiaco() {
        return paroCardiaco;
    }

    public void setParoCardiaco(Character paroCardiaco) {
        this.paroCardiaco = paroCardiaco;
    }

    public Character getEnCirugia() {
        return enCirugia;
    }

    public void setEnCirugia(Character enCirugia) {
        this.enCirugia = enCirugia;
    }

    public Character getEnRecuperacion() {
        return enRecuperacion;
    }

    public void setEnRecuperacion(Character enRecuperacion) {
        this.enRecuperacion = enRecuperacion;
    }

    public Character getCausaQuirurgica() {
        return causaQuirurgica;
    }

    public void setCausaQuirurgica(Character causaQuirurgica) {
        this.causaQuirurgica = causaQuirurgica;
    }

    public Character getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Character anestesia) {
        this.anestesia = anestesia;
    }

    public Character getPreexistente() {
        return preexistente;
    }

    public void setPreexistente(Character preexistente) {
        this.preexistente = preexistente;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public RegistrosOperatorios getRegistrosOperatorios() {
        return registrosOperatorios;
    }

    public void setRegistrosOperatorios(RegistrosOperatorios registrosOperatorios) {
        this.registrosOperatorios = registrosOperatorios;
    }

    public List<PostAnesMedicamentos> getPostAnesMedicamentosList() {
        return postAnesMedicamentosList;
    }

    public void setPostAnesMedicamentosList(List<PostAnesMedicamentos> postAnesMedicamentosList) {
        this.postAnesMedicamentosList = postAnesMedicamentosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postAnestesicosPK != null ? postAnestesicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostAnestesicos)) {
            return false;
        }
        PostAnestesicos other = (PostAnestesicos) object;
        if ((this.postAnestesicosPK == null && other.postAnestesicosPK != null) || (this.postAnestesicosPK != null && !this.postAnestesicosPK.equals(other.postAnestesicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PostAnestesicos[ postAnestesicosPK=" + postAnestesicosPK + " ]";
    }
    
}
