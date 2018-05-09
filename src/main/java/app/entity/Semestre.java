package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SEMESTRE
 * @generated
 */
@Entity
@Table(name = "\"SEMESTRE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Semestre")
public class Semestre implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "semestre", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String semestre;

  /**
   * Construtor
   * @generated
   */
  public Semestre(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Semestre setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém semestre
   * return semestre
   * @generated
   */
  
  public java.lang.String getSemestre(){
    return this.semestre;
  }

  /**
   * Define semestre
   * @param semestre semestre
   * @generated
   */
  public Semestre setSemestre(java.lang.String semestre){
    this.semestre = semestre;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Semestre object = (Semestre)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
