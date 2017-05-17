package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="TYPEUTILISATEUR")
public class TypeUtilisateur implements Serializable{

	private static final long serialVersionUID = 7095979199747586041L;

	@Id
	@Column(name="RCTYPEUSER", length=1, nullable=false)
	private String rcTypeUser;
	
	@Column(name="RCLIBELLEUSER", length=255, nullable=false)
    private String rcLibelleUser;
	
	@OneToMany(mappedBy = "typeUser", targetEntity = Utilisateur.class)
    private List<Utilisateur> utilisateurs;
   


}
