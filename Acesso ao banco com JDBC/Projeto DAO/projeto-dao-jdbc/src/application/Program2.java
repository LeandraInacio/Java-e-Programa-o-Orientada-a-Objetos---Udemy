package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		/*System.out.println("========= TESTE 1 INSERT =========");
		Department department = new Department(null, "Food");
		departmentDao.insert(department);
		System.out.println("Departamento Criado, ID: " + department.getId());*/

		System.out.println("========= TESTE 2 UPDATE =========");
		Department department2 = departmentDao.findById(6);
		
		System.out.println(department2);
		
		department2.setName("Calcados");
		departmentDao.update(department2);
		
		System.out.println("Update realizado com sucesso");

		System.out.println("========= TESTE 2 DELETE =========");
		departmentDao.deleteById(7);
		System.out.println("Deletado com sucesso");

	}

}
