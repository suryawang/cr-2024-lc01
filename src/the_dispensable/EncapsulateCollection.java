package the_dispensable;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EncapsulateCollection {
	class Course {
		private String name;
		private boolean isAdvanced;

		public Course(String name, boolean isAdvanced) {
			this.name = name;
			this.isAdvanced = isAdvanced;
		}

		public boolean isAdvanced() {
			return isAdvanced;
		}
	}

	class Person {
		private Set courses = new HashSet();

		public Set getCourses() {
			return Collections.unmodifiableSet(courses);
		}

		public void addCourse(Course course) {
			courses.add(course);
		}

		public void removeCourse(Course course) {
			courses.remove(course);
		}
	}

	void test() {
		Person kent = new Person();
		kent.addCourse(new Course("Smalltalk Programming", false));
		kent.addCourse(new Course("Appreciating Single Malts", true));
		Assert.equals(2, kent.getCourses().size());
		Course refact = new Course("Refactoring", true);
		kent.addCourse(refact);
		kent.addCourse(new Course("Brutal Sarcasm", false));
		Assert.equals(4, kent.getCourses().size());
		kent.removeCourse(refact);
		Assert.equals(3, kent.getCourses().size());

		Iterator iter = kent.getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		System.out.print("Advanced courses: " + count);
	}

	public static void main(String[] a) {
		new EncapsulateCollection().test();
	}

	public static class Assert {
		public static void equals(int a, int b) {
			if (a != b)
				throw new AssertionError("a and b is not equal.");
		}
	}
}
