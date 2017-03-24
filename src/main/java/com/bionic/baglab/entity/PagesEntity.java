package com.bionic.baglab.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.persistence.Entity;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Table(name = "pages", schema = "baglab")
public class PagesEntity {
    private int idnews;
    private String body;
    private String header;
    private Timestamp newsCreate;
    private java.sql.Timestamp newsUpdate;
    private PagesTypeEntity pagesTypeByPagesTypeId;

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "idnews", unique = true)
    public int getIdnews() {
        return idnews;
    }

    public void setIdnews(int idnews) {
        this.idnews = idnews;
    }

    @Basic
    @Column(name = "body", columnDefinition="mediumtext")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Column(name = "header")
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Basic
    //@Type(type="timestamp")
    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "newsCreate", insertable=false, updatable = false)
    public Timestamp getNewsCreate() {
        return newsCreate;
    }

    public void setNewsCreate(Timestamp newsCreate) {
        this.newsCreate = newsCreate;
    }

    @Basic
    @Column(name = "newsUpdate", insertable=false, updatable=false)
    public Timestamp getNewsUpdate() {
        return newsUpdate;
    }

    public void setNewsUpdate(Timestamp newsUpdate) {
        this.newsUpdate = newsUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PagesEntity that = (PagesEntity) o;

        if (idnews != that.idnews) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (header != null ? !header.equals(that.header) : that.header != null) return false;
        if (newsCreate != null ? !newsCreate.equals(that.newsCreate) : that.newsCreate != null) return false;
        if (newsUpdate != null ? !newsUpdate.equals(that.newsUpdate) : that.newsUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idnews;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (header != null ? header.hashCode() : 0);
        result = 31 * result + (newsCreate != null ? newsCreate.hashCode() : 0);
        result = 31 * result + (newsUpdate != null ? newsUpdate.hashCode() : 0);
        return result;
    }

   /* @ManyToOne
    @JoinColumn(name = "pagesTypeId", referencedColumnName = "idpages_type", nullable = false)
    public PagesTypeEntity getPagesTypeByPagesTypeId() {
        return pagesTypeByPagesTypeId;
    }

    public void setPagesTypeByPagesTypeId(PagesTypeEntity pagesTypeByPagesTypeId) {
        this.pagesTypeByPagesTypeId = pagesTypeByPagesTypeId;
    }*/

    @Override
    public String toString() {
        return "PagesEntity{" +
                "idnews=" + idnews +
                ", body='" + body + '\'' +
                ", header='" + header + '\'' +
                ", newsCreate=" + newsCreate +
                ", newsUpdate="  + newsUpdate +
                ", pagesTypeByPagesTypeId=" + pagesTypeByPagesTypeId +
                '}';
    }
}
