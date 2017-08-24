package hu.helixlab.movieapp.order;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "foglalas", schema = "public")
public class Order {
    @Basic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, updatable = false, insertable = false)
    private int id;

    @Basic
    @Column(name = "nev", nullable = true, updatable = true, insertable = true)
    private String nev;

    @Basic
    @Column(name = "email", nullable = true, updatable = true, insertable = true)
    private String email;

    @Basic
    @Column(name = "filmid", nullable = true, updatable = true, insertable = true)
    private int filmId;

    @Basic
    @Column(name = "jegyszam", nullable = true, updatable = true, insertable = true)
    private int jegyszam;

//    @Basic
//    @Column(name = "kovetkezovetites", nullable = true, updatable = true, insertable = true)
//    private Date kovetkezovetites;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getJegyszam() {
        return jegyszam;
    }

    public void setJegyszam(int jegyszam) {
        this.jegyszam = jegyszam;
    }
//    public Date getKovetkezovetites() {
//        return kovetkezovetites;
//    }
//
//    public void setKovetkezovetites(Date kovetkezovetites) {
//        this.kovetkezovetites = kovetkezovetites;
//    }
}
