/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indah;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lenovo
 */
@Entity
@Table(name = "bukutelepon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bukutelepon.findAll", query = "SELECT b FROM Bukutelepon b")
    , @NamedQuery(name = "Bukutelepon.findByNama", query = "SELECT b FROM Bukutelepon b WHERE b.nama = :nama")
    , @NamedQuery(name = "Bukutelepon.findByTelepon", query = "SELECT b FROM Bukutelepon b WHERE b.telepon = :telepon")
    , @NamedQuery(name = "Bukutelepon.findByEmail", query = "SELECT b FROM Bukutelepon b WHERE b.email = :email")
    , @NamedQuery(name = "Bukutelepon.findByAlamat", query = "SELECT b FROM Bukutelepon b WHERE b.alamat = :alamat")})
public class Bukutelepon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Nama")
    private String nama;
    @Column(name = "Telepon")
    private String telepon;
    @Column(name = "Email")
    private String email;
    @Column(name = "Alamat")
    private String alamat;

    public Bukutelepon() {
    }

    public Bukutelepon(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nama != null ? nama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bukutelepon)) {
            return false;
        }
        Bukutelepon other = (Bukutelepon) object;
        if ((this.nama == null && other.nama != null) || (this.nama != null && !this.nama.equals(other.nama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "indah.Bukutelepon[ nama=" + nama + " ]";
    }
    
}
