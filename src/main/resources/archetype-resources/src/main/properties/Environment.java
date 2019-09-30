#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.properties;

import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;

public class Environment {

    /**
     * Get properties
     *
     * @return EnvironmentProperties
     */
    public static EnvironmentProperties getProperties() {
        ConfigFactory.setProperty("env", System.getProperty("env", "test"));
        return ConfigCache.getOrCreate(EnvironmentProperties.class);
    }

}