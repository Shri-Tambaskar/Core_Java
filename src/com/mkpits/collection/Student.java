package com.mkpits.collection;

import java.util.Objects;

public class Student {

	private String name;
	private Integer roll;

	public Student() {

	}

	public Student(String name, Integer roll) {

		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", roll=" + roll + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(roll, other.roll);
	}

}
