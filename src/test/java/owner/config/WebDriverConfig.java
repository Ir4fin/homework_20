package owner.config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:${environment}.properties",
        "classpath:local.properties"
})

public interface WebDriverConfig extends Config {

    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("browser.remote")
    Boolean isBrowserRemote();

    @Key("remoteUrl")
    @DefaultValue("http://localhost:4444")
    String getRemoteURL();

}
