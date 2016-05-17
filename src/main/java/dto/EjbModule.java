package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ejbModule")
public class EjbModule {
	
	private String groupId;

	private String artifactId;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	@Override
	public String toString() {
		return "ClassPojo [groupId = " + groupId + ", artifactId = " + artifactId + "]";
	}
}