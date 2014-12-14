package br.com.wpattern.frameworks.spring.beans;

public class StudentBean extends BaseBean {

	private static final long serialVersionUID = 3803828799830686695L;

	private int code;

	private String name;

	private String course;

	private int age;

	public StudentBean() {
	}

	public StudentBean(int code, String name, String course, int age) {
		this.code = code;
		this.name = name;
		this.course = course;
		this.age = age;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
