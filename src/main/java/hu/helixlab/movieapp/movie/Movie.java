package hu.helixlab.movieapp.movie;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "film", schema = "public")
public class Movie {
    @Basic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, updatable = false, insertable = false)
    private int id;

    @Basic
    @Column(name = "nev", nullable = true, updatable = true, insertable = true)
    private String nev;

    @Basic
    @Column(name = "rendezo", nullable = true, updatable = true, insertable = true)
    private String rendezo;

    @Basic
    @Column(name = "hossz", nullable = true, updatable = true, insertable = true)
    private int hossz;

    @Basic
    @Column(name = "szabadhelyek", nullable = true, updatable = true, insertable = true)
    private int szabadhelyek;

    @Basic
    @Column(name = "kovetkezovetites", nullable = true, updatable = true, insertable = true)
    private Date kovetkezovetites;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String title) {
        this.nev = nev;
    }

    public String getRendezo() {
        return rendezo;
    }

    public void setRendezo(String rendezo) {
        this.rendezo = rendezo;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }

    public int getSzabadhelyek() {
        return szabadhelyek;
    }

    public void setSzabadhelyek(int szabadhelyek) {
        this.szabadhelyek = szabadhelyek;
    }

    public Date getKovetkezovetites() {
        return kovetkezovetites;
    }

    public void setKovetkezovetites(Date kovetkezovetites) {
        this.kovetkezovetites = kovetkezovetites;
    }
}
