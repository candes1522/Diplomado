package uniajc.edu.servicio;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.gson.Gson;

import uniajc.edu.dao.LiquidacionDao;
import uniajc.edu.model.Liquidacion;

public class TestLiquidacionJson {

	@Test
	public String LiquidacionJson(int id) {
		LiquidacionDao LiqDAO = new LiquidacionDao();
		Liquidacion liquidacion = LiqDAO.Liquidacion(id);
		System.out.println("re: " + liquidacion);
		final Gson gson1 = new Gson();		
		 String data = gson1.toJson(liquidacion);
		return data;
		}


}
