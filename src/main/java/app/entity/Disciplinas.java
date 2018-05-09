package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela DISCIPLINAS
 * @generated
 */
@Entity
@Table(name = "\"DISCIPLINAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Disciplinas")
public class Disciplinas implements Serializable {

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
  @Column(name = "disciplinas", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String disciplinas;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Aluno aluno;

  /**
   * Construtor
   * @generated
   */
  public Disciplinas(){
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
  public Disciplinas setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém disciplinas
   * return disciplinas
   * @generated
   */
  
  public java.lang.String getDisciplinas(){
    return this.disciplinas;
  }

  /**
   * Define disciplinas
   * @param disciplinas disciplinas
   * @generated
   */
  public Disciplinas setDisciplinas(java.lang.String disciplinas){
    this.disciplinas = disciplinas;
    return this;
  }

  /**
   * Obtém aluno
   * return aluno
   * @generated
   */
  
  public Aluno getAluno(){
    return this.aluno;
  }

  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public Disciplinas setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Disciplinas object = (Disciplinas)obj;
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
