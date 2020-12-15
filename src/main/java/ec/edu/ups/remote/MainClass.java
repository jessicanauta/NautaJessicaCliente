package ec.edu.ups.remote;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.negocio.ClienteONRemoto;


public class MainClass {
	
	public ClienteONRemoto contacto;
	
	public void intanciarEJBRemote() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb01");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/NautaJessicaServidor/ClienteON!ec.edu.ups.negocio.ClienteONRemoto";  
              
           this.contacto = (ClienteONRemoto) context.lookup(lookupName);  
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	}

		
	public static void main(String args[]) {
		
		MainClass mc = new MainClass();
		try {
			mc.intanciarEJBRemote();
			Cliente per = new Cliente();
			/*per.setCedula("0107122418");
			per.setNombre("Jessica");
			mc.contacto.guardadoContacto(per);*/
			per = mc.contacto.obtenerCedula("0987612534");
			System.out.println(per);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
