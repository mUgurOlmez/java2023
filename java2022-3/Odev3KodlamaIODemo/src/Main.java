import java.util.ArrayList;
import java.util.List;
import bussiness.CategoryManager;
import bussiness.CourseManager;
import bussiness.InstuctrorManager;
import dataAcces.CategoryDao;
import dataAcces.CourseDao;
import dataAcces.HibernateInstuctrorDao;
import dataAcces.InstuctrorDao;
import dataAcces.JdbcCategorydao;
import dataAcces.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instuctror;
import logging.Databaselogger;
import logging.FileLogger;
import logging.Ilogger;
import logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {

		Ilogger[] loggers = { new MailLogger(), new FileLogger(), new Databaselogger() };

		Instuctror instuctror1 = new Instuctror("Engin", "Demiroğ");
		InstuctrorManager instuctrorManager = new InstuctrorManager(new HibernateInstuctrorDao(), loggers);
		instuctrorManager.add(instuctror1);

		Category category = new Category("Programlama");
		List<Category> categories = new ArrayList<>();
		CategoryManager categoryManager = new CategoryManager(new JdbcCategorydao(), loggers, categories);
		categoryManager.add(category);

		Course course = new Course("Java", 100.00);
		List<Course> courses = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
		courseManager.add(course);

	}
}
