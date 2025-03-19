package com.home.carroapi;

import model.CarrosString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sevice.ConsomeApi;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class CarroApiApplication {

	public static void main(String[] args){
		SpringApplication.run(CarroApiApplication.class, args);
		ConsomeApi consomeApi = new ConsomeApi();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o id");
		int id = scan.nextInt();
		System.out.println("Digite o modelo");
		String modelo = scan.next();
		System.out.println("Digite o ano");
		String ano = scan.next();


		try {
				CarrosString carrosString = consomeApi.obterDado(id,modelo, ano);
				System.out.println(carrosString.toString());
			} catch (IOException | InterruptedException e) {
				throw new RuntimeException(e);
			}

    }

}