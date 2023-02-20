package dataAcces;

import entities.Instuctror;

public class HibernateInstuctrorDao implements InstuctrorDao {

	@Override
	public void add(Instuctror instuctror) {
		System.out.println("Hibernate ile eklendi " + instuctror.getName() + " " + instuctror.getLastName());
	}

}
