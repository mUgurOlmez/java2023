package bussiness;

import java.util.List;

import dataAcces.CourseDao;

import entities.Course;
import logging.Ilogger;

public class CourseManager {

	CourseDao courseDao;
	Ilogger[] loggers;
	List<Course> courses;

	public CourseManager(CourseDao courseDao, Ilogger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;

	}

	public void add(Course course) throws Exception {

		for (Course course1 : courses) {
			if (course1.getName() == course.getName()) {

				throw new Exception("Kurs İsmi Tekrar edemez");
			}

			if (course.getPrice() < 0)
				;
			throw new Exception("Kurs ücreti 0 dan küçük olamaz");

		}

		courseDao.add(course);

		for (Ilogger logler : loggers) {
			logler.log();
		}

	}

}
