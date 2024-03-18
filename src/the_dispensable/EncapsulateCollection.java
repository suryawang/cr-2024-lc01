package the_dispensable;

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
		private Set courses;

		public Set getCourses() {
			return courses;
		}

		public void setCourses(Set arg) {
			courses = arg;
		}
	}

	void test() {
		Person kent = new Person();
		Set s = new HashSet();
		s.add(new Course("Smalltalk Programming", false));
		s.add(new Course("Appreciating Single Malts", true));
		kent.setCourses(s);
		Assert.equals(2, kent.getCourses().size());
		Course refact = new Course("Refactoring", true);
		kent.getCourses().add(refact);
		kent.getCourses().add(new Course("Brutal Sarcasm", false));
		Assert.equals(4, kent.getCourses().size());
		kent.getCourses().remove(refact);
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
