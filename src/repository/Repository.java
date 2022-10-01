package repository;

import javax.persistence.EntityManager;

public class Repository<T> {
	//esta clase no va
	//hacer clases DTO para cada clase que tengas los constructotes de ReporteDTO, Carrera, Estudiante clase, gets y toString
	// se puede generar una clase abstracta de repository ... BUSCAR!!!!!!!
	
	protected EntityManager entityManager;

    public Repository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //a) dar de alta un estudiante  ??
    public void add(T t) {
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();
    }

    public void close(){
        entityManager.close();
    }
	
}
