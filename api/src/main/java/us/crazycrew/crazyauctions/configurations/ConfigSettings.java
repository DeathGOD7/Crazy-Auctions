package us.crazycrew.crazyauctions.configurations;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

/**
 * @author RyderBelserion
 * @author BadBones69
 *
 * Date: 3/4/2023
 * Time: 10:22 PM
 * Last Edited: 3/4/2023 @ 10:22 PM
 *
 * Description: The config.yml options.
 */
public class ConfigSettings implements SettingsHolder {

    // Empty constructor required by SettingsHolder
    public ConfigSettings() {}

    @Override
    public void registerComments(CommentsConfiguration conf) {
        String[] header = {
                "Support: https://discord.gg/crazycrew",
                "Github: https://github.com/Crazy-Crew",
                "",
                "Issues: https://github.com/Crazy-Crew/CrazyCrates/issues",
                "Features: https://github.com/Crazy-Crew/CrazyCrates/discussions",
                "",
                "Legacy color codes such as &7,&c no longer work. You must use MiniMessage",
                "https://docs.advntr.dev/minimessage/format.html#color"
        };

        String[] deprecation = {
                "",
                "Warning: This section is subject to change so it is considered deprecated.",
                "This is your warning before the change happens.",
                ""
        };

        conf.setComment("settings", header);
    }
}