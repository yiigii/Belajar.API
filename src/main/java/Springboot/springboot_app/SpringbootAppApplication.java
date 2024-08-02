package Springboot.springboot_app;

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

	public class Main {

		public static void main(String[] args){
			User user1 = new User(1, "Aigi");
			User user2 = new User(2, "Wahyu");
			User user3 = new User(3, "Way");
			User user4 = new User(4, "Muhammad");

			Perusahaan perusahaan1 = new Perusahaan(1, "Skolla");
			Perusahaan perusahaan2 = new Perusahaan(2, "Ruang Guru");

			DaftarTamu daftarTamu1 = new DaftarTamu(1, perusahaan1, user1);
			DaftarTamu daftarTamu2 = new DaftarTamu(2, perusahaan1, user2);
			DaftarTamu daftarTamu3 = new DaftarTamu(3, perusahaan2, user3);
			DaftarTamu daftarTamu4 = new DaftarTamu(4, perusahaan2, user4);

			System.out.println(daftarTamu4);

		}

	}

}
