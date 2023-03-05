package us.crazycrew.crazyauctions.configurations;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

/**
 * @author RyderBelserion
 * @author BadBones69
 *
 * Date: 3/4/2023
 * Time: Unknown
 * Last Edited: 3/4/2023 @ 10:23 PM
 *
 * Description: The locale file.
 */
public class LocaleSettings implements SettingsHolder {

    // Empty constructor required by SettingsHolder
    public LocaleSettings() {}

    @Override
    public void registerComments(CommentsConfiguration conf) {
        String[] header = {
                "Support: https://discord.gg/crazycrew",
                "Github: https://github.com/Crazy-Crew",
                "",
                "Issues: https://github.com/Crazy-Crew/CrazyAuctions/issues",
                "Features: https://github.com/Crazy-Crew/CrazyAuctions/discussions",
                "",
                "We need translations for this locale file. Please don't hesitate to submit any."
        };

        conf.setComment("misc", header);
    }
}