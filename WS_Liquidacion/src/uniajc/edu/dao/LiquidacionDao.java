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
			 String sql=("SELECT LIQU.LIQU_ID, "
+"PEGE.PEGE_DOCUMENTOIDENTIDAD AS DOCUMENTO, "
+"PENG.PENG_PRIMERAPELLIDO||' '||PENG.PENG_SEGUNDOAPELLIDO||' '||PENG.PENG_PRIMERNOMBRE||' '||PENG.PENG_SEGUNDONOMBRE AS NOMBRE, "
+"PROG.PROG_CODIGOPROGRAMA AS COD_PROG, "
+"PROG.PROG_NOMBRE AS PROGRAMA, "
+"CATE.CATE_DESCRIPCION AS CATEGORIA, "
+"SITE.SITE_DESCRIPCION AS SITUACION, "
+"ESTP.ESTP_ID, "
+"LIQU.LIQU_TOTALLIQUIDADO AS TOTAPAGAR, "
+"LIQU.LIQU_TOTALDESCUENTO AS DESCUENTO, "
+"LIQU.LIQU_VALORPAGADO AS V_PAGADO, "
+"LIQU.LIQU_ESTADO, "
+"LIQU.LIQU_TIPOLIQUIDACION AS TIPO_LIQU, "
+"MAAC.MAAC_ESTADO, "
+"LIQU.PEUN_ID, "
+"MAAC.PEUN_ID AS PEUN_MATRICULA, "
+"ESTP.ESTP_PERIODOACADEMICO AS SEMESTRE "
+"FROM ACADEMICO.LIQUIDACION LIQU, "
+"ACADEMICO.ESTUDIANTEPENSUM ESTP, "
+"ACADEMICO.PROGRAMA PROG, "
+"ACADEMICO.UNIDADPROGRAMA UNPR, "
+"ACADEMICO.PERSONAGENERAL PEGE, "
+"ACADEMICO.PERSONANATURALGENERAL PENG, "
+"ACADEMICO.MATRICULAACADEMICA MAAC, "
+"ACADEMICO.CATEGORIA CATE, "
+"ACADEMICO.SITUACIONESTUDIANTE SITE "
+"WHERE PENG.PEGE_ID="+P_ID+"");
			ResultSet rs=conn.query(sql);
			System.out.println(sql);
			if(rs.next()){
			   Liqui.setLIQU_ID(rs.getString("LIQU_ID"));
			   Liqui.setDOCUMENTO(rs.getString("DOCUMENTO"));
			   Liqui.setNOMBRE(rs.getString("NOMBRE"));
			   Liqui.setCOD_PROG(rs.getString("COD_PROG"));
			   Liqui.setPROGRAMA(rs.getString("PROGRAMA"));
			   Liqui.setCATEGORIA(rs.getString("CATEGORIA"));
			   Liqui.setSITUACION(rs.getString("SITUACION"));
			   Liqui.setESTP_ID(rs.getString("ESTP_ID"));
			   Liqui.setTOTAPAGAR(rs.getString("TOTAPAGAR"));
			   Liqui.setDESCUENTO(rs.getString("DESCUENTO"));
			   Liqui.setV_PAGADO(rs.getString("V_PAGADO"));
			   Liqui.setLIQU_ESTADO(rs.getString("LIQU_ESTADO"));
			   Liqui.setTIPO_LIQU(rs.getString("TIPO_LIQU"));
			   Liqui.setMAAC_ESTADO(rs.getString("MAAC_ESTADO"));
			   Liqui.setPEUN_ID(rs.getString("PEUN_ID"));
			   Liqui.setPEUN_MATRICULA(rs.getString("PEUN_MATRICULA"));
			   Liqui.setSEMESTRE(rs.getString("SEMESTRE"));
			  
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
