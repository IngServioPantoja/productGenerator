package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "modules")
public class Module {
	
	private EjbModule[] ejbModule;
	
	private JarModule[] jarModule;
	
	private WebModule webModule;

	public EjbModule[] getEjbModule() {
		return ejbModule;
	}

	public void setEjbModule(EjbModule[] ejbModule) {
		this.ejbModule = ejbModule;
	}

	public JarModule[] getJarModule() {
		return jarModule;
	}

	public void setJarModule(JarModule[] jarModule) {
		this.jarModule = jarModule;
	}

	public WebModule getWebModule() {
		return webModule;
	}

	public void setWebModule(WebModule webModule) {
		this.webModule = webModule;
	}

	@Override
	public String toString() {
		return "ClassPojo [ejbModule = " + ejbModule + ", jarModule = " + jarModule + ", webModule = " + webModule
				+ "]";
	}
}
