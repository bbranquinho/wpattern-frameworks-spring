package br.com.wpattern.frameworks.spring;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.frameworks.spring.beans.StudentBean;
import br.com.wpattern.frameworks.spring.beans.UniversityBean;
import br.com.wpattern.frameworks.spring.enums.UniversityEnum;
import br.com.wpattern.frameworks.spring.interfaces.IUniversityManager;

@Named
public class UniversityManager implements IUniversityManager {

	@Inject
	private UniversityBean fpu;

	@Inject
	private UniversityBean ufu;

	public UniversityManager() {
	}

	@Override
	public void addStudentByUniversity(UniversityEnum university, StudentBean student) {
		if ((university == null) || (student == null)) {
			return;
		}

		switch (university) {
		case FPU:
			this.addStudent(this.fpu, student);
			break;

		case UFU:
			this.addStudent(this.ufu, student);
			break;
		}
	}

	@Override
	public String printReport() {
		return this.fpu + "\n" + this.ufu;
	}

	private void addStudent(UniversityBean university, StudentBean student) {
		university.addStudent(student);
	}

}
