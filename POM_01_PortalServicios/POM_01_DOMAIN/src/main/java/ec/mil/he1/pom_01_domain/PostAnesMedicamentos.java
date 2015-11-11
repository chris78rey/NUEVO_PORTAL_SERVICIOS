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

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "POST_ANES_MEDICAMENTOS")
@NamedQueries({
    @NamedQuery(name = "PostAnesMedicamentos.findAll", query = "SELECT p FROM PostAnesMedicamentos p")})
public class PostAnesMedicamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PostAnesMedicamentosPK postAnesMedicamentosPK;
    @Column(name = "MEDICAMENTO")
    private String medicamento;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public PostAnesMedicamentos() {
    }

    public PostAnesMedicamentos(PostAnesMedicamentosPK postAnesMedicamentosPK) {
        this.postAnesMedicamentosPK = postAnesMedicamentosPK;
    }

    public PostAnesMedicamentos(int pstansRgsoprPrtoprslcPcnNu, int pstansRgsoprPrtoprslcNumero, Date hora) {
        this.postAnesMedicamentosPK = new PostAnesMedicamentosPK(pstansRgsoprPrtoprslcPcnNu, pstansRgsoprPrtoprslcNumero, hora);
    }

    public PostAnesMedicamentosPK getPostAnesMedicamentosPK() {
        return postAnesMedicamentosPK;
    }

    public void setPostAnesMedicamentosPK(PostAnesMedicamentosPK postAnesMedicamentosPK) {
        this.postAnesMedicamentosPK = postAnesMedicamentosPK;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postAnesMedicamentosPK != null ? postAnesMedicamentosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostAnesMedicamentos)) {
            return false;
        }
        PostAnesMedicamentos other = (PostAnesMedicamentos) object;
        if ((this.postAnesMedicamentosPK == null && other.postAnesMedicamentosPK != null) || (this.postAnesMedicamentosPK != null && !this.postAnesMedicamentosPK.equals(other.postAnesMedicamentosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PostAnesMedicamentos[ postAnesMedicamentosPK=" + postAnesMedicamentosPK + " ]";
    }
    
}
