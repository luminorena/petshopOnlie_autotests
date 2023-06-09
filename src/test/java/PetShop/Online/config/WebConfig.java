package PetShop.Online.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {
    @DefaultValue("FIREFOX")
    @Key("browser")
    String browser();

    @DefaultValue("112")
    @Key("browserVersion")
    String browserVersion();

    @Key("remoteWebDriverUrl")
    String remoteWebDriverUrl();

    @Key("baseUrl")
    @DefaultValue("https://www.petshop.ru")
    String baseUrl();

}
