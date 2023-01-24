package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department dep = new Department(1, "Computer");
		
		Seller seller = new Seller(1, "Pedro Castro", "pedro@outloo.pt", sdf.parse("31/01/1976"), 1645.0, dep);
		
		System.out.println(seller);

	}

}
