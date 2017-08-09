package uniajc.edu.dao;

import uniajc.edu.model.*;
import uniajc.edu.conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class LiquidacionDao {
	


public Liquidacion Liquidacion(int P_ID) {
		//push
		
		Liquidacion Liqui = new Liquidacion();
		ConnectionDB conn = new ConnectionDB();
		 
		 try {
			 conn.connect();
			 String sql=("SELECT LIQU_ID,LIQU_TOTALLIQUIDADO,LIQU_TOTALDESCUENTO,LIQU_FECHAPAGO,LIQU_FECHACAMBIO,ESTP_ID,TIPL_ID,LIQU_ESTADO,LIQU_SALDOAFAVOR,LIQU_REGISTRADOPOR,"
					 +"LIQU_SALDOENCONTRA,LIQU_REFERENCIA,PEUN_ID,UNID_ID,LIQU_NUMEROCUOTA,LIQU_NIVELLIQUIDACION,LIQU_FECHASPROPIAS,FINA_ID,LIQU_VALORPAGADO,LIQU_VALORANTICIPO,LIQU_VALORCUOTAORIGINAL,"
					 +"LIQU_TIPOLIQUIDACION,PSLI_ID,PRAC_ID,INLI_ID,LIQU_TIPOGENERACION FROM LIQUIDACION WHERE ESTP_ID="+P_ID+"");
			ResultSet rs=conn.query(sql);
			System.out.println(sql);
			if(rs.next()){
			   Liqui.setLIQU_ID(rs.getString("LIQU_ID"));
			   Liqui.setLIQU_TOTALLIQUIDADO(rs.getString("LIQU_TOTALLIQUIDADO"));
			   Liqui.setLIQU_TOTALDESCUENTO(rs.getString("LIQU_TOTALDESCUENTO"));
			   Liqui.setLIQU_FECHAPAGO(rs.getString("LIQU_FECHAPAGO"));
			   Liqui.setLIQU_FECHACAMBIO(rs.getString("LIQU_FECHACAMBIO"));
			   Liqui.setESTP_ID(rs.getString("ESTP_ID"));
			   Liqui.setTIPL_ID(rs.getString("TIPL_ID"));
			   Liqui.setLIQU_ESTADO(rs.getString("LIQU_ESTADO"));
			   Liqui.setLIQU_SALDOAFAVOR(rs.getString("LIQU_SALDOAFAVOR"));
			   Liqui.setLIQU_REGISTRADOPOR(rs.getString("LIQU_REGISTRADOPOR"));
			   Liqui.setLIQU_SALDOENCONTRA(rs.getString("LIQU_SALDOENCONTRA"));
			   Liqui.setLIQU_REFERENCIA(rs.getString("LIQU_REFERENCIA"));
			   Liqui.setPEUN_ID(rs.getString("PEUN_ID"));
			   Liqui.setUNID_ID(rs.getString("UNID_ID"));
			   Liqui.setLIQU_NUMEROCUOTA(rs.getString("LIQU_NUMEROCUOTA"));
			   Liqui.setLIQU_NIVELLIQUIDACION(rs.getString("LIQU_NIVELLIQUIDACION"));
			   Liqui.setLIQU_FECHASPROPIAS(rs.getString("LIQU_FECHASPROPIAS"));
			   Liqui.setFINA_ID(rs.getString("FINA_ID"));
			   Liqui.setLIQU_VALORPAGADO(rs.getString("LIQU_VALORPAGADO"));
			   Liqui.setLIQU_VALORANTICIPO(rs.getString("LIQU_VALORANTICIPO"));
			   Liqui.setLIQU_VALORCUOTAORIGINAL(rs.getString("LIQU_VALORCUOTAORIGINAL"));
			   Liqui.setLIQU_TIPOLIQUIDACION(rs.getString("LIQU_TIPOLIQUIDACION"));
			   Liqui.setPSLI_ID(rs.getString("PSLI_ID"));
			   Liqui.setPRAC_ID(rs.getString("PRAC_ID"));
			   Liqui.setINLI_ID(rs.getString("INLI_ID"));
			   Liqui.setLIQU_TIPOGENERACION(rs.getString("LIQU_TIPOGENERACION"));
			   
			  
	          System.out.println(""+ Liqui);
	
			   }
			
			return Liqui;
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			  conn.disconnect();
			  return null;
		}
		
	}
	
		
}
