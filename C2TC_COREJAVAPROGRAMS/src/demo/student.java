package demo;

public class student {
	private int id;
	private string name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public string getName() {
		return name;
	}
	public void setName(string name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", age=" + age + "]";
	}
	

}
