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
@Table(name = "PRE_ANESTESICOS")
@NamedQueries({
    @NamedQuery(name = "PreAnestesicos.findAll", query = "SELECT p FROM PreAnestesicos p")})
public class PreAnestesicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PreAnestesicosPK preAnestesicosPK;
    @Column(name = "RIESGO")
    private Short riesgo;
    @Column(name = "INFORMACION_ESPECIAL")
    private String informacionEspecial;
    @Column(name = "CABEZA")
    private Character cabeza;
    @Column(name = "ORAGANOS")
    private Character oraganos;
    @Column(name = "ENDOSCOPIAS")
    private Character endoscopias;
    @Column(name = "INTRADURAL")
    private Character intradural;
    @Column(name = "EXTRADURAL")
    private Character extradural;
    @Column(name = "CUELLO")
    private Character cuello;
    @Column(name = "EXTRATORACICA")
    private Character extratoracica;
    @Column(name = "INTRATORACICA")
    private Character intratoracica;
    @Column(name = "ABDOMEN")
    private Character abdomen;
    @Column(name = "EXTREMIDADES")
    private Character extremidades;
    @Column(name = "OBSTETRICAS")
    private Character obstetricas;
    @Column(name = "PERINEALES")
    private Character perineales;
    @Column(name = "URORANALISIS")
    private String uroranalisis;
    @Column(name = "HEMATOLOGICO")
    private String hematologico;
    @Column(name = "QUIMICA_SANGUINEA")
    private String quimicaSanguinea;
    @Column(name = "ASMA")
    private Character asma;
    @Column(name = "ATELECTACIAS")
    private Character atelectacias;
    @Column(name = "CAPACIDAD_VITAL")
    private Short capacidadVital;
    @Column(name = "NEUMOTORAX")
    private Character neumotorax;
    @Column(name = "BRONQUIECTASIAS")
    private Character bronquiectasias;
    @Column(name = "OTROS_RESPITATORIO")
    private String otrosRespitatorio;
    @Column(name = "ARRITMIAS")
    private Character arritmias;
    @Column(name = "HIPERTENSION")
    private Character hipertension;
    @Column(name = "ENF_VALVULARES")
    private Character enfValvulares;
    @Column(name = "ENF_CONGENITAS")
    private Character enfCongenitas;
    @Column(name = "INFARTOS")
    private Character infartos;
    @Column(name = "INSUFICIENCIA_CARDIACA")
    private Character insuficienciaCardiaca;
    @Column(name = "PULSO")
    private String pulso;
    @Column(name = "ECG")
    private Character ecg;
    @Column(name = "CONVULSIONES")
    private Character convulsiones;
    @Column(name = "TRAUMATISMOS")
    private Character traumatismos;
    @Column(name = "PERDIDA_DE_CONCIENCIA")
    private Character perdidaDeConciencia;
    @Column(name = "CEFALEA")
    private Character cefalea;
    @Column(name = "OTROS_SNC")
    private String otrosSnc;
    @Column(name = "ALERGIAS")
    private String alergias;
    @Column(name = "HABITOS")
    private String habitos;
    @Column(name = "HIPERTIROIDISMO")
    private Character hipertiroidismo;
    @Column(name = "DIABETES")
    private Character diabetes;
    @Column(name = "INFUF_HEP_REN")
    private Character infufHepRen;
    @Column(name = "DESEQUILIBRIO")
    private Character desequilibrio;
    @Column(name = "TOXEMIAS")
    private Character toxemias;
    @Column(name = "TRAUMATISMOS_MULTI")
    private Character traumatismosMulti;
    @Column(name = "SHOCK")
    private Character shock;
    @Column(name = "OTROS_SISTEMAS")
    private String otrosSistemas;
    @Column(name = "ANESTESIAS_ANTERIORES")
    private String anestesiasAnteriores;
    @Column(name = "TERAPIA_ANTERIOR")
    private String terapiaAnterior;
    @Column(name = "ESTEROIDES")
    private String esteroides;
    @Column(name = "TRANQUILIZANTES")
    private String tranquilizantes;
    @Column(name = "HIPOTENSIONES")
    private String hipotensiones;
    @Column(name = "DIGITALICOS")
    private String digitalicos;
    @Column(name = "OTROS_TERAPIA")
    private String otrosTerapia;
    @Column(name = "ULTIMA_INGESTION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaIngestion;
    @Column(name = "HORA_ACCIDENTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaAccidente;
    @Column(name = "INSUFICUENTE")
    private Character insuficuente;
    @Column(name = "BUENO")
    private Character bueno;
    @Column(name = "DEPRIMIDO")
    private Character deprimido;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "NAUSEAS")
    private String nauseas;
    @Column(name = "TRAUMATICA")
    private String traumatica;
    @Column(name = "PARESIAS")
    private String paresias;
    @Column(name = "RESPITATORIA")
    private String respitatoria;
    @Column(name = "AP_CARDIO")
    private String apCardio;
    @Column(name = "SISTENA_NERVIOSO")
    private String sistenaNervioso;
    @Column(name = "UROLOGICAS")
    private String urologicas;
    @Column(name = "DIURESIS")
    private String diuresis;
    @Column(name = "SANGRADOS")
    private String sangrados;
    @Column(name = "DOLOR")
    private String dolor;
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
    @Column(name = "ENFISEMA")
    private Character enfisema;
    @Column(name = "OTROS_CIRCULATORIO")
    private String otrosCirculatorio;
    @Column(name = "HIPOTIROIDISMO")
    private Character hipotiroidismo;
    @Column(name = "COMPLICACIONES")
    private String complicaciones;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumns({
        @JoinColumn(name = "RGSOPR_PRTOPRSLC_PCN_NUMERO_HC", referencedColumnName = "PRTOPRSLC_PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "RGSOPR_PRTOPRSLC_NUMERO", referencedColumnName = "PRTOPRSLC_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "RGSOPR_PRS_CODIGO", referencedColumnName = "PRS_CODIGO")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RegistrosOperatorios registrosOperatorios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preAnestesicos", fetch = FetchType.LAZY)
    private List<PreAnesMedicamentos> preAnesMedicamentosList;

    public PreAnestesicos() {
    }

    public PreAnestesicos(PreAnestesicosPK preAnestesicosPK) {
        this.preAnestesicosPK = preAnestesicosPK;
    }

    public PreAnestesicos(int rgsoprPrtoprslcNumero, int rgsoprPrtoprslcPcnNumeroHc) {
        this.preAnestesicosPK = new PreAnestesicosPK(rgsoprPrtoprslcNumero, rgsoprPrtoprslcPcnNumeroHc);
    }

    public PreAnestesicosPK getPreAnestesicosPK() {
        return preAnestesicosPK;
    }

    public void setPreAnestesicosPK(PreAnestesicosPK preAnestesicosPK) {
        this.preAnestesicosPK = preAnestesicosPK;
    }

    public Short getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(Short riesgo) {
        this.riesgo = riesgo;
    }

    public String getInformacionEspecial() {
        return informacionEspecial;
    }

    public void setInformacionEspecial(String informacionEspecial) {
        this.informacionEspecial = informacionEspecial;
    }

    public Character getCabeza() {
        return cabeza;
    }

    public void setCabeza(Character cabeza) {
        this.cabeza = cabeza;
    }

    public Character getOraganos() {
        return oraganos;
    }

    public void setOraganos(Character oraganos) {
        this.oraganos = oraganos;
    }

    public Character getEndoscopias() {
        return endoscopias;
    }

    public void setEndoscopias(Character endoscopias) {
        this.endoscopias = endoscopias;
    }

    public Character getIntradural() {
        return intradural;
    }

    public void setIntradural(Character intradural) {
        this.intradural = intradural;
    }

    public Character getExtradural() {
        return extradural;
    }

    public void setExtradural(Character extradural) {
        this.extradural = extradural;
    }

    public Character getCuello() {
        return cuello;
    }

    public void setCuello(Character cuello) {
        this.cuello = cuello;
    }

    public Character getExtratoracica() {
        return extratoracica;
    }

    public void setExtratoracica(Character extratoracica) {
        this.extratoracica = extratoracica;
    }

    public Character getIntratoracica() {
        return intratoracica;
    }

    public void setIntratoracica(Character intratoracica) {
        this.intratoracica = intratoracica;
    }

    public Character getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(Character abdomen) {
        this.abdomen = abdomen;
    }

    public Character getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(Character extremidades) {
        this.extremidades = extremidades;
    }

    public Character getObstetricas() {
        return obstetricas;
    }

    public void setObstetricas(Character obstetricas) {
        this.obstetricas = obstetricas;
    }

    public Character getPerineales() {
        return perineales;
    }

    public void setPerineales(Character perineales) {
        this.perineales = perineales;
    }

    public String getUroranalisis() {
        return uroranalisis;
    }

    public void setUroranalisis(String uroranalisis) {
        this.uroranalisis = uroranalisis;
    }

    public String getHematologico() {
        return hematologico;
    }

    public void setHematologico(String hematologico) {
        this.hematologico = hematologico;
    }

    public String getQuimicaSanguinea() {
        return quimicaSanguinea;
    }

    public void setQuimicaSanguinea(String quimicaSanguinea) {
        this.quimicaSanguinea = quimicaSanguinea;
    }

    public Character getAsma() {
        return asma;
    }

    public void setAsma(Character asma) {
        this.asma = asma;
    }

    public Character getAtelectacias() {
        return atelectacias;
    }

    public void setAtelectacias(Character atelectacias) {
        this.atelectacias = atelectacias;
    }

    public Short getCapacidadVital() {
        return capacidadVital;
    }

    public void setCapacidadVital(Short capacidadVital) {
        this.capacidadVital = capacidadVital;
    }

    public Character getNeumotorax() {
        return neumotorax;
    }

    public void setNeumotorax(Character neumotorax) {
        this.neumotorax = neumotorax;
    }

    public Character getBronquiectasias() {
        return bronquiectasias;
    }

    public void setBronquiectasias(Character bronquiectasias) {
        this.bronquiectasias = bronquiectasias;
    }

    public String getOtrosRespitatorio() {
        return otrosRespitatorio;
    }

    public void setOtrosRespitatorio(String otrosRespitatorio) {
        this.otrosRespitatorio = otrosRespitatorio;
    }

    public Character getArritmias() {
        return arritmias;
    }

    public void setArritmias(Character arritmias) {
        this.arritmias = arritmias;
    }

    public Character getHipertension() {
        return hipertension;
    }

    public void setHipertension(Character hipertension) {
        this.hipertension = hipertension;
    }

    public Character getEnfValvulares() {
        return enfValvulares;
    }

    public void setEnfValvulares(Character enfValvulares) {
        this.enfValvulares = enfValvulares;
    }

    public Character getEnfCongenitas() {
        return enfCongenitas;
    }

    public void setEnfCongenitas(Character enfCongenitas) {
        this.enfCongenitas = enfCongenitas;
    }

    public Character getInfartos() {
        return infartos;
    }

    public void setInfartos(Character infartos) {
        this.infartos = infartos;
    }

    public Character getInsuficienciaCardiaca() {
        return insuficienciaCardiaca;
    }

    public void setInsuficienciaCardiaca(Character insuficienciaCardiaca) {
        this.insuficienciaCardiaca = insuficienciaCardiaca;
    }

    public String getPulso() {
        return pulso;
    }

    public void setPulso(String pulso) {
        this.pulso = pulso;
    }

    public Character getEcg() {
        return ecg;
    }

    public void setEcg(Character ecg) {
        this.ecg = ecg;
    }

    public Character getConvulsiones() {
        return convulsiones;
    }

    public void setConvulsiones(Character convulsiones) {
        this.convulsiones = convulsiones;
    }

    public Character getTraumatismos() {
        return traumatismos;
    }

    public void setTraumatismos(Character traumatismos) {
        this.traumatismos = traumatismos;
    }

    public Character getPerdidaDeConciencia() {
        return perdidaDeConciencia;
    }

    public void setPerdidaDeConciencia(Character perdidaDeConciencia) {
        this.perdidaDeConciencia = perdidaDeConciencia;
    }

    public Character getCefalea() {
        return cefalea;
    }

    public void setCefalea(Character cefalea) {
        this.cefalea = cefalea;
    }

    public String getOtrosSnc() {
        return otrosSnc;
    }

    public void setOtrosSnc(String otrosSnc) {
        this.otrosSnc = otrosSnc;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public Character getHipertiroidismo() {
        return hipertiroidismo;
    }

    public void setHipertiroidismo(Character hipertiroidismo) {
        this.hipertiroidismo = hipertiroidismo;
    }

    public Character getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Character diabetes) {
        this.diabetes = diabetes;
    }

    public Character getInfufHepRen() {
        return infufHepRen;
    }

    public void setInfufHepRen(Character infufHepRen) {
        this.infufHepRen = infufHepRen;
    }

    public Character getDesequilibrio() {
        return desequilibrio;
    }

    public void setDesequilibrio(Character desequilibrio) {
        this.desequilibrio = desequilibrio;
    }

    public Character getToxemias() {
        return toxemias;
    }

    public void setToxemias(Character toxemias) {
        this.toxemias = toxemias;
    }

    public Character getTraumatismosMulti() {
        return traumatismosMulti;
    }

    public void setTraumatismosMulti(Character traumatismosMulti) {
        this.traumatismosMulti = traumatismosMulti;
    }

    public Character getShock() {
        return shock;
    }

    public void setShock(Character shock) {
        this.shock = shock;
    }

    public String getOtrosSistemas() {
        return otrosSistemas;
    }

    public void setOtrosSistemas(String otrosSistemas) {
        this.otrosSistemas = otrosSistemas;
    }

    public String getAnestesiasAnteriores() {
        return anestesiasAnteriores;
    }

    public void setAnestesiasAnteriores(String anestesiasAnteriores) {
        this.anestesiasAnteriores = anestesiasAnteriores;
    }

    public String getTerapiaAnterior() {
        return terapiaAnterior;
    }

    public void setTerapiaAnterior(String terapiaAnterior) {
        this.terapiaAnterior = terapiaAnterior;
    }

    public String getEsteroides() {
        return esteroides;
    }

    public void setEsteroides(String esteroides) {
        this.esteroides = esteroides;
    }

    public String getTranquilizantes() {
        return tranquilizantes;
    }

    public void setTranquilizantes(String tranquilizantes) {
        this.tranquilizantes = tranquilizantes;
    }

    public String getHipotensiones() {
        return hipotensiones;
    }

    public void setHipotensiones(String hipotensiones) {
        this.hipotensiones = hipotensiones;
    }

    public String getDigitalicos() {
        return digitalicos;
    }

    public void setDigitalicos(String digitalicos) {
        this.digitalicos = digitalicos;
    }

    public String getOtrosTerapia() {
        return otrosTerapia;
    }

    public void setOtrosTerapia(String otrosTerapia) {
        this.otrosTerapia = otrosTerapia;
    }

    public Date getUltimaIngestion() {
        return ultimaIngestion;
    }

    public void setUltimaIngestion(Date ultimaIngestion) {
        this.ultimaIngestion = ultimaIngestion;
    }

    public Date getHoraAccidente() {
        return horaAccidente;
    }

    public void setHoraAccidente(Date horaAccidente) {
        this.horaAccidente = horaAccidente;
    }

    public Character getInsuficuente() {
        return insuficuente;
    }

    public void setInsuficuente(Character insuficuente) {
        this.insuficuente = insuficuente;
    }

    public Character getBueno() {
        return bueno;
    }

    public void setBueno(Character bueno) {
        this.bueno = bueno;
    }

    public Character getDeprimido() {
        return deprimido;
    }

    public void setDeprimido(Character deprimido) {
        this.deprimido = deprimido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNauseas() {
        return nauseas;
    }

    public void setNauseas(String nauseas) {
        this.nauseas = nauseas;
    }

    public String getTraumatica() {
        return traumatica;
    }

    public void setTraumatica(String traumatica) {
        this.traumatica = traumatica;
    }

    public String getParesias() {
        return paresias;
    }

    public void setParesias(String paresias) {
        this.paresias = paresias;
    }

    public String getRespitatoria() {
        return respitatoria;
    }

    public void setRespitatoria(String respitatoria) {
        this.respitatoria = respitatoria;
    }

    public String getApCardio() {
        return apCardio;
    }

    public void setApCardio(String apCardio) {
        this.apCardio = apCardio;
    }

    public String getSistenaNervioso() {
        return sistenaNervioso;
    }

    public void setSistenaNervioso(String sistenaNervioso) {
        this.sistenaNervioso = sistenaNervioso;
    }

    public String getUrologicas() {
        return urologicas;
    }

    public void setUrologicas(String urologicas) {
        this.urologicas = urologicas;
    }

    public String getDiuresis() {
        return diuresis;
    }

    public void setDiuresis(String diuresis) {
        this.diuresis = diuresis;
    }

    public String getSangrados() {
        return sangrados;
    }

    public void setSangrados(String sangrados) {
        this.sangrados = sangrados;
    }

    public String getDolor() {
        return dolor;
    }

    public void setDolor(String dolor) {
        this.dolor = dolor;
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

    public Character getEnfisema() {
        return enfisema;
    }

    public void setEnfisema(Character enfisema) {
        this.enfisema = enfisema;
    }

    public String getOtrosCirculatorio() {
        return otrosCirculatorio;
    }

    public void setOtrosCirculatorio(String otrosCirculatorio) {
        this.otrosCirculatorio = otrosCirculatorio;
    }

    public Character getHipotiroidismo() {
        return hipotiroidismo;
    }

    public void setHipotiroidismo(Character hipotiroidismo) {
        this.hipotiroidismo = hipotiroidismo;
    }

    public String getComplicaciones() {
        return complicaciones;
    }

    public void setComplicaciones(String complicaciones) {
        this.complicaciones = complicaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public List<PreAnesMedicamentos> getPreAnesMedicamentosList() {
        return preAnesMedicamentosList;
    }

    public void setPreAnesMedicamentosList(List<PreAnesMedicamentos> preAnesMedicamentosList) {
        this.preAnesMedicamentosList = preAnesMedicamentosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (preAnestesicosPK != null ? preAnestesicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreAnestesicos)) {
            return false;
        }
        PreAnestesicos other = (PreAnestesicos) object;
        if ((this.preAnestesicosPK == null && other.preAnestesicosPK != null) || (this.preAnestesicosPK != null && !this.preAnestesicosPK.equals(other.preAnestesicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PreAnestesicos[ preAnestesicosPK=" + preAnestesicosPK + " ]";
    }
    
}
