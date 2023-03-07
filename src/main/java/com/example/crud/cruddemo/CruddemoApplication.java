package com.example.crud.cruddemo;

import com.Vendor.controller.VendorController;
import com.Vendor.entity.Vendor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = "com.bike.controller")
@EnableJpaRepositories(basePackages = {"com.bike.repository"})
@EntityScan(basePackages = {"com.bike.entity"})
public class CruddemoApplication {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		VendorController vr= new VendorController();
		Vendor vv = new Vendor();
		int num = ss.nextInt();
		System.out.println("Enter the numbers according to the operation you want to perform");

		switch (num)
		{
			case 1:
			{
				System.out.println(vr.saveVendor(vv));
				break;
			}
			case 2:
			{
				System.out.println(vr.getVendor(vv.getVendorId()));
				break;
			}
			case 3:
			{
				System.out.println(vr.getAllVenor());
				break;
			}
			case 4:
			{
				System.out.println(vr.updateVendor(vv));
				break;
			}
			case 5:
			{
				System.out.println(vr.deleteUser(vv.getVendorId()));
				break;
			}
			default:
			{
				System.out.println("Enter the right number to perform CRUD operation");
			}

		}
		SpringApplication.run(CruddemoApplication.class, args);
	}

}
