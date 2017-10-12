package newbee.morningGlory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import sophia.foundation.util.PropertiesWrapper;

public class MorningGloryContextResolver {
	private static final Logger logger = Logger.getLogger(MorningGloryContextResolver.class.getName());
	private static final String GAME_SERVER_Properties_Path = "gameserver.properties";
	private PropertiesWrapper properties = null;

	MorningGloryContextResolver() {
		Properties p = new Properties();
		try {
			InputStream is = new FileInputStream("config/"+GAME_SERVER_Properties_Path);
			p.load(is);
		} catch (IOException e) {
			logger.error(GAME_SERVER_Properties_Path + " properties load failed.", e);
		}

		this.properties = new PropertiesWrapper(p);
	}

	PropertiesWrapper getProperty() {
		return this.properties;
	}
}
