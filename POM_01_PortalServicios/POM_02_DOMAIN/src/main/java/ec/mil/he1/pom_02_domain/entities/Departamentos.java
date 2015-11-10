/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "DEPARTAMENTOS")
@NamedQueries({
    @NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d")})
public class Departamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepartamentosPK departamentosPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CARGABLE")
    private Character cargable;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "BODEGA")
    private Character bodega;
    @Column(name = "DIAS_CALCULO_STOCK")
    private BigInteger diasCalculoStock;
    @Column(name = "DIAS_STOCK_MINIMO")
    private BigInteger diasStockMinimo;
    @Column(name = "DIAS_STOCK_MAXIMO")
    private BigInteger diasStockMaximo;
    @Column(name = "PRD_CODIGO")
    private BigInteger prdCodigo;
    @Column(name = "ORIGEN")
    private String origen;
    @Column(name = "CALCULAR_STOCK_TOTAL")
    private String calcularStockTotal;
    @Column(name = "MTV_CODIGO")
    private String mtvCodigo;
    @Column(name = "SOBRESTOCK")
    private String sobrestock;
    @Column(name = "LOCALIZACION")
    private String localizacion;
    @Column(name = "PRC_INICIAL")
    private Short prcInicial;
    @Column(name = "PRC_SUBSECUENTE")
    private Short prcSubsecuente;
    @JoinTable(name = "DEPARTAMENTOS_COSTOS", joinColumns = {
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "ELMCST_NUMERO", referencedColumnName = "NUMERO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<ElementosDeCosto> elementosDeCostoList;
    @JoinTable(name = "DEPARTAMENTOS_SOLICITANTES", joinColumns = {
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "TPOEXM_ID", referencedColumnName = "ID")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<TiposDeExamenes> tiposDeExamenesList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Diuresis> diuresisList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<TareasDepartamentos> tareasDepartamentosList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<DetallesFactura> detallesFacturaList;
    @OneToMany(mappedBy = "departamentos1", fetch = FetchType.LAZY)
    private List<DetallesFactura> detallesFacturaList1;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Regulaciones> regulacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<TurnosDeDetalles> turnosDeDetallesList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Cuentas> cuentasList;
    @OneToMany(mappedBy = "departamentos1", fetch = FetchType.LAZY)
    private List<Cuentas> cuentasList1;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Transferencias> transferenciasList;
    @OneToMany(mappedBy = "departamentos1", fetch = FetchType.LAZY)
    private List<Transferencias> transferenciasList1;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<HorariosSemanalesMedicos> horariosSemanalesMedicosList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<DescargosDeBotica> descargosDeBoticaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<DepartamentosCopago> departamentosCopagoList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Transfusiones> transfusionesList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<IngestasYEliminaciones> ingestasYEliminacionesList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<TiposDeExamenes> tiposDeExamenesList1;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<EgresosSubbodegas> egresosSubbodegasList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<ExcepcionesTurnosCe> excepcionesTurnosCeList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<HorariosMedico> horariosMedicoList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<PrescripcionesMedicas> prescripcionesMedicasList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<SolicitudesDeInternacion> solicitudesDeInternacionList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Pacientes> pacientesList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<SolicitudesTransfusiones> solicitudesTransfusionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<SubBodegas> subBodegasList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<SolicitudesDeInsumos> solicitudesDeInsumosList;
    @JoinColumn(name = "ARA_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Areas areas;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<TurnosCe> turnosCeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<DetallesPromociones> detallesPromocionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<ManoDeObraDpr> manoDeObraDprList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Cargos> cargosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<TurnosDeLaboratorios> turnosDeLaboratoriosList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<DetallesPrescripcion> detallesPrescripcionList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<AsignacionesReingresosActivo> asignacionesReingresosActivoList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Planilla> planillaList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<HojasDeEvolucion> hojasDeEvolucionList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<SolicitudesDeCompra> solicitudesDeCompraList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<CabeceraInsumos> cabeceraInsumosList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<DefinicionesTurnos> definicionesTurnosList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<EgresosDeBodega> egresosDeBodegaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<DepartamentosTrabajan> departamentosTrabajanList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<VariablesDeExamenes> variablesDeExamenesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<ResponsablesDepartamentos> responsablesDepartamentosList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<EmpleadosRoles> empleadosRolesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<DepartamentosCentrosCostos> departamentosCentrosCostosList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<EgresosDeBotica> egresosDeBoticaList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<RegistroDeEnfermeria> registroDeEnfermeriaList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<PedidosDeDieta> pedidosDeDietaList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<SolicitudesDeExamenes> solicitudesDeExamenesList;
    @OneToMany(mappedBy = "departamentos", fetch = FetchType.LAZY)
    private List<Protocolos> protocolosList;

    public Departamentos() {
    }

    public Departamentos(DepartamentosPK departamentosPK) {
        this.departamentosPK = departamentosPK;
    }

    public Departamentos(String araCodigo, String codigo) {
        this.departamentosPK = new DepartamentosPK(araCodigo, codigo);
    }

    public DepartamentosPK getDepartamentosPK() {
        return departamentosPK;
    }

    public void setDepartamentosPK(DepartamentosPK departamentosPK) {
        this.departamentosPK = departamentosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getCargable() {
        return cargable;
    }

    public void setCargable(Character cargable) {
        this.cargable = cargable;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getBodega() {
        return bodega;
    }

    public void setBodega(Character bodega) {
        this.bodega = bodega;
    }

    public BigInteger getDiasCalculoStock() {
        return diasCalculoStock;
    }

    public void setDiasCalculoStock(BigInteger diasCalculoStock) {
        this.diasCalculoStock = diasCalculoStock;
    }

    public BigInteger getDiasStockMinimo() {
        return diasStockMinimo;
    }

    public void setDiasStockMinimo(BigInteger diasStockMinimo) {
        this.diasStockMinimo = diasStockMinimo;
    }

    public BigInteger getDiasStockMaximo() {
        return diasStockMaximo;
    }

    public void setDiasStockMaximo(BigInteger diasStockMaximo) {
        this.diasStockMaximo = diasStockMaximo;
    }

    public BigInteger getPrdCodigo() {
        return prdCodigo;
    }

    public void setPrdCodigo(BigInteger prdCodigo) {
        this.prdCodigo = prdCodigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCalcularStockTotal() {
        return calcularStockTotal;
    }

    public void setCalcularStockTotal(String calcularStockTotal) {
        this.calcularStockTotal = calcularStockTotal;
    }

    public String getMtvCodigo() {
        return mtvCodigo;
    }

    public void setMtvCodigo(String mtvCodigo) {
        this.mtvCodigo = mtvCodigo;
    }

    public String getSobrestock() {
        return sobrestock;
    }

    public void setSobrestock(String sobrestock) {
        this.sobrestock = sobrestock;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Short getPrcInicial() {
        return prcInicial;
    }

    public void setPrcInicial(Short prcInicial) {
        this.prcInicial = prcInicial;
    }

    public Short getPrcSubsecuente() {
        return prcSubsecuente;
    }

    public void setPrcSubsecuente(Short prcSubsecuente) {
        this.prcSubsecuente = prcSubsecuente;
    }

    public List<ElementosDeCosto> getElementosDeCostoList() {
        return elementosDeCostoList;
    }

    public void setElementosDeCostoList(List<ElementosDeCosto> elementosDeCostoList) {
        this.elementosDeCostoList = elementosDeCostoList;
    }

    public List<TiposDeExamenes> getTiposDeExamenesList() {
        return tiposDeExamenesList;
    }

    public void setTiposDeExamenesList(List<TiposDeExamenes> tiposDeExamenesList) {
        this.tiposDeExamenesList = tiposDeExamenesList;
    }

    public List<Diuresis> getDiuresisList() {
        return diuresisList;
    }

    public void setDiuresisList(List<Diuresis> diuresisList) {
        this.diuresisList = diuresisList;
    }

    public List<TareasDepartamentos> getTareasDepartamentosList() {
        return tareasDepartamentosList;
    }

    public void setTareasDepartamentosList(List<TareasDepartamentos> tareasDepartamentosList) {
        this.tareasDepartamentosList = tareasDepartamentosList;
    }

    public List<DetallesFactura> getDetallesFacturaList() {
        return detallesFacturaList;
    }

    public void setDetallesFacturaList(List<DetallesFactura> detallesFacturaList) {
        this.detallesFacturaList = detallesFacturaList;
    }

    public List<DetallesFactura> getDetallesFacturaList1() {
        return detallesFacturaList1;
    }

    public void setDetallesFacturaList1(List<DetallesFactura> detallesFacturaList1) {
        this.detallesFacturaList1 = detallesFacturaList1;
    }

    public List<Regulaciones> getRegulacionesList() {
        return regulacionesList;
    }

    public void setRegulacionesList(List<Regulaciones> regulacionesList) {
        this.regulacionesList = regulacionesList;
    }

    public List<TurnosDeDetalles> getTurnosDeDetallesList() {
        return turnosDeDetallesList;
    }

    public void setTurnosDeDetallesList(List<TurnosDeDetalles> turnosDeDetallesList) {
        this.turnosDeDetallesList = turnosDeDetallesList;
    }

    public List<Cuentas> getCuentasList() {
        return cuentasList;
    }

    public void setCuentasList(List<Cuentas> cuentasList) {
        this.cuentasList = cuentasList;
    }

    public List<Cuentas> getCuentasList1() {
        return cuentasList1;
    }

    public void setCuentasList1(List<Cuentas> cuentasList1) {
        this.cuentasList1 = cuentasList1;
    }

    public List<Transferencias> getTransferenciasList() {
        return transferenciasList;
    }

    public void setTransferenciasList(List<Transferencias> transferenciasList) {
        this.transferenciasList = transferenciasList;
    }

    public List<Transferencias> getTransferenciasList1() {
        return transferenciasList1;
    }

    public void setTransferenciasList1(List<Transferencias> transferenciasList1) {
        this.transferenciasList1 = transferenciasList1;
    }

    public List<HorariosSemanalesMedicos> getHorariosSemanalesMedicosList() {
        return horariosSemanalesMedicosList;
    }

    public void setHorariosSemanalesMedicosList(List<HorariosSemanalesMedicos> horariosSemanalesMedicosList) {
        this.horariosSemanalesMedicosList = horariosSemanalesMedicosList;
    }

    public List<DescargosDeBotica> getDescargosDeBoticaList() {
        return descargosDeBoticaList;
    }

    public void setDescargosDeBoticaList(List<DescargosDeBotica> descargosDeBoticaList) {
        this.descargosDeBoticaList = descargosDeBoticaList;
    }

    public List<DepartamentosCopago> getDepartamentosCopagoList() {
        return departamentosCopagoList;
    }

    public void setDepartamentosCopagoList(List<DepartamentosCopago> departamentosCopagoList) {
        this.departamentosCopagoList = departamentosCopagoList;
    }

    public List<Transfusiones> getTransfusionesList() {
        return transfusionesList;
    }

    public void setTransfusionesList(List<Transfusiones> transfusionesList) {
        this.transfusionesList = transfusionesList;
    }

    public List<IngestasYEliminaciones> getIngestasYEliminacionesList() {
        return ingestasYEliminacionesList;
    }

    public void setIngestasYEliminacionesList(List<IngestasYEliminaciones> ingestasYEliminacionesList) {
        this.ingestasYEliminacionesList = ingestasYEliminacionesList;
    }

    public List<TiposDeExamenes> getTiposDeExamenesList1() {
        return tiposDeExamenesList1;
    }

    public void setTiposDeExamenesList1(List<TiposDeExamenes> tiposDeExamenesList1) {
        this.tiposDeExamenesList1 = tiposDeExamenesList1;
    }

    public List<EgresosSubbodegas> getEgresosSubbodegasList() {
        return egresosSubbodegasList;
    }

    public void setEgresosSubbodegasList(List<EgresosSubbodegas> egresosSubbodegasList) {
        this.egresosSubbodegasList = egresosSubbodegasList;
    }

    public List<ExcepcionesTurnosCe> getExcepcionesTurnosCeList() {
        return excepcionesTurnosCeList;
    }

    public void setExcepcionesTurnosCeList(List<ExcepcionesTurnosCe> excepcionesTurnosCeList) {
        this.excepcionesTurnosCeList = excepcionesTurnosCeList;
    }

    public List<HorariosMedico> getHorariosMedicoList() {
        return horariosMedicoList;
    }

    public void setHorariosMedicoList(List<HorariosMedico> horariosMedicoList) {
        this.horariosMedicoList = horariosMedicoList;
    }

    public List<PrescripcionesMedicas> getPrescripcionesMedicasList() {
        return prescripcionesMedicasList;
    }

    public void setPrescripcionesMedicasList(List<PrescripcionesMedicas> prescripcionesMedicasList) {
        this.prescripcionesMedicasList = prescripcionesMedicasList;
    }

    public List<SolicitudesDeInternacion> getSolicitudesDeInternacionList() {
        return solicitudesDeInternacionList;
    }

    public void setSolicitudesDeInternacionList(List<SolicitudesDeInternacion> solicitudesDeInternacionList) {
        this.solicitudesDeInternacionList = solicitudesDeInternacionList;
    }

    public List<Pacientes> getPacientesList() {
        return pacientesList;
    }

    public void setPacientesList(List<Pacientes> pacientesList) {
        this.pacientesList = pacientesList;
    }

    public List<SolicitudesTransfusiones> getSolicitudesTransfusionesList() {
        return solicitudesTransfusionesList;
    }

    public void setSolicitudesTransfusionesList(List<SolicitudesTransfusiones> solicitudesTransfusionesList) {
        this.solicitudesTransfusionesList = solicitudesTransfusionesList;
    }

    public List<SubBodegas> getSubBodegasList() {
        return subBodegasList;
    }

    public void setSubBodegasList(List<SubBodegas> subBodegasList) {
        this.subBodegasList = subBodegasList;
    }

    public List<SolicitudesDeInsumos> getSolicitudesDeInsumosList() {
        return solicitudesDeInsumosList;
    }

    public void setSolicitudesDeInsumosList(List<SolicitudesDeInsumos> solicitudesDeInsumosList) {
        this.solicitudesDeInsumosList = solicitudesDeInsumosList;
    }

    public Areas getAreas() {
        return areas;
    }

    public void setAreas(Areas areas) {
        this.areas = areas;
    }

    public List<TurnosCe> getTurnosCeList() {
        return turnosCeList;
    }

    public void setTurnosCeList(List<TurnosCe> turnosCeList) {
        this.turnosCeList = turnosCeList;
    }

    public List<DetallesPromociones> getDetallesPromocionesList() {
        return detallesPromocionesList;
    }

    public void setDetallesPromocionesList(List<DetallesPromociones> detallesPromocionesList) {
        this.detallesPromocionesList = detallesPromocionesList;
    }

    public List<ManoDeObraDpr> getManoDeObraDprList() {
        return manoDeObraDprList;
    }

    public void setManoDeObraDprList(List<ManoDeObraDpr> manoDeObraDprList) {
        this.manoDeObraDprList = manoDeObraDprList;
    }

    public List<Cargos> getCargosList() {
        return cargosList;
    }

    public void setCargosList(List<Cargos> cargosList) {
        this.cargosList = cargosList;
    }

    public List<TurnosDeLaboratorios> getTurnosDeLaboratoriosList() {
        return turnosDeLaboratoriosList;
    }

    public void setTurnosDeLaboratoriosList(List<TurnosDeLaboratorios> turnosDeLaboratoriosList) {
        this.turnosDeLaboratoriosList = turnosDeLaboratoriosList;
    }

    public List<DetallesPrescripcion> getDetallesPrescripcionList() {
        return detallesPrescripcionList;
    }

    public void setDetallesPrescripcionList(List<DetallesPrescripcion> detallesPrescripcionList) {
        this.detallesPrescripcionList = detallesPrescripcionList;
    }

    public List<AsignacionesReingresosActivo> getAsignacionesReingresosActivoList() {
        return asignacionesReingresosActivoList;
    }

    public void setAsignacionesReingresosActivoList(List<AsignacionesReingresosActivo> asignacionesReingresosActivoList) {
        this.asignacionesReingresosActivoList = asignacionesReingresosActivoList;
    }

    public List<Planilla> getPlanillaList() {
        return planillaList;
    }

    public void setPlanillaList(List<Planilla> planillaList) {
        this.planillaList = planillaList;
    }

    public List<HojasDeEvolucion> getHojasDeEvolucionList() {
        return hojasDeEvolucionList;
    }

    public void setHojasDeEvolucionList(List<HojasDeEvolucion> hojasDeEvolucionList) {
        this.hojasDeEvolucionList = hojasDeEvolucionList;
    }

    public List<SolicitudesDeCompra> getSolicitudesDeCompraList() {
        return solicitudesDeCompraList;
    }

    public void setSolicitudesDeCompraList(List<SolicitudesDeCompra> solicitudesDeCompraList) {
        this.solicitudesDeCompraList = solicitudesDeCompraList;
    }

    public List<CabeceraInsumos> getCabeceraInsumosList() {
        return cabeceraInsumosList;
    }

    public void setCabeceraInsumosList(List<CabeceraInsumos> cabeceraInsumosList) {
        this.cabeceraInsumosList = cabeceraInsumosList;
    }

    public List<DefinicionesTurnos> getDefinicionesTurnosList() {
        return definicionesTurnosList;
    }

    public void setDefinicionesTurnosList(List<DefinicionesTurnos> definicionesTurnosList) {
        this.definicionesTurnosList = definicionesTurnosList;
    }

    public List<EgresosDeBodega> getEgresosDeBodegaList() {
        return egresosDeBodegaList;
    }

    public void setEgresosDeBodegaList(List<EgresosDeBodega> egresosDeBodegaList) {
        this.egresosDeBodegaList = egresosDeBodegaList;
    }

    public List<DepartamentosTrabajan> getDepartamentosTrabajanList() {
        return departamentosTrabajanList;
    }

    public void setDepartamentosTrabajanList(List<DepartamentosTrabajan> departamentosTrabajanList) {
        this.departamentosTrabajanList = departamentosTrabajanList;
    }

    public List<VariablesDeExamenes> getVariablesDeExamenesList() {
        return variablesDeExamenesList;
    }

    public void setVariablesDeExamenesList(List<VariablesDeExamenes> variablesDeExamenesList) {
        this.variablesDeExamenesList = variablesDeExamenesList;
    }

    public List<ResponsablesDepartamentos> getResponsablesDepartamentosList() {
        return responsablesDepartamentosList;
    }

    public void setResponsablesDepartamentosList(List<ResponsablesDepartamentos> responsablesDepartamentosList) {
        this.responsablesDepartamentosList = responsablesDepartamentosList;
    }

    public List<EmpleadosRoles> getEmpleadosRolesList() {
        return empleadosRolesList;
    }

    public void setEmpleadosRolesList(List<EmpleadosRoles> empleadosRolesList) {
        this.empleadosRolesList = empleadosRolesList;
    }

    public List<DepartamentosCentrosCostos> getDepartamentosCentrosCostosList() {
        return departamentosCentrosCostosList;
    }

    public void setDepartamentosCentrosCostosList(List<DepartamentosCentrosCostos> departamentosCentrosCostosList) {
        this.departamentosCentrosCostosList = departamentosCentrosCostosList;
    }

    public List<EgresosDeBotica> getEgresosDeBoticaList() {
        return egresosDeBoticaList;
    }

    public void setEgresosDeBoticaList(List<EgresosDeBotica> egresosDeBoticaList) {
        this.egresosDeBoticaList = egresosDeBoticaList;
    }

    public List<RegistroDeEnfermeria> getRegistroDeEnfermeriaList() {
        return registroDeEnfermeriaList;
    }

    public void setRegistroDeEnfermeriaList(List<RegistroDeEnfermeria> registroDeEnfermeriaList) {
        this.registroDeEnfermeriaList = registroDeEnfermeriaList;
    }

    public List<PedidosDeDieta> getPedidosDeDietaList() {
        return pedidosDeDietaList;
    }

    public void setPedidosDeDietaList(List<PedidosDeDieta> pedidosDeDietaList) {
        this.pedidosDeDietaList = pedidosDeDietaList;
    }

    public List<SolicitudesDeExamenes> getSolicitudesDeExamenesList() {
        return solicitudesDeExamenesList;
    }

    public void setSolicitudesDeExamenesList(List<SolicitudesDeExamenes> solicitudesDeExamenesList) {
        this.solicitudesDeExamenesList = solicitudesDeExamenesList;
    }

    public List<Protocolos> getProtocolosList() {
        return protocolosList;
    }

    public void setProtocolosList(List<Protocolos> protocolosList) {
        this.protocolosList = protocolosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentosPK != null ? departamentosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.departamentosPK == null && other.departamentosPK != null) || (this.departamentosPK != null && !this.departamentosPK.equals(other.departamentosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Departamentos[ departamentosPK=" + departamentosPK + " ]";
    }
    
}
