package com.sj.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="emp_tbl")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int emp_id;
	@Column
	private String empname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="task_id")
	private Task task;
	
	public Employee(String empname) {
		super();
		this.empname = empname;
	}
	
	
}
