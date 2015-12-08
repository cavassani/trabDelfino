package com.cavassani.inventory.dao;

import java.util.List;

import org.junit.Test;

import com.cavassani.inventory.domain.CarryInput;
import com.cavassani.inventory.dao.CarryInputDAO;

public class CarryInputDAOTest {
	@Test
	public void salvar(){
		CarryInput carryInput = new CarryInput();
		//carryInput.setEntryDate(entryDate);
		

		CarryInputDAO carryInputDAO = new CarryInputDAO();
		carryInputDAO.salvar(carryInput);
		
	}
	@Test
	public void listar(){
		CarryInputDAO carryInputDAO = new CarryInputDAO();
		List<CarryInput> result = carryInputDAO.listar();
	}
	@Test
	public void buscar(){
		Long code = 7L;
		CarryInputDAO carryInputDAO = new CarryInputDAO();
		CarryInput carryInput = carryInputDAO.buscar(code);
		
		
	}
	
	@Test
	public void excluir(){
		Long code = 7L;
		CarryInputDAO carryInputDAO = new CarryInputDAO();
		CarryInput carryInput = carryInputDAO.buscar(code);
		
		if(carryInput == null){
			System.out.println("nenhum registro encontrado");
		}else{
			carryInputDAO.excluir(carryInput);
			System.out.println("Registro removido:");
			System.out.println();
		}
		
		
	}
	@Test
	public void editar(){
		Long code = 10L;
		CarryInputDAO carryInputDAO = new CarryInputDAO();
		CarryInput carryInput = carryInputDAO.buscar(code);
		
		if(carryInput == null){
			System.out.println("nenhum registro encontrado");
		}else{
			//carryInput.setProvider(provider);
			carryInputDAO.editar(carryInput);
			System.out.println("Registro alterado:");
			System.out.println();
		}
		
		
	}

}
