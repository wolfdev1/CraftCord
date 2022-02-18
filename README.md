# CraftCord

**Features**

- Send Death, Join and Leave messages to the guild
- Send Minecraft messages to Discord
- Send Discord Messages to Minecraft

**How to use this**

- Clone this GitHub repository to a local git repository
```
$ git clone https://github.com/wolfdev1/SpigotDiscordPlugin.git
```
- Open the Config Class in the main package and set the values
```java
public class Config {
    public static String BOT_TOKEN = "Get your token at https://discord.com/developers/applications";
    public static String CHANNEL_ID = "940697475088547870"; //Example Text Channel Id
    public static String GAME_OF_ACTIVITY = "Minecraft Java"; //Example game status
}
```
- In IntelliJ click on the package option in the Maven Menu an its generate a jar in ./target and paste this file in your plugins folder at your server

