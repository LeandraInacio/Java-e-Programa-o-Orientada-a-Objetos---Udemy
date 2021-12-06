package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("========TESTE 1 FINDBYID ========");		
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\n========TESTE 2 FINDBYDEPARTMENT ========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println("\n"+obj);
		}
		
		System.out.println("\n========TESTE 3 FINDBYALL ========");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println("\n"+obj);
		}
		
		System.out.println("\n========TESTE 4 INSERT ========");
		Seller newseller = new Seller(null, "Greg Yellow", "greg@gmail.com", new Date(), 3000.0, department);
		sellerDao.insert(newseller);
		System.out.println("ID: "+newseller.getId());
		
		System.out.println("\n========TESTE 4 UPDATE ========");
		seller = sellerDao.findById(1);
		seller.setName("Maria Julia");
		sellerDao.update(seller);
		System.out.println("Update concluído");
	}

}
