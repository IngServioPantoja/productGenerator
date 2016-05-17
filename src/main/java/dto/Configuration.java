package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "configuration")
public class Configuration {
	
	private Module modules;
	
	private String defaultLibBundleDir;

	private String version;

	public Module getModules() {
		return modules;
	}

	public void setModules(Module modules) {
		this.modules = modules;
	}

	public String getDefaultLibBundleDir() {
		return defaultLibBundleDir;
	}

	public void setDefaultLibBundleDir(String defaultLibBundleDir) {
		this.defaultLibBundleDir = defaultLibBundleDir;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}