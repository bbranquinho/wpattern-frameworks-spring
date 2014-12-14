package br.com.wpattern.frameworks.spring.enums;

import java.util.HashMap;
import java.util.Map;

public enum UniversityEnum {

	FPU ("Faculdade Politécnica de Uberlandia", "1"),

	UFU ("Universidade Federal de Uberlandia", "2");

	private String name;

	private String code;

	private static final Map<String, UniversityEnum> universities;

	static {
		universities = new HashMap<String, UniversityEnum>();

		for (UniversityEnum university : values()) {
			universities.put(university.code, university);
		}
	}

	private UniversityEnum(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public static UniversityEnum decode(String code) {
		return universities.get(code);
	}

	@Override
	public String toString() {
		return this.name;
	}

}
