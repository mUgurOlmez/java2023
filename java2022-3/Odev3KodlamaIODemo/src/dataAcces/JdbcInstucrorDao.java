package dataAcces;

import entities.Instuctror;

public class JdbcInstucrorDao implements InstuctrorDao {

	@Override
	public void add(Instuctror instuctror) {
		System.out.println("jdbc ile eklendi " + instuctror.getLastName() + " " + instuctror.getLastName());

	}

}
