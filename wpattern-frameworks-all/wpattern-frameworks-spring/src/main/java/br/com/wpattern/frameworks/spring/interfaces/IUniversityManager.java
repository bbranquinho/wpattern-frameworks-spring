package br.com.wpattern.frameworks.spring.interfaces;

import br.com.wpattern.frameworks.spring.beans.StudentBean;
import br.com.wpattern.frameworks.spring.enums.UniversityEnum;

public interface IUniversityManager {

	public void addStudentByUniversity(UniversityEnum university, StudentBean student);

	public String printReport();

}
