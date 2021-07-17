package com.example.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.example.model.Student;

public class StudentDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public int save(Student p){
        String sql="insert into students(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";
        return template.update(sql);
    }
    public int update(Student p){
        String sql="update students set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";
        return template.update(sql);
    }
    public int delete(int id){
        String sql="delete from students where id="+id+"";
        return template.update(sql);
    }
    public Student getStdById(int id){
        String sql="select * from students where id=?";
        return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));
    }
    public List<Student> getStudents(){
        return template.query("select * from students",new RowMapper<Student>(){
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student e=new Student();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getFloat(3));
                e.setDesignation(rs.getString(4));
                return e;
            }
        });
    }
}