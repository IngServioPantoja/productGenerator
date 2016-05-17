package uniandes.lineas.enums;

public enum ModulosEnum {
	MESSAGE_SYSTEM(""+
		"<ejbModule>"+
		 	"<groupId>co.com.tauLabs</groupId>"+
			"<artifactId>TauLabsMessagesEJB</artifactId>"+
		"</ejbModule>");
	
	private String valor;
	
	private ModulosEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
}
