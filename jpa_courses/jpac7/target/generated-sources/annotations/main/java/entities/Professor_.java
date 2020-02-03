package main.java.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Professor.class)
public abstract class Professor_ {

	public static volatile SingularAttribute<Professor, String> name;
	public static volatile ListAttribute<Professor, Student> students;
	public static volatile SingularAttribute<Professor, Integer> id;

}

