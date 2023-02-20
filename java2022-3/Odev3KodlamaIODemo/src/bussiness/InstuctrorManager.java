package bussiness;

import dataAcces.InstuctrorDao;
import entities.Instuctror;
import logging.Ilogger;

public class InstuctrorManager {

	InstuctrorDao instuctrorDao;
	Ilogger[] loggers;

	public InstuctrorManager(InstuctrorDao instuctrorDao, Ilogger[] loggers) {
		this.instuctrorDao = instuctrorDao;
		this.loggers = loggers;

	}

	public InstuctrorManager(InstuctrorDao instuctrordao2, Object loggers2) {
		// TODO Auto-generated constructor stub
	}

	public void add(Instuctror instuctor) {
		instuctrorDao.add(instuctor);

		for (Ilogger logger : loggers) {

			logger.log();

		}
	}

}
