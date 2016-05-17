package uniandes.lineas.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.codehaus.plexus.util.xml.Xpp3Dom;

import repository.DependenciasSubis;
import uniandes.lineas.enums.FeaturesEnum;

public class Generador {

	public static void main(String args[]) {
		System.out.println("<-------------------- Iniciando generación de producto -------------------->");

		//
		try {
			Generador generador = new Generador();

			String rutaArchivo = "B:/archivo/Basic.txt";
			String pomFile = "C:/Users/ServioAndres/Desktop/Maestría u Andes/Fabricas de software/taller3/productGenerator/src/main/resources/pom.xml";
			String pomFileTarget = "B:/Subis/SubisTravel/SubisTravelContainer/SubisTravelCommonEAR/pom.xml";

			Model pomModel = generador.pomToObject(pomFile);

			FileReader f = new FileReader(rutaArchivo);
			BufferedReader b = new BufferedReader(f);
			BufferedWriter out = new BufferedWriter(new FileWriter(
					"B:/Subis/SubisTravel/SubisTravelContainer/SubisTravelCommon/src/main/java/co/com/tauLabs/enums/serviciosActivos.properties"));
			String feature = "";
			while ((feature = b.readLine()) != null) {
				System.out.println("Feature: " + feature);
				if (feature.equals(FeaturesEnum.COMMENTS_AND_RATINGS.getValor())) {
					System.out.println(
							"Se ha encontrado activo el feature Comments And Ratings, se implementará con la estrategia Condición sobre variable");
					out.write("COMMENTS_AND_RATINGS=true \n");
				} else if (feature.equals(FeaturesEnum.MESSAGE_SYSTEM.getValor())) {
					System.out.println(
							"Se ha encontrado activo el feature Message System, se implementará con la estrategia Maven build");
					pomModel.addDependency(DependenciasSubis.obtenerDependenciaMessageSystem());
					Xpp3Dom configuration = (Xpp3Dom) pomModel.getBuild().getPlugins().get(2).getConfiguration();
					configuration.getChild("modules").addChild(DependenciasSubis.obtenerModuloMessageSystem());
				} else if (feature.equals(FeaturesEnum.REPORTS.getValor())) {
					System.out.println(
							"Se ha encontrado activo el feature reports, se implementará con la estrategia Maven Build");
					pomModel.addDependency(DependenciasSubis.obtenerDependenciaReport());
					Xpp3Dom configuration = (Xpp3Dom) pomModel.getBuild().getPlugins().get(2).getConfiguration();
					configuration.getChild("modules").addChild(DependenciasSubis.obtenerModuloReport());
				} else if (feature.equals(FeaturesEnum.SOCIAL_AUTHENTICATION.getValor())) {
					System.out.println(
							"Se ha encontrado activo el feature Social Authentication, se implementará con la estrategia decorator");
					out.write("SOCIAL_AUTHENTICATION=true \n");
				} else if (feature.equals(FeaturesEnum.BASIC.getValor())) {
					System.out.println(
							"Se ha encontrado activo el feature Cliente basico, se implementará con la estrategia condición sobre variable");
					out.write("BASIC=true \n");
				} else if (feature.equals(FeaturesEnum.INTERMEDIATE.getValor())) {
					System.out.println(
							"Se ha encontrado activo el feature Cliente Intermedio, se implementará con la estrategia condición sobre variable");
					out.write("INTERMEDIATE=true \n");
				} else if (feature.equals(FeaturesEnum.PRO.getValor())) {
					System.out.println(
							"Se ha encontrado activo el feature Cliente pro, se implementará con la estrategia condición sobre variable");
					out.write("PRO=true \n");
				} else if (feature.equals(FeaturesEnum.QR.getValor())) {
					System.out.println(
							"Se ha encontrado activo el feature Codigo Qr, se implementará con la estrategia aspecto");
					out.write("QR=true \n");
				}
			}
			// Se sobreEscribe El pom;
			// Escritura del archivo de propiedades
			out.close();

			Writer w = new FileWriter(pomFileTarget);
			new MavenXpp3Writer().write(w, pomModel);
			b.close();
		} catch (Exception e) {
			System.out.println("Error, causa " + e.getCause());

		}

		System.out.println("<-------------------- Finalizando la generación del producto -------------------->");
	}

	public Model pomToObject(String pomFile) throws Exception {
		try {

			MavenXpp3Reader mavenreader = new MavenXpp3Reader();
			FileReader reader = new FileReader(pomFile);
			return mavenreader.read(reader);

		} catch (Exception e) {
			throw new Exception("Ha ocurrido un error al convertir el pom, causa: " + e.getMessage());
		}

	}

}
