public class Person {
	private String name;
	private String gender;
	private int age;

	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Person() {
		this(null, null, 0);
	}

	public Person(Person other) {
		if(other == null)
			throw new NullPointerException("No object to copy from!");
		else {
			this.name = other.getName();
			this.gender = other.getGender();
			this.age = other.getAge();
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		if(this.gender.equals("male"))
			return("Mr. " + this.name + " is " + this.age + " years old.");
		else
			return("Mrs./Ms. " + this.name + " is " + this.age + " years old.");

	}

	public boolean equals(Object other) {
		if(other == null)
			throw new NullPointerException("No object to compare with!");
		else {
			if(other instanceof Person) {
				Person ref = (Person) other; // MUST DOWNCAST!!!
				return this.name.equals(ref.getName());
			}
			else
				throw new ClassCastException("Cannot compare with a different object!");
		}
	}

}
