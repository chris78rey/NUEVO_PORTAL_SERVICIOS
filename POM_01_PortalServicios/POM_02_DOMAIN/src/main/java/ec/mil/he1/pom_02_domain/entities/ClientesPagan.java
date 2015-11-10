/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CLIENTES_PAGAN")
@NamedQueries({
    @NamedQuery(name = "ClientesPagan.findAll", query = "SELECT c FROM ClientesPagan c")})
public class ClientesPagan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClientesPaganPK clientesPaganPK;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "NOMBRE_LEGAL")
    private String nombreLegal;
    @Column(name = "EXCENTO_IVA")
    private Character excentoIva;
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(mappedBy = "clientesPagan", fetch = FetchType.LAZY)
    private List<PlanillasHonorariosMdc> planillasHonorariosMdcList;
    @OneToMany(mappedBy = "clientesPagan", fetch = FetchType.LAZY)
    private List<Facturas> facturasList;
    @OneToMany(mappedBy = "clientesPagan", fetch = FetchType.LAZY)
    private List<CuentasPorCobrar> cuentasPorCobrarList;
    @OneToMany(mappedBy = "clientesPagan1", fetch = FetchType.LAZY)
    private List<CuentasPorCobrar> cuentasPorCobrarList1;
    @OneToMany(mappedBy = "clientesPagan2", fetch = FetchType.LAZY)
    private List<CuentasPorCobrar> cuentasPorCobrarList2;
    @OneToMany(mappedBy = "clientesPagan", fetch = FetchType.LAZY)
    private List<Asociados> asociadosList;
    @OneToMany(mappedBy = "clientesPagan1", fetch = FetchType.LAZY)
    private List<Asociados> asociadosList1;

    public ClientesPagan() {
    }

    public ClientesPagan(ClientesPaganPK clientesPaganPK) {
        this.clientesPaganPK = clientesPaganPK;
    }

    public ClientesPagan(String tipoCodigo, String codigo) {
        this.clientesPaganPK = new ClientesPaganPK(tipoCodigo, codigo);
    }

    public ClientesPaganPK getClientesPaganPK() {
        return clientesPaganPK;
    }

    public void setClientesPaganPK(ClientesPaganPK clientesPaganPK) {
        this.clientesPaganPK = clientesPaganPK;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreLegal() {
        return nombreLegal;
    }

    public void setNombreLegal(String nombreLegal) {
        this.nombreLegal = nombreLegal;
    }

    public Character getExcentoIva() {
        return excentoIva;
    }

    public void setExcentoIva(Character excentoIva) {
        this.excentoIva = excentoIva;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PlanillasHonorariosMdc> getPlanillasHonorariosMdcList() {
        return planillasHonorariosMdcList;
    }

    public void setPlanillasHonorariosMdcList(List<PlanillasHonorariosMdc> planillasHonorariosMdcList) {
        this.planillasHonorariosMdcList = planillasHonorariosMdcList;
    }

    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    public List<CuentasPorCobrar> getCuentasPorCobrarList() {
        return cuentasPorCobrarList;
    }

    public void setCuentasPorCobrarList(List<CuentasPorCobrar> cuentasPorCobrarList) {
        this.cuentasPorCobrarList = cuentasPorCobrarList;
    }

    public List<CuentasPorCobrar> getCuentasPorCobrarList1() {
        return cuentasPorCobrarList1;
    }

    public void setCuentasPorCobrarList1(List<CuentasPorCobrar> cuentasPorCobrarList1) {
        this.cuentasPorCobrarList1 = cuentasPorCobrarList1;
    }

    public List<CuentasPorCobrar> getCuentasPorCobrarList2() {
        return cuentasPorCobrarList2;
    }

    public void setCuentasPorCobrarList2(List<CuentasPorCobrar> cuentasPorCobrarList2) {
        this.cuentasPorCobrarList2 = cuentasPorCobrarList2;
    }

    public List<Asociados> getAsociadosList() {
        return asociadosList;
    }

    public void setAsociadosList(List<Asociados> asociadosList) {
        this.asociadosList = asociadosList;
    }

    public List<Asociados> getAsociadosList1() {
        return asociadosList1;
    }

    public void setAsociadosList1(List<Asociados> asociadosList1) {
        this.asociadosList1 = asociadosList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientesPaganPK != null ? clientesPaganPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientesPagan)) {
            return false;
        }
        ClientesPagan other = (ClientesPagan) object;
        if ((this.clientesPaganPK == null && other.clientesPaganPK != null) || (this.clientesPaganPK != null && !this.clientesPaganPK.equals(other.clientesPaganPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ClientesPagan[ clientesPaganPK=" + clientesPaganPK + " ]";
    }
    
}
