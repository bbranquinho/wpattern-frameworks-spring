package br.com.wpattern.frameworks.spring;

import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import br.com.wpattern.frameworks.spring.beans.StudentBean;
import br.com.wpattern.frameworks.spring.enums.UniversityEnum;
import br.com.wpattern.frameworks.spring.interfaces.IApplication;
import br.com.wpattern.frameworks.spring.interfaces.IUniversityManager;

@Named
public class Application implements IApplication {

	private Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IUniversityManager universityManager;

	@Override
	public void start() {
		this.logger.info("Application started!");

		UniversityEnum university = this.readUniversity();

		while (university != null) {
			this.universityManager.addStudentByUniversity(university, this.readStudent());

			university = this.readUniversity();
		}

		JOptionPane.showMessageDialog(null, this.universityManager.printReport());
	}

	private StudentBean readStudent() {
		int code, age;
		String name, course;

		try {
			code = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do aluno?"));

			name = JOptionPane.showInputDialog("Qual o nome do aluno?");

			course = JOptionPane.showInputDialog("Qual o curso do aluno?");

			age = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));

			return new StudentBean(code, name, course, age);
		} catch (Exception e) {
			this.logger.error(e.getMessage(), e);
		}

		return null;
	}

	private UniversityEnum readUniversity() {
		UniversityEnum university = null;

		do {
			String input = JOptionPane.showInputDialog("Qual universidade deseja cadastrar um aluno? \n1: FPU\n2: UFU");

			if (input == null) {
				return null;
			}

			university = UniversityEnum.decode(input);

		} while (university == null);

		return university;
	}

}
