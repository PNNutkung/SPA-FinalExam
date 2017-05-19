package com.pipatpol.finalexam.database;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PatternJDBCTemplate implements PatternDAO {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, String group, String implementation) {
		jdbcTemplateObject.update("INSERT INTO patterns (pattern_name, pattern_group, pattern_implementation) VALUES (?, ?, ?);", name, group, implementation);
		System.out.println(String.format("Created Record Name: %s Group: %s Implementation: %s", name, group, implementation));
	}

	@Override
	public Pattern getPattern(Integer id) {
		return jdbcTemplateObject.queryForObject("SELECT * FROM patterns WHERE id = ?;", new Object[] { id }, new PatternMapper());
	}

	@Override
	public List<Pattern> listPatterns() {
		return jdbcTemplateObject.query("SELECT * FROM patterns;", new PatternMapper());
	}

	@Override
	public void delete(Integer id){
		jdbcTemplateObject.update("DELETE FROM patterns WHERE id = ?", id);
		System.out.println(String.format("Deleted Record with ID = %d", id));
	}

	@Override
	public void update(Integer id, String name, String group, String implementation) {
		jdbcTemplateObject.update("UPDATE patterns SET pattern_name = ?, pattern_group = ?, pattern_implementation = ? WHERE id = ?", name, group, implementation, id);

	}
}