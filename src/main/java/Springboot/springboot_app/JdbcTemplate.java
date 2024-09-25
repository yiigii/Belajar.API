package Springboot.springboot_app;

import javax.sql.DataSource;

public class JdbcTemplate {
    public JdbcTemplate(DataSource dataSource) {
    }

    public Integer queryForObject(String sql, Class<Integer> integerClass) {
        return null;
    }
}
