package uniajc.edu.ws;

import javax.jws.WebMethod;

import uniajc.edu.model.Liquidacion;
import uniajc.edu.servicio.ImplLiquidacion;
import uniajc.edu.servicio.Iliquidacion;;

public class WSLiquidacion {	
	
  
   public Liquidacion liquidacion(int P_ID) {
 
	   ImplLiquidacion dao = new ImplLiquidacion();
	  System.out.println("re: "+P_ID); 
	   return dao.Liquidacion(P_ID);
  
   }
  
  @WebMethod(operationName = "LiquidacionJson")
  public String liquidacionJson(int P_ID) {

	  System.out.println("1 Metodo a Consultar LiquidacionJSON "+ P_ID);
	   ImplLiquidacion imp = new ImplLiquidacion();
	   System.out.println(" 2 Metodo a Consultar imp.LiquidacionJSON "+ P_ID);
	   return imp.LiquidacionJson(P_ID);
 
  }
	
	
}
