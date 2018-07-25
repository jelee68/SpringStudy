package com.wind.web.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.wind.web.dto.BDto;

public class BDao {
	
	DataSource dataSource;
	
	JdbcTemplate template = null;
	
	@Autowired
	public void setTemplate(JdbcTemplate template){
		this.template = template;		
	}
	
	public BDao() {	
	}
	
	public ArrayList<BDto> list() {
		String query = "select mId, mName, mContent "
				+ "from mboard order by mId Desc";
		return (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
	}
	
	public BDto contentView(String mId) {
		String query = "select * from mboard where mId = " + mId;
		return template.queryForObject(query, new BeanPropertyRowMapper<BDto>(BDto.class));	
	}

	public void write(final String mName, final String mContent) {
		String query = "insert into mboard(mId, mName, mContent) "
				 	 + "values (m_board_seq.nextval,?,?)";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException{
				ps.setString(1, mName);
				ps.setString(2, mContent);

			}
		});
	}

	public void delete(final String mId) {
		String query = "delete from mboard where mId = ? ";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException{
				ps.setInt(1, Integer.parseInt(mId));
			}
		});
	}
	
}