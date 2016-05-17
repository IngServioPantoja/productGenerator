package repository;

import org.apache.maven.model.Dependency;
import org.codehaus.plexus.util.xml.Xpp3Dom;

public class DependenciasSubis {

	public static Dependency obtenerDependenciaMessageSystem() {
		Dependency dependenciaMessage = new Dependency();
		dependenciaMessage.setGroupId("co.com.tauLabs");
		dependenciaMessage.setArtifactId("TauLabsMessagesEJB");
		dependenciaMessage.setVersion("1.0");
		dependenciaMessage.setScope("provided");
		dependenciaMessage.setType("ejb");
		return dependenciaMessage;
	}

	public static Dependency obtenerDependenciaReport() {
		Dependency dependenciaReport = new Dependency();
		dependenciaReport.setGroupId("co.com.tauLabs");
		dependenciaReport.setArtifactId("TauLabsReportEJB");
		dependenciaReport.setVersion("1.0");
		dependenciaReport.setScope("provided");
		dependenciaReport.setType("ejb");
		return dependenciaReport;
	}

	public static Xpp3Dom obtenerModuloMessageSystem() {
		Xpp3Dom messageSystemModule = new Xpp3Dom("ejbModule");
		Xpp3Dom groupId = new Xpp3Dom("groupId");
		groupId.setValue("co.com.tauLabs");
		Xpp3Dom artifactId = new Xpp3Dom("artifactId");
		artifactId.setValue("TauLabsMessagesEJB");
		messageSystemModule.addChild(groupId);
		messageSystemModule.addChild(artifactId);
		return messageSystemModule;
	}

	public static Xpp3Dom obtenerModuloReport() {
		Xpp3Dom reportModule = new Xpp3Dom("ejbModule");
		Xpp3Dom groupId = new Xpp3Dom("groupId");
		groupId.setValue("co.com.tauLabs");
		Xpp3Dom artifactId = new Xpp3Dom("artifactId");
		artifactId.setValue("TauLabsReportEJB");
		reportModule.addChild(groupId);
		reportModule.addChild(artifactId);
		return reportModule;
	}

}
