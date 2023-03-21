package objects.sub;

public class Trainer {

	private final String employeeId;

	// instance variables
	private String name; // null

	private int age; // 0

	private String specialism; // null

	public Trainer(String employeeId, String name, int age, String specialism) {
		// this -> references the current object
		// this.name -> name from line 6
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.specialism = specialism;
	}

	// overloaded constructor -> has different parameters
	public Trainer(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.age;
		result = prime * result + ((this.employeeId == null) ? 0 : this.employeeId.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.specialism == null) ? 0 : this.specialism.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainer other = (Trainer) obj;
		if (this.age != other.age)
			return false;
		if (this.employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!this.employeeId.equals(other.employeeId))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.specialism == null) {
			if (other.specialism != null)
				return false;
		} else if (!this.specialism.equals(other.specialism))
			return false;
		return true;
	}

	public String introduce() {
		String intro = "Hello, my name is ";
		intro += this.name;
		intro += ". I am ";
		intro += this.age;
		intro += " years old and I specialise in ";
		intro += this.specialism;

		return intro;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 110)
			this.age = age;
		else
			System.out.println("Invalid age: " + age);
	}

	public String getName() {
		return this.name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public String getSpecialism() {
		return this.specialism;
	}

	public void setSpecialism(String specialism) {
		this.specialism = specialism;
	}

	@Override
	public String toString() {
		return "Trainer [employeeId=" + this.employeeId + ", name=" + this.name + ", age=" + this.age + ", specialism="
				+ this.specialism + "]";
	}

}
