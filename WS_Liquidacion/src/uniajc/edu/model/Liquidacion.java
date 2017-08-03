package uniajc.edu.model;

public class Liquidacion {
//modelo

private String LIQU_ID;
private String DOCUMENTO;
private String NOMBRE;
private String COD_PROG;
private String PROGRAMA;
private String CATEGORIA;
private String SITUACION;
private String ESTP_ID;
private String TOTAPAGAR;
private String DESCUENTO;
private String V_PAGADO;
private String LIQU_ESTADO;
private String TIPO_LIQU;
private String MAAC_ESTADO;
private String PEUN_ID;
private String PEUN_MATRICULA;
private String SEMESTRE;
	
	
	public Liquidacion() {
	
	}


	public Liquidacion(String lIQU_ID, String dOCUMENTO, String nOMBRE, String cOD_PROG, String pROGRAMA,
			String cATEGORIA, String sITUACION, String eSTP_ID, String tOTAPAGAR, String dESCUENTO, String v_PAGADO,
			String lIQU_ESTADO, String tIPO_LIQU, String mAAC_ESTADO, String pEUN_ID, String pEUN_MATRICULA,
			String sEMESTRE) {
		
		LIQU_ID = lIQU_ID;
		DOCUMENTO = dOCUMENTO;
		NOMBRE = nOMBRE;
		COD_PROG = cOD_PROG;
		PROGRAMA = pROGRAMA;
		CATEGORIA = cATEGORIA;
		SITUACION = sITUACION;
		ESTP_ID = eSTP_ID;
		TOTAPAGAR = tOTAPAGAR;
		DESCUENTO = dESCUENTO;
		V_PAGADO = v_PAGADO;
		LIQU_ESTADO = lIQU_ESTADO;
		TIPO_LIQU = tIPO_LIQU;
		MAAC_ESTADO = mAAC_ESTADO;
		PEUN_ID = pEUN_ID;
		PEUN_MATRICULA = pEUN_MATRICULA;
		SEMESTRE = sEMESTRE;
	}


	public String getLIQU_ID() {
		return LIQU_ID;
	}


	public void setLIQU_ID(String lIQU_ID) {
		LIQU_ID = lIQU_ID;
	}


	public String getDOCUMENTO() {
		return DOCUMENTO;
	}


	public void setDOCUMENTO(String dOCUMENTO) {
		DOCUMENTO = dOCUMENTO;
	}


	public String getNOMBRE() {
		return NOMBRE;
	}


	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}


	public String getCOD_PROG() {
		return COD_PROG;
	}


	public void setCOD_PROG(String cOD_PROG) {
		COD_PROG = cOD_PROG;
	}


	public String getPROGRAMA() {
		return PROGRAMA;
	}


	public void setPROGRAMA(String pROGRAMA) {
		PROGRAMA = pROGRAMA;
	}




	public String getCATEGORIA() {
		return CATEGORIA;
	}


	public void setCATEGORIA(String cATEGORIA) {
		CATEGORIA = cATEGORIA;
	}


	public String getSITUACION() {
		return SITUACION;
	}


	public void setSITUACION(String sITUACION) {
		SITUACION = sITUACION;
	}


	public String getESTP_ID() {
		return ESTP_ID;
	}


	public void setESTP_ID(String eSTP_ID) {
		ESTP_ID = eSTP_ID;
	}


	public String getTOTAPAGAR() {
		return TOTAPAGAR;
	}


	public void setTOTAPAGAR(String tOTAPAGAR) {
		TOTAPAGAR = tOTAPAGAR;
	}


	public String getDESCUENTO() {
		return DESCUENTO;
	}


	public void setDESCUENTO(String dESCUENTO) {
		DESCUENTO = dESCUENTO;
	}


	public String getV_PAGADO() {
		return V_PAGADO;
	}


	public void setV_PAGADO(String v_PAGADO) {
		V_PAGADO = v_PAGADO;
	}


	public String getLIQU_ESTADO() {
		return LIQU_ESTADO;
	}


	public void setLIQU_ESTADO(String lIQU_ESTADO) {
		LIQU_ESTADO = lIQU_ESTADO;
	}


	public String getTIPO_LIQU() {
		return TIPO_LIQU;
	}


	public void setTIPO_LIQU(String tIPO_LIQU) {
		TIPO_LIQU = tIPO_LIQU;
	}


	public String getMAAC_ESTADO() {
		return MAAC_ESTADO;
	}


	public void setMAAC_ESTADO(String mAAC_ESTADO) {
		MAAC_ESTADO = mAAC_ESTADO;
	}


	public String getPEUN_ID() {
		return PEUN_ID;
	}


	public void setPEUN_ID(String pEUN_ID) {
		PEUN_ID = pEUN_ID;
	}


	public String getPEUN_MATRICULA() {
		return PEUN_MATRICULA;
	}


	public void setPEUN_MATRICULA(String pEUN_MATRICULA) {
		PEUN_MATRICULA = pEUN_MATRICULA;
	}


	public String getSEMESTRE() {
		return SEMESTRE;
	}


	public void setSEMESTRE(String sEMESTRE) {
		SEMESTRE = sEMESTRE;
	}
		

}
