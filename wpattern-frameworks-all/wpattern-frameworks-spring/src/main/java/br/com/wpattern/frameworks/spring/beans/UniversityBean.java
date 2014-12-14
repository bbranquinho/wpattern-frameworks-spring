package br.com.wpattern.frameworks.spring.beans;

import java.util.ArrayList;
import java.util.List;

import br.com.wpattern.frameworks.spring.enums.UniversityEnum;

public class UniversityBean extends BaseBean {

	private static final long serialVersionUID = 5170211516466368780L;

	private UniversityEnum university;

	private String description;

	private List<StudentBean> students = new ArrayList<StudentBean>();

	public UniversityBean() {
	}

	public UniversityBean(UniversityEnum university, String description) {
		this.university = university;
		this.description = description;
	}

	public UniversityEnum getUniversity() {
		return this.university;
	}

	public void setUniversity(UniversityEnum university) {
		this.university = university;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StudentBean getStudent(int index) {
		return this.students.get(index);
	}

	public void addStudent(StudentBean student) {
		this.students.add(student);
	}

}
