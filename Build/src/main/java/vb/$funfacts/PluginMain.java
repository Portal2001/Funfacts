package vb.$funfacts;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getDataFolder().mkdir();
		getServer().getPluginManager().registerEvents(this, this);
		try {
			((org.bukkit.command.CommandSender) (Object) org.bukkit.Bukkit.getConsoleSender()).sendMessage(
					ChatColor.translateAlternateColorCodes('&', "&2yo you are cool plugin is enabled!!!!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		try {
			((org.bukkit.command.CommandSender) (Object) org.bukkit.Bukkit.getConsoleSender())
					.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2yo i will miss you!!!!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("fact")) {
			try {
				commandSender.sendMessage(String.valueOf(new ArrayList(Arrays.asList(
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The first version of Minecraft (known as Cave Game at the time) was created in six days. Six. 10 May 2009 to 16 May 2009."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Minecraft was created by Swedish designer and programmer Markus Persson (known as \"Notch\" by fans). He wanted Minecraft to allow exploration of the virtual world that was free and organic, for his new company, Mojang AB."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The full version of Minecraft was completed on 18 November 2011, after which it was first released and made known to the world."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6What is known as Minecraft was originally called Cave Game, then Minecraft: Order of the Stone, before simply Minecraft."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The sounds that Ghasts make comes from a sleeping cat. Namely, Minecraft's music producer Daniel 'C418' Rosenfeld's cat, who was accidentally recorded waking from sleep."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Minecraft was inspired by other known computer games, such as Dungeon Keeper, RollerCoaster Tycoon, Infiniminer and Dwarf Fortress."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6A creeper was initially supposed to be a pig. Persson switched the height and length of a creeper by mistake when inputting the code."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The original Enderman had green eyes. The mobs from the land of Ender now have purple eyes and, still, only attack when aggravated by a player."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The crafting table in Minecraft, where players create a number of items and blocks, was formerly called workbench."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6There was once going to be a Sky Dimension in Minecraft, in addition to the others: The End, Far Lands, Overworld, Void, Outer End and The Nether. Before the idea was scrapped, it was going to be the opposite of The Nether."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Once in every 10,000 times you play Minecraft, the menu at the start will flash a misspelling of its name - you'll see \"Minceraft\" instead of \"Minecraft\"."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&61 block is 1 cubic metre (the size of a cube that is 1 metre long, 1 metre wide and 1 metre high)."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Persson's avatar in the game is the only one who drops an apple when he dies."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Creepers are afraid of ocelots (wild cat mobs which are passive, but attack chickens in Minecraft)."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Microsoft purchased Minecraft for 2.5 billion dollars (1.9 billion pounds) in 2014."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Normally, the hostile zombie mobs burn during the day. The exception to this is if they are in a cobweb - a type of block which slows down movement."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Many think Minecraft is infinite, and that players can keep venturing further and further out in their world. However, if a player does so, they will eventually arrive at the \"World Boundary\", where they won't be able to go any further."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The World Boundary has several layers to block players from getting past. After getting past the first two layers, the game will crash."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Around 126 million people people play Minecraft every month."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Over 200 million copies of Minecraft have been sold worldwide."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Minecraft is compulsory education for 13-year-olds at Viktor Rydberg secondary school in Stockholm, Sweden. This is said to be because it helps to teach city planning, planning for the future, and environmental issues."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The Enderman language is the English language backwards, and sometimes just at a lower pitch. Yep, it was English all along."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6A scale replica of the entire country of Denmark has been created in Minecraft. This was done by Simon Kokkendorf and Thorbjorn Nielsen of the Danish Geodata Agency."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The Rarest item in Minecraft is the Dragon Egg. It will only appear when the Ender Dragon has been defeated, at which point, the Dragon Egg will appear on the exit portal. If there aren't any air blocks to teleport into, the egg may be mined."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The diamond ore block, emerald ore block and pink wool block are among the rarest to mine in the game, like (but after) the Dragon Egg."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6A fishing rod can be used to hook more than just fish! It can hook treasure, mobs and even other players."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6One day in Minecraft is 20 minutes in real-time."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6A good way for a player to block out hostile mobs is to build a fence around their farm, as they can't climb over fences."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6If a player needs easy access to their farm that has a fence around it, they can lay a carpet on top of it! They'll be able to climb over but the mobs won't"),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6There are six types of mob: the utility mob, boss mob, hostile mob, neutral mob, tamable mob, and the passive mob."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Not all mobs are harmful. Utility mobs were created to protect villagers and players in the game from the hostile mobs. The Iron Golem and Snow Golem are examples of utility mobs."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The boss mobs in Minecraft are the strongest and most powerful mobs. At present, these are the Enderdragon and Wither."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The Skeleton Horseman, Evoker, Ghast, and Phantom are examples of hostile mobs - they'll attack any player in sight at any time!"),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The higher a wolf's tail in the game, the healthier it is."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Neutral mobs only attack when provoked; their aggressiveness must be triggered. The panda, bee and dolphin are examples of neutral mobs."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Tameable mobs in Minecraft can become a player's pet. Examples of these are the donkey, mule, trader llama, llama, wolf, cat, parrot, horse, and the skeleton horse."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The passive mobs are non-violent (hence the name). The turtle, chicken, horse, and donkey are a few of the passive mobs in Minecraft. Even when they are provoked, they'll run from danger."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Creepers in Minecraft detonate because they get very nervous and shake a lot, setting themselves off in a similar way to how the rubbing of two sticks starts a fire."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6One of the many useful things to build in Minecraft is a smoker, as it cooks food twice as quickly as a furnace."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Did you know that Minecraft can be enjoyed by players aged three and up (including adults)?"),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6There's a \"Peaceful Mode\" without mobs (hostile, non-player characters, like creepers, zombies and animals) which makes the game less violent for the younger ones."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6There are 107 Minecraft achievements in the game.till 2020 only."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Enderman is a three-block-tall mob that brings chaos in the game."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The ambient background music and sound effects of Minecraft were produced by a German Musician named Daniel Rosenfeld or much known as C418 (C4-Eighteen)."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6As of this writing, 176 million people have purchased Minecraft with 200 million registered users (and still growing). till 2020."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6US is the #1 country that plays Minecraft."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6It takes around 1 GB on average to install Minecraft."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6Minecraft\u2019s creation was inspired by other games such as Dwarf Fortress, Dungeon Keeper, Infiniminer, and RollerCoaster Tycoon. Hence, Markus Persson was inspired to match its creativity for Role-Playing Games."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The Enderman mobs have their language. It talks in English but backwards. Moreover, the \u201CEnderian Language\u201D has a British accent played in a lowered pitch."),
						ChatColor.translateAlternateColorCodes('&',
								"&c==>&6The Ghast mob of Minecraft is the second-largest mob in the game.")))
										.get(java.util.concurrent.ThreadLocalRandom.current().nextInt(
												new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&',
														"&c==>&6The first version of Minecraft (known as Cave Game at the time) was created in six days. Six. 10 May 2009 to 16 May 2009."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Minecraft was created by Swedish designer and programmer Markus Persson (known as \"Notch\" by fans). He wanted Minecraft to allow exploration of the virtual world that was free and organic, for his new company, Mojang AB."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The full version of Minecraft was completed on 18 November 2011, after which it was first released and made known to the world."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6What is known as Minecraft was originally called Cave Game, then Minecraft: Order of the Stone, before simply Minecraft."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The sounds that Ghasts make comes from a sleeping cat. Namely, Minecraft's music producer Daniel 'C418' Rosenfeld's cat, who was accidentally recorded waking from sleep."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Minecraft was inspired by other known computer games, such as Dungeon Keeper, RollerCoaster Tycoon, Infiniminer and Dwarf Fortress."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6A creeper was initially supposed to be a pig. Persson switched the height and length of a creeper by mistake when inputting the code."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The original Enderman had green eyes. The mobs from the land of Ender now have purple eyes and, still, only attack when aggravated by a player."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The crafting table in Minecraft, where players create a number of items and blocks, was formerly called workbench."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6There was once going to be a Sky Dimension in Minecraft, in addition to the others: The End, Far Lands, Overworld, Void, Outer End and The Nether. Before the idea was scrapped, it was going to be the opposite of The Nether."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Once in every 10,000 times you play Minecraft, the menu at the start will flash a misspelling of its name - you'll see \"Minceraft\" instead of \"Minecraft\"."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&61 block is 1 cubic metre (the size of a cube that is 1 metre long, 1 metre wide and 1 metre high)."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Persson's avatar in the game is the only one who drops an apple when he dies."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Creepers are afraid of ocelots (wild cat mobs which are passive, but attack chickens in Minecraft)."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Microsoft purchased Minecraft for 2.5 billion dollars (1.9 billion pounds) in 2014."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Normally, the hostile zombie mobs burn during the day. The exception to this is if they are in a cobweb - a type of block which slows down movement."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Many think Minecraft is infinite, and that players can keep venturing further and further out in their world. However, if a player does so, they will eventually arrive at the \"World Boundary\", where they won't be able to go any further."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The World Boundary has several layers to block players from getting past. After getting past the first two layers, the game will crash."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Around 126 million people people play Minecraft every month."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Over 200 million copies of Minecraft have been sold worldwide."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Minecraft is compulsory education for 13-year-olds at Viktor Rydberg secondary school in Stockholm, Sweden. This is said to be because it helps to teach city planning, planning for the future, and environmental issues."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The Enderman language is the English language backwards, and sometimes just at a lower pitch. Yep, it was English all along."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6A scale replica of the entire country of Denmark has been created in Minecraft. This was done by Simon Kokkendorf and Thorbjorn Nielsen of the Danish Geodata Agency."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The Rarest item in Minecraft is the Dragon Egg. It will only appear when the Ender Dragon has been defeated, at which point, the Dragon Egg will appear on the exit portal. If there aren't any air blocks to teleport into, the egg may be mined."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The diamond ore block, emerald ore block and pink wool block are among the rarest to mine in the game, like (but after) the Dragon Egg."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6A fishing rod can be used to hook more than just fish! It can hook treasure, mobs and even other players."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6One day in Minecraft is 20 minutes in real-time."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6A good way for a player to block out hostile mobs is to build a fence around their farm, as they can't climb over fences."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6If a player needs easy access to their farm that has a fence around it, they can lay a carpet on top of it! They'll be able to climb over but the mobs won't"),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6There are six types of mob: the utility mob, boss mob, hostile mob, neutral mob, tamable mob, and the passive mob."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Not all mobs are harmful. Utility mobs were created to protect villagers and players in the game from the hostile mobs. The Iron Golem and Snow Golem are examples of utility mobs."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The boss mobs in Minecraft are the strongest and most powerful mobs. At present, these are the Enderdragon and Wither."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The Skeleton Horseman, Evoker, Ghast, and Phantom are examples of hostile mobs - they'll attack any player in sight at any time!"),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The higher a wolf's tail in the game, the healthier it is."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Neutral mobs only attack when provoked; their aggressiveness must be triggered. The panda, bee and dolphin are examples of neutral mobs."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Tameable mobs in Minecraft can become a player's pet. Examples of these are the donkey, mule, trader llama, llama, wolf, cat, parrot, horse, and the skeleton horse."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The passive mobs are non-violent (hence the name). The turtle, chicken, horse, and donkey are a few of the passive mobs in Minecraft. Even when they are provoked, they'll run from danger."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Creepers in Minecraft detonate because they get very nervous and shake a lot, setting themselves off in a similar way to how the rubbing of two sticks starts a fire."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6One of the many useful things to build in Minecraft is a smoker, as it cooks food twice as quickly as a furnace."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Did you know that Minecraft can be enjoyed by players aged three and up (including adults)?"),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6There's a \"Peaceful Mode\" without mobs (hostile, non-player characters, like creepers, zombies and animals) which makes the game less violent for the younger ones."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6There are 107 Minecraft achievements in the game.till 2020 only."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Enderman is a three-block-tall mob that brings chaos in the game."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The ambient background music and sound effects of Minecraft were produced by a German Musician named Daniel Rosenfeld or much known as C418 (C4-Eighteen)."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6As of this writing, 176 million people have purchased Minecraft with 200 million registered users (and still growing). till 2020."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6US is the #1 country that plays Minecraft."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6It takes around 1 GB on average to install Minecraft."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6Minecraft\u2019s creation was inspired by other games such as Dwarf Fortress, Dungeon Keeper, Infiniminer, and RollerCoaster Tycoon. Hence, Markus Persson was inspired to match its creativity for Role-Playing Games."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The Enderman mobs have their language. It talks in English but backwards. Moreover, the \u201CEnderian Language\u201D has a British accent played in a lowered pitch."),
														ChatColor.translateAlternateColorCodes('&',
																"&c==>&6The Ghast mob of Minecraft is the second-largest mob in the game.")))
																		.size()))));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}
}
