/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class TarifariosItemsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNV_CONVENIO")
    private String cnvConvenio;
    @Basic(optional = false)
    @Column(name = "ATI_ANEXO")
    private String atiAnexo;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "SECUENCIA")
    private short secuencia;

    public TarifariosItemsPK() {
    }

    public TarifariosItemsPK(String cnvConvenio, String atiAnexo, String tipo, String codigo, short secuencia) {
        this.cnvConvenio = cnvConvenio;
        this.atiAnexo = atiAnexo;
        this.tipo = tipo;
        this.codigo = codigo;
        this.secuencia = secuencia;
    }

    public String getCnvConvenio() {
        return cnvConvenio;
    }

    public void setCnvConvenio(String cnvConvenio) {
        this.cnvConvenio = cnvConvenio;
    }

    public String getAtiAnexo() {
        return atiAnexo;
    }

    public void setAtiAnexo(String atiAnexo) {
        this.atiAnexo = atiAnexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(short secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnvConvenio != null ? cnvConvenio.hashCode() : 0);
        hash += (atiAnexo != null ? atiAnexo.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        hash += (int) secuencia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarifariosItemsPK)) {
            return false;
        }
        TarifariosItemsPK other = (TarifariosItemsPK) object;
        if ((this.cnvConvenio == null && other.cnvConvenio != null) || (this.cnvConvenio != null && !this.cnvConvenio.equals(other.cnvConvenio))) {
            return false;
        }
        if ((this.atiAnexo == null && other.atiAnexo != null) || (this.atiAnexo != null && !this.atiAnexo.equals(other.atiAnexo))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        if (this.secuencia != other.secuencia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TarifariosItemsPK[ cnvConvenio=" + cnvConvenio + ", atiAnexo=" + atiAnexo + ", tipo=" + tipo + ", codigo=" + codigo + ", secuencia=" + secuencia + " ]";
    }
    
}
