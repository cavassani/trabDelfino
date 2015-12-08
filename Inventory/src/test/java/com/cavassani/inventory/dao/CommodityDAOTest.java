package com.cavassani.inventory.dao;

import java.util.List;

import org.junit.Test;

import com.cavassani.inventory.domain.Commodity;
import com.cavassani.inventory.dao.CommodityDAO;

public class CommodityDAOTest {
	@Test
	public void salvar(){
		Commodity commodity = new Commodity();
		commodity.setCommodityName("Pão");
		commodity.setAmountInventory("1000");
		commodity.setMinimalAmount("450");
		CommodityDAO commodityDAO = new CommodityDAO();
		commodityDAO.salvar(commodity);
		
	}
	@Test
	public void listar(){
		CommodityDAO commodityDAO = new CommodityDAO();
		List<Commodity> result = commodityDAO.listar();
		System.out.println("total de registros encontrados:"+ result.size());
	}
	@Test
	public void buscar(){
		Long code = 7L;
		CommodityDAO commodityDAO = new CommodityDAO();
		Commodity commodity = commodityDAO.buscar(code);
		
		if(commodity == null){
			System.out.println("nenhum registro encontrado ");
			
		}else{
			System.out.println(" registro encontrado ");
		}
			
		
		
	}
	
	@Test
	public void excluir(){
		Long code = 7L;
		CommodityDAO commodityDAO = new CommodityDAO();
		Commodity commodity = commodityDAO.buscar(code);
		
		if(commodity == null){
			System.out.println("nenhum registro encontrado");
		}else{
			commodityDAO.excluir(commodity);
			System.out.println("Registro removido:");
			System.out.println();
		}
		
		
	}
	@Test
	public void editar(){
		Long code = 10L;
		CommodityDAO commodityDAO = new CommodityDAO();
		Commodity commodity = commodityDAO.buscar(code);
		
		if(commodity == null){
			System.out.println("nenhum registro encontrado");
		}else{
			commodity.setMinimalAmount("300");
			commodityDAO.editar(commodity);
			System.out.println("Registro alterado:");
			System.out.println();
		}
		
		
	}

}
