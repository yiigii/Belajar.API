package Springboot.springboot_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import Springboot.springboot_app.model.DaftarTamu;
import Springboot.springboot_app.model.Perusahaan;
import Springboot.springboot_app.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);

	}

	@SpringBootApplication
	public static class Main implements CommandLineRunner {

		private final JdbcTemplate jdbcTemplate;

		public Main() {
			this.jdbcTemplate = getJdbcTemplate();
		}

		public static void main(String[] args) {
			SpringApplication.run(Main.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			System.out.println("Memulai koneksi ke database...");

			try {
				// Query untuk mengecek koneksi
				String sql = "SELECT COUNT(*) FROM belajar_api";
				Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
				System.out.println("Jumlah record di tabel belajar_api: " + count);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			System.out.println("Koneksi selesai.");
		}

		private JdbcTemplate getJdbcTemplate() {
			DataSource dataSource;
            dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/belajar_api", "root", "12345678");
            return new JdbcTemplate(dataSource);
		}
	}


}
