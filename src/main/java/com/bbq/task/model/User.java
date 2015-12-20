package com.bbq.task.model;

import org.springframework.stereotype.Component;

@Component
public class User {

	private Integer id;
	private String name;
	private Long create_at;
	private Long update_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Long create_at) {
		this.create_at = create_at;
	}

	public Long getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Long update_at) {
		this.update_at = update_at;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", create_at=" + create_at + ", update_at=" + update_at
				+ "]";
	}

}
