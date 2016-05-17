package uniandes.lineas.enums;

public enum FeaturesEnum {
	REPORTS("Reports"), 
	MESSAGE_SYSTEM("MessageSystem"), 
	SOCIAL_AUTHENTICATION("SocialAuthentication"), 
	COMMENTS_AND_RATINGS("CommentsAndRaitings"), 
	BASIC("Basic"), 
	INTERMEDIATE("Intermediate"), 
	PRO("Pro"), 
	QR("Qr");

	private String valor;

	private FeaturesEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

}
