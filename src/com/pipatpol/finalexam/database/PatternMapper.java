package com.pipatpol.finalexam.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PatternMapper implements RowMapper<Pattern> {
	public Pattern mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pattern pattern = new Pattern();
		pattern.setId(rs.getInt("id"));
		pattern.setName(rs.getString("pattern_name"));
		pattern.setGroup(rs.getString("pattern_group"));
		pattern.setImplementation(rs.getString("pattern_implementation"));
		return pattern;
	}
}
