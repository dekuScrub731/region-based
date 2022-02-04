package com.regionbased;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import lombok.Getter;


@Getter
enum RegionBasedDefinition
{

	// Bosses
	BOSS_ABYSSAL_SIRE("Abyssal Sire", RegionBasedAreaType.BOSSES, 11851, 11850, 12363, 12362),
	BOSS_CERBERUS("Cerberus", RegionBasedAreaType.BOSSES, 4883, 5140, 5395),
	BOSS_COMMANDER_ZILYANA("Commander Zilyana", RegionBasedAreaType.BOSSES, 11602),
	BOSS_CORP("Corporeal Beast", RegionBasedAreaType.BOSSES, 11842, 11844),
	BOSS_DKS("Dagannoth Kings", RegionBasedAreaType.BOSSES, 11588, 11589),
	BOSS_GENERAL_GRAARDOR("General Graardor", RegionBasedAreaType.BOSSES, 11347),
	BOSS_GIANT_MOLE("Giant Mole", RegionBasedAreaType.BOSSES, 6993, 6992),
	BOSS_GROTESQUE_GUARDIANS("Grotesque Guardians", RegionBasedAreaType.BOSSES, 6727),
	BOSS_HESPORI("Hespori", RegionBasedAreaType.BOSSES, 5021),
	BOSS_HYDRA("Alchemical Hydra", RegionBasedAreaType.BOSSES, 5536),
	BOSS_KQ("Kalphite Queen", RegionBasedAreaType.BOSSES, 13972),
	BOSS_KRAKEN("Kraken", RegionBasedAreaType.BOSSES, 9116),
	BOSS_KREEARRA("Kree'arra", RegionBasedAreaType.BOSSES, 11346),
	BOSS_KRIL_TSUTSAROTH("K'ril Tsutsaroth", RegionBasedAreaType.BOSSES, 11603),
	BOSS_NEX("Nex", RegionBasedAreaType.BOSSES, 11601),
	BOSS_NIGHTMARE("Nightmare of Ashihama", RegionBasedAreaType.BOSSES, 15515),
	BOSS_SARACHNIS("Sarachnis", RegionBasedAreaType.BOSSES, 7322),
	BOSS_SKOTIZO("Skotizo", RegionBasedAreaType.BOSSES, 6810),
	BOSS_SMOKE_DEVIL("Thermonuclear smoke devil", RegionBasedAreaType.BOSSES, 9363, 9619),
	BOSS_TEMPOROSS("Tempoross", RegionBasedAreaType.BOSSES, 12078),
	BOSS_VORKATH("Vorkath", RegionBasedAreaType.BOSSES, 9023),
	BOSS_WINTERTODT("Wintertodt", RegionBasedAreaType.BOSSES, 6462),
	BOSS_ZALCANO("Zalcano", RegionBasedAreaType.BOSSES, 12126),
	BOSS_ZULRAH("Zulrah", RegionBasedAreaType.BOSSES, 9007),

	// Cities
	CITY_AL_KHARID("Al Kharid" , RegionBasedAreaType.CITIES, 13105, 13106),
	CITY_ARCEUUS_HOUSE("Arceuus" , RegionBasedAreaType.CITIES, 6458, 6459, 6460, 6714, 6715),
	CITY_ARDOUGNE("Ardougne" , RegionBasedAreaType.CITIES, 9779, 9780, 10035, 10036, 10291, 10292, 10547, 10548),
	CITY_BANDIT_CAMP("Bandit Camp" , RegionBasedAreaType.CITIES, 12590),
	CITY_BARBARIAN_OUTPOST("Barbarian Outpost", RegionBasedAreaType.CITIES, 10039),
	CITY_BARBARIAN_VILLAGE("Barbarian Village" , RegionBasedAreaType.CITIES, 12341),
	CITY_BEDABIN_CAMP("Bedabin Camp" , RegionBasedAreaType.CITIES, 12591),
	CITY_BRIMHAVEN("Brimhaven" , RegionBasedAreaType.CITIES, 11057, 11058),
	CITY_BURGH_DE_ROTT("Burgh de Rott" , RegionBasedAreaType.CITIES, 13874, 13873, 14130, 14129),
	CITY_BURTHORPE("Burthorpe" , RegionBasedAreaType.CITIES, 11319, 11575),
	CITY_CANIFIS("Canifis" , RegionBasedAreaType.CITIES, 13878),
	CITY_CATHERBY("Catherby" , RegionBasedAreaType.CITIES, 11317, 11318, 11061),
	CITY_CORSAIR_COVE("Corsair Cove" , RegionBasedAreaType.CITIES, 10028, 10284),
	CITY_DARKMEYER("Darkmeyer", RegionBasedAreaType.CITIES, 14388, 14644),
	CITY_DORGESH_KAAN("Dorgesh-Kaan" , RegionBasedAreaType.CITIES, 10835, 10834),
	CITY_DRAYNOR("Draynor" , RegionBasedAreaType.CITIES, 12338, 12339),
	CITY_EDGEVILLE("Edgeville" , RegionBasedAreaType.CITIES, 12342),
	CITY_ENTRANA("Entrana" , RegionBasedAreaType.CITIES, 11060, 11316),
	CITY_ETCETERIA("Etceteria", RegionBasedAreaType.CITIES, 10300),
	CITY_FALADOR("Falador" , RegionBasedAreaType.CITIES, 11828, 11572, 11827, 12084),
	CITY_GUTANOTH("Gu'Tanoth" , RegionBasedAreaType.CITIES, 10031),
	CITY_GWENITH("Gwenith", RegionBasedAreaType.CITIES, 8757),
	CITY_HOSIDIUS_HOUSE("Hosidius" , RegionBasedAreaType.CITIES, 6710, 6711, 6712, 6455, 6456, 6966, 6967, 6968, 7221, 7223, 7224, 7478, 7479),
	CITY_JATIZSO("Jatizso" , RegionBasedAreaType.CITIES, 9531),
	CITY_KELDAGRIM("Keldagrim" , RegionBasedAreaType.CITIES, 11423, 11422, 11679, 11678),
	CITY_LANDS_END("Land's End", RegionBasedAreaType.CITIES, 5941),
	CITY_LLETYA("Lletya" , RegionBasedAreaType.CITIES, 9265, 11103),
	CITY_LOVAKENGJ_HOUSE("Lovakengj" , RegionBasedAreaType.CITIES, 5692, 5691, 5947, 6203, 6202, 5690, 5946),
	CITY_LUMBRIDGE("Lumbridge" , RegionBasedAreaType.CITIES, 12850),
	CITY_LUNAR_ISLE("Lunar Isle" , RegionBasedAreaType.CITIES, 8253, 8252, 8509, 8508),
	CITY_MARIM("Marim", RegionBasedAreaType.REGIONS, 11051),
	CITY_MEIYERDITCH("Meiyerditch" , RegionBasedAreaType.CITIES, 14132, 14387, 14386, 14385),
	CITY_MENAPHOS("Menaphos", RegionBasedAreaType.CITIES, 12843),
	CITY_MISCELLANIA("Miscellania" , RegionBasedAreaType.CITIES, 10044),
	CITY_MOR_UL_REK("Mor Ul Rek" , RegionBasedAreaType.CITIES, 9808, 9807, 10064, 10063),
	CITY_MORTTON("Mort'ton" , RegionBasedAreaType.CITIES, 13875),
	CITY_MOS_LE_HARMLESS("Mos Le'Harmless" , RegionBasedAreaType.CITIES, 14637, 14638, 14639, 14894, 14895, 15151, 15406, 15407),
	CITY_MOUNT_KARUULM("Mount Karuulm", RegionBasedAreaType.CITIES, 5179, 4923, 5180),
	CITY_MOUNTAIN_CAMP("Mountain Camp", RegionBasedAreaType.CITIES, 11065),
	CITY_MYNYDD("Mynydd", RegionBasedAreaType.CITIES, 8501),
	CITY_NARDAH("Nardah" , RegionBasedAreaType.CITIES, 13613),
	CITY_NEITIZNOT("Neitiznot" , RegionBasedAreaType.CITIES, 9275),
	CITY_PISCARILIUS_HOUSE("Port Piscarilius" , RegionBasedAreaType.CITIES, 6969, 6971, 7227, 6970, 7225, 7226),
	CITY_PISCATORIS("Piscatoris" , RegionBasedAreaType.CITIES, 9273),
	CITY_POLLNIVNEACH("Pollnivneach" , RegionBasedAreaType.CITIES, 13358),
	CITY_PORT_KHAZARD("Port Khazard" , RegionBasedAreaType.CITIES, 10545),
	CITY_PORT_PHASMATYS("Port Phasmatys" , RegionBasedAreaType.CITIES, 14646),
	CITY_PORT_SARIM("Port Sarim" , RegionBasedAreaType.CITIES, 12081, 12082),
	CITY_PRIFDDINAS("Prifddinas", RegionBasedAreaType.CITIES, 8499, 8500, 8755, 8756, 9011, 9012, 9013, 12894, 12895, 13150, 13151),
	CITY_RELLEKKA("Rellekka" , RegionBasedAreaType.CITIES, 10297, 10553),
	CITY_RIMMINGTON("Rimmington" , RegionBasedAreaType.CITIES, 11826, 11570),
	CITY_SEERS_VILLAGE("Seers' Village" , RegionBasedAreaType.CITIES, 10806),
	CITY_SHAYZIEN_HOUSE("Shayzien" , RegionBasedAreaType.CITIES, 5944, 5943, 6200, 6199, 5686, 5687, 5688, 5689, 5945),
	CITY_SHILO_VILLAGE("Shilo Village" , RegionBasedAreaType.CITIES, 11310),
	CITY_SLEPE("Slepe", RegionBasedAreaType.CITIES, 14643, 14899, 14900, 14901),
	CITY_SOPHANEM("Sophanem" , RegionBasedAreaType.CITIES, 13099),
	CITY_TAI_BWO_WANNAI("Tai Bwo Wannai" , RegionBasedAreaType.CITIES, 11056, 11055),
	CITY_TAVERLEY("Taverley" , RegionBasedAreaType.CITIES, 11574, 11573),
	CITY_TREE_GNOME_STRONGHOLD("Tree Gnome Stronghold" , RegionBasedAreaType.CITIES, 9525, 9526, 9782, 9781),
	CITY_TREE_GNOME_VILLAGE("Tree Gnome Village" , RegionBasedAreaType.CITIES, 10033),
	CITY_TROLL_STRONGHOLD("Troll Stronghold" , RegionBasedAreaType.CITIES, 11321, 11421),
	CITY_UZER("Uzer" , RegionBasedAreaType.CITIES, 13872),
	CITY_VARROCK("Varrock" , RegionBasedAreaType.CITIES, 12596, 12597, 12852, 12853, 12854, 13108, 13109, 13110),
	CITY_VER_SINHAZA("Ver Sinhaza", RegionBasedAreaType.CITIES, 14642),
	CITY_VOID_OUTPOST("Void Knights' Outpost", RegionBasedAreaType.CITIES, 10537),
	CITY_WEISS("Weiss", RegionBasedAreaType.CITIES, 11325, 11581),
	CITY_WITCHHAVEN("Witchaven" , RegionBasedAreaType.CITIES, 10803),
	CITY_YANILLE("Yanille" , RegionBasedAreaType.CITIES, 10288, 10032),
	CITY_ZANARIS("Zanaris" , RegionBasedAreaType.CITIES, 9285, 9541, 9540, 9797),
	CITY_ZULANDRA("Zul-Andra" , RegionBasedAreaType.CITIES, 8495, 8751),

	// Dungeons
	DUNGEON_ABANDONED_MINE("Abandoned Mine", RegionBasedAreaType.DUNGEONS, 13618, 13718, 11079, 11078, 11077, 10823, 10822, 10821),
	DUNGEON_AH_ZA_RHOON("Ah Za Rhoon", RegionBasedAreaType.DUNGEONS, 11666),
	DUNGEON_ANCIENT_CAVERN("Ancient Cavern", RegionBasedAreaType.DUNGEONS, 6483, 6995),
	DUNGEON_APE_ATOLL("Ape Atoll Dungeon", RegionBasedAreaType.DUNGEONS, 11150, 10894),
	DUNGEON_APE_ATOLL_BANANA_PLANTATION("Ape Atoll Banana Plantation", RegionBasedAreaType.DUNGEONS, 10895),
	DUNGEON_ARDY_BASEMENT("West Ardougne Basement", RegionBasedAreaType.DUNGEONS, 10135),
	DUNGEON_ARDY_SEWERS("Ardougne Sewers", RegionBasedAreaType.DUNGEONS, 10134, 10136, 10391, 10647),
	DUNGEON_ASGARNIAN_ICE_CAVES("Asgarnian Ice Caves", RegionBasedAreaType.DUNGEONS, 11925, 12181),
	DUNGEON_BERVIRIUS_TOMB("Tomb of Bervirius", RegionBasedAreaType.DUNGEONS, 11154),
	DUNGEON_BRIMHAVEN("Brimhaven Dungeon", RegionBasedAreaType.DUNGEONS, 10901, 10900, 10899, 10645, 10644, 10643),
	DUNGEON_BRINE_RAT_CAVERN("Brine Rat Cavern", RegionBasedAreaType.DUNGEONS, 10910),
	DUNGEON_CATACOMBS_OF_KOUREND("Catacombs of Kourend", RegionBasedAreaType.DUNGEONS, 6557, 6556, 6813, 6812),
	DUNGEON_CHAMPIONS_CHALLENGE("Champions' Challenge", RegionBasedAreaType.DUNGEONS, 12696),
	DUNGEON_CHAOS_DRUID_TOWER("Chaos Druid Tower", RegionBasedAreaType.DUNGEONS, 10392),
	DUNGEON_CHASM_OF_FIRE("Chasm of Fire", RegionBasedAreaType.DUNGEONS, 5789),
	DUNGEON_CHASM_OF_TEARS("Chasm of Tears", RegionBasedAreaType.DUNGEONS, 12948),
	DUNGEON_CHINCHOMPA("Chinchompa Hunting Ground", RegionBasedAreaType.DUNGEONS, 10129),
	DUNGEON_CLOCK_TOWER("Clock Tower Basement", RegionBasedAreaType.DUNGEONS, 10390),
	DUNGEON_CORSAIR_COVE("Corsair Cove Dungeon", RegionBasedAreaType.DUNGEONS, 8076, 8332),
	DUNGEON_CRABCLAW_CAVES("Crabclaw Caves", RegionBasedAreaType.DUNGEONS, 6553, 6809),
	DUNGEON_CRANDOR("Crandor Dungeon", RegionBasedAreaType.DUNGEONS, 11414),
	DUNGEON_CRASH_SITE_CAVERN("Crash Site Cavern", RegionBasedAreaType.DUNGEONS, 8280, 8536),
	DUNGEON_CRUMBLING_TOWER("Crumbling Tower", RegionBasedAreaType.DUNGEONS, 7827),
	DUNGEON_DAEYALT_ESSENCE_MINE("Daeyalt Essence Mine", RegionBasedAreaType.DUNGEONS, 14744),
	DUNGEON_DIGSITE("Digsite Dungeon", RegionBasedAreaType.DUNGEONS, 13464, 13465),
	DUNGEON_DORGESHKAAN("Dorgesh-Kaan South Dungeon", RegionBasedAreaType.DUNGEONS, 10833),
	DUNGEON_DORGESHUUN_MINES("Dorgeshuun Mines", RegionBasedAreaType.DUNGEONS, 12950, 13206),
	DUNGEON_DRAYNOR_SEWERS("Draynor Sewers", RegionBasedAreaType.DUNGEONS, 12439, 12438),
	DUNGEON_DWARVEN_MINES("Dwarven Mines", RegionBasedAreaType.DUNGEONS, 12185, 12184, 12183),
	DUNGEON_EAGLES_PEAK("Eagles' Peak Dungeon", RegionBasedAreaType.DUNGEONS, 8013),
	DUNGEON_ECTOFUNTUS("Ectofuntus", RegionBasedAreaType.DUNGEONS, 14746),
	DUNGEON_EDGEVILLE("Edgeville Dungeon", RegionBasedAreaType.DUNGEONS, 12441, 12442, 12443, 12698),
	DUNGEON_ELEMENTAL_WORKSHOP("Elemental Workshop", RegionBasedAreaType.DUNGEONS, 10906, 7760),
	DUNGEON_ELVEN_RABBIT_CAVE("Elven rabbit cave", RegionBasedAreaType.DUNGEONS, 13252),
	DUNGEON_ENAKHRAS_TEMPLE("Enakhra's Temple", RegionBasedAreaType.DUNGEONS, 12423),
	DUNGEON_EVIL_CHICKENS_LAIR("Evil Chicken's Lair", RegionBasedAreaType.DUNGEONS, 9796),
	DUNGEON_EXPERIMENT_CAVE("Experiment Cave", RegionBasedAreaType.DUNGEONS, 14235, 13979),
	DUNGEON_FEROX_ENCLAVE("Ferox Enclave Dungeon", RegionBasedAreaType.DUNGEONS, 12700),
	DUNGEON_FORTHOS("Forthos Dungeon", RegionBasedAreaType.DUNGEONS, 7323),
	DUNGEON_FREMENNIK_SLAYER("Fremennik Slayer Dungeon", RegionBasedAreaType.DUNGEONS, 10907, 10908, 11164),
	DUNGEON_GLARIALS_TOMB("Glarial's Tomb", RegionBasedAreaType.DUNGEONS, 10137),
	DUNGEON_GOBLIN_CAVE("Goblin Cave", RegionBasedAreaType.DUNGEONS, 10393),
	DUNGEON_GRAND_TREE_TUNNELS("Grand Tree Tunnels", RegionBasedAreaType.DUNGEONS, 9882),
	DUNGEON_HAM_HIDEOUT("H.A.M. Hideout", RegionBasedAreaType.DUNGEONS, 12694),
	DUNGEON_HAM_STORE_ROOM("H.A.M. Store room", RegionBasedAreaType.DUNGEONS, 10321),
	DUNGEON_HEROES_GUILD("Heroes' Guild Mine", RegionBasedAreaType.DUNGEONS, 11674),
	DUNGEON_IORWERTH("Iorwerth Dungeon", RegionBasedAreaType.DUNGEONS, 12737, 12738, 12993, 12994),
	DUNGEON_ISLE_OF_SOULS("Isle of Souls Dungeon", RegionBasedAreaType.DUNGEONS, 8593),
	DUNGEON_JATIZSO_MINES("Jatizso Mines", RegionBasedAreaType.DUNGEONS, 9631),
	DUNGEON_JIGGIG_BURIAL_TOMB("Jiggig Burial Tomb", RegionBasedAreaType.DUNGEONS, 9875, 9874),
	DUNGEON_JOGRE("Jogre Dungeon", RegionBasedAreaType.DUNGEONS, 11412),
	DUNGEON_KARAMJA("Karamja Dungeon", RegionBasedAreaType.DUNGEONS, 11413),
	DUNGEON_KARUULM("Karuulm Slayer Dungeon", RegionBasedAreaType.DUNGEONS, 5280, 5279, 5023, 5535, 5022, 4766, 4510, 4511, 4767, 4768, 4512),
	DUNGEON_KGP_HEADQUARTERS("KGP Headquarters", RegionBasedAreaType.DUNGEONS, 10658),
	DUNGEON_KRUK("Kruk's Dungeon", RegionBasedAreaType.DUNGEONS, 9358, 9359, 9360, 9615, 9616, 9871, 10125, 10126, 10127, 10128, 10381, 10382, 10383, 10384, 10637, 10638, 10639, 10640),
	DUNGEON_LEGENDS_GUILD("Legends' Guild Dungeon", RegionBasedAreaType.DUNGEONS, 10904),
	DUNGEON_LIGHTHOUSE("Lighthouse", RegionBasedAreaType.DUNGEONS, 10140),
	DUNGEON_LIZARDMAN_CAVES("Lizardman Caves", RegionBasedAreaType.DUNGEONS, 5275),
	DUNGEON_LIZARDMAN_TEMPLE("Lizardman Temple", RegionBasedAreaType.DUNGEONS, 5277),
	DUNGEON_LUMBRIDGE_SWAMP_CAVES("Lumbridge Swamp Caves", RegionBasedAreaType.DUNGEONS, 12693, 12949),
	DUNGEON_LUNAR_ISLE_MINE("Lunar Isle Mine", RegionBasedAreaType.DUNGEONS, 9377),
	DUNGEON_MANIACAL_HUNTER("Maniacal Monkey Hunter Area", RegionBasedAreaType.DUNGEONS, 11662),
	DUNGEON_MEIYERDITCH_MINE("Meiyerditch Mine", RegionBasedAreaType.DUNGEONS, 9544),
	DUNGEON_MISCELLANIA("Miscellania Dungeon", RegionBasedAreaType.DUNGEONS, 10144, 10400),
	DUNGEON_MOGRE_CAMP("Mogre Camp", RegionBasedAreaType.DUNGEONS, 11924),
	DUNGEON_MOS_LE_HARMLESS_CAVES("Mos Le'Harmless Caves", RegionBasedAreaType.DUNGEONS, 14994, 14995, 15251),
	DUNGEON_MOTHERLODE_MINE("Motherlode Mine", RegionBasedAreaType.DUNGEONS, 14679, 14680, 14681, 14935, 14936, 14937, 15191, 15192, 15193),
	DUNGEON_MOURNER_TUNNELS("Mourner Tunnels", RegionBasedAreaType.DUNGEONS, 7752, 8008),
	DUNGEON_MOUSE_HOLE("Mouse Hole", RegionBasedAreaType.DUNGEONS, 9046),
	DUNGEON_MYREDITCH_LABORATORIES("Myreditch Laboratories", RegionBasedAreaType.DUNGEONS, 14232, 14233, 14487, 14488),
	DUNGEON_MYREQUE("Myreque Hideout", RegionBasedAreaType.DUNGEONS, 13721, 13974, 13977, 13978),
	DUNGEON_MYTHS_GUILD("Myths' Guild Dungeon", RegionBasedAreaType.DUNGEONS, 7564, 7820, 7821),
	DUNGEON_OBSERVATORY("Observatory Dungeon", RegionBasedAreaType.DUNGEONS, 9362),
	DUNGEON_OGRE_ENCLAVE("Ogre Enclave", RegionBasedAreaType.DUNGEONS, 10387),
	DUNGEON_OURANIA("Ourania Cave", RegionBasedAreaType.DUNGEONS, 12119),
	DUNGEON_QUIDAMORTEM_CAVE("Quidamortem Cave", RegionBasedAreaType.DUNGEONS, 4763),
	DUNGEON_RASHILIYIAS_TOMB("Rashiliyta's Tomb", RegionBasedAreaType.DUNGEONS, 11668),
	DUNGEON_RUINS_OF_CAMDOZAAL("Ruins of Camdozaal", RegionBasedAreaType.DUNGEONS, 11609, 11610, 11611, 11865, 11866, 11867, 12121, 12122, 12123),
	DUNGEON_SALT_MINE("Salt Mine", RegionBasedAreaType.DUNGEONS, 11425),
	DUNGEON_SARADOMINSHRINE("Saradomin Shrine (Paterdomus)", RegionBasedAreaType.DUNGEONS, 13722),
	DUNGEON_SHADE_CATACOMBS("Shade Catacombs", RegionBasedAreaType.DUNGEONS, 13975),
	DUNGEON_SHADOW("Shadow Dungeon", RegionBasedAreaType.DUNGEONS, 10575, 10831),
	DUNGEON_SHAYZIEN_CRYPTS("Shayzien Crypts", RegionBasedAreaType.DUNGEONS, 6043),
	DUNGEON_SISTERHOOD_SANCTUARY("Sisterhood Sanctuary", RegionBasedAreaType.DUNGEONS, 14999, 15000, 15001, 15255, 15256, 15257, 15511, 15512, 15513),
	DUNGEON_SMOKE("Smoke Dungeon", RegionBasedAreaType.DUNGEONS, 12946, 13202),
	DUNGEON_SOPHANEM("Sophanem Dungeon", RegionBasedAreaType.DUNGEONS, 13200),
	DUNGEON_SOURHOG_CAVE("Sourhog Cave", RegionBasedAreaType.DUNGEONS, 12695),
	DUNGEON_STRONGHOLD_SECURITY("Stronghold of Security", RegionBasedAreaType.DUNGEONS, 7505, 8017, 8530, 9297),
	DUNGEON_STRONGHOLD_SLAYER("Stronghold Slayer Cave", RegionBasedAreaType.DUNGEONS, 9624, 9625, 9880, 9881),
	DUNGEON_TARNS_LAIR("Tarn's Lair", RegionBasedAreaType.DUNGEONS, 12616, 12615),
	DUNGEON_TAVERLEY("Taverley Dungeon", RegionBasedAreaType.DUNGEONS, 11416, 11417, 11671, 11672, 11673, 11928, 11929),
	DUNGEON_TEMPLE_OF_IKOV("Temple of Ikov", RegionBasedAreaType.DUNGEONS, 10649, 10905, 10650),
	DUNGEON_TEMPLE_OF_LIGHT("Temple of Light", RegionBasedAreaType.DUNGEONS, 7496),
	DUNGEON_TEMPLE_OF_MARIMBO("Temple of Marimbo", RegionBasedAreaType.DUNGEONS, 11151),
	DUNGEON_THE_WARRENS("The Warrens", RegionBasedAreaType.DUNGEONS, 7070, 7326),
	DUNGEON_TOLNA("Dungeon of Tolna", RegionBasedAreaType.DUNGEONS, 13209),
	DUNGEON_TOWER_OF_LIFE("Tower of Life Basement", RegionBasedAreaType.DUNGEONS, 12100),
	DUNGEON_TRAHAEARN_MINE("Trahaearn Mine", RegionBasedAreaType.DUNGEONS, 13250),
	DUNGEON_TUNNEL_OF_CHAOS("Tunnel of Chaos", RegionBasedAreaType.DUNGEONS, 12625),
	DUNGEON_UNDERGROUND_PASS("Underground Pass", RegionBasedAreaType.DUNGEONS, 9369, 9370),
	DUNGEON_VARROCKSEWERS("Varrock Sewers", RegionBasedAreaType.DUNGEONS, 12954, 13210),
	DUNGEON_VIYELDI_CAVES("Viyeldi Caves", RegionBasedAreaType.DUNGEONS, 9545, 11153),
	DUNGEON_WARRIORS_GUILD("Warriors' Guild Basement", RegionBasedAreaType.DUNGEONS, 11675),
	DUNGEON_WATER_RAVINE("Water Ravine", RegionBasedAreaType.DUNGEONS, 13461),
	DUNGEON_WATERBIRTH("Waterbirth Dungeon", RegionBasedAreaType.DUNGEONS, 9886, 10142, 7492, 7748),
	DUNGEON_WATERFALL("Waterfall Dungeon", RegionBasedAreaType.DUNGEONS, 10394),
	DUNGEON_WEREWOLF_AGILITY("Werewolf Agility Course", RegionBasedAreaType.DUNGEONS, 14234),
	DUNGEON_WHITE_WOLF_MOUNTAIN_CAVES("White Wolf Mountain Caves", RegionBasedAreaType.DUNGEONS, 11418, 11419),
	DUNGEON_WITCHAVEN_SHRINE("Witchhaven Shrine Dungeon", RegionBasedAreaType.DUNGEONS, 10903),
	DUNGEON_WIZARDS_TOWER("Wizards' Tower Basement", RegionBasedAreaType.DUNGEONS, 12437),
	DUNGEON_WOODCUTTING_GUILD("Woodcutting Guild Dungeon", RegionBasedAreaType.DUNGEONS, 6298),
	DUNGEON_WYVERN_CAVE("Wyvern Cave", RegionBasedAreaType.DUNGEONS, 14495, 14496),
	DUNGEON_YANILLE_AGILITY("Yanille Agility Dungeon", RegionBasedAreaType.DUNGEONS, 10388),

	// Minigames
	MG_ARDOUGNE_RAT_PITS("Ardougne Rat Pits", RegionBasedAreaType.MINIGAMES, 10646),
	MG_BARBARIAN_ASSAULT("Barbarian Assault", RegionBasedAreaType.MINIGAMES, 7508, 7509, 10322),
	MG_BARROWS("Barrows", RegionBasedAreaType.MINIGAMES, 14131, 14231),
	MG_BLAST_FURNACE("Blast Furnace", RegionBasedAreaType.MINIGAMES, 7757),
	MG_BRIMHAVEN_AGILITY_ARENA("Brimhaven Agility Arena", RegionBasedAreaType.MINIGAMES, 11157),
	MG_BURTHORPE_GAMES_ROOM("Burthorpe Games Room", RegionBasedAreaType.MINIGAMES, 8781),
	MG_CASTLE_WARS("Castle Wars", RegionBasedAreaType.MINIGAMES, 9520, 9620),
	MG_CLAN_WARS("Clan Wars", RegionBasedAreaType.MINIGAMES, 12621, 12622, 12623, 13130, 13131, 13133, 13134, 13135, 13386, 13387, 13390, 13641, 13642, 13643, 13644, 13645, 13646, 13647, 13899, 13900, 14155, 14156),
	MG_DUEL_ARENA("Duel Arena", RegionBasedAreaType.MINIGAMES, 13362, 13363),
	MG_FISHING_TRAWLER("Fishing Trawler", RegionBasedAreaType.MINIGAMES, 7499),
	MG_GAUNTLET("The Gauntlet", RegionBasedAreaType.MINIGAMES, 12127, 7512),
	MG_CORRUPTED_GAUNTLET("Corrupted Gauntlet", RegionBasedAreaType.MINIGAMES, 7768),
	MG_HALLOWED_SEPULCHRE("Hallowed Sepulchre", RegionBasedAreaType.MINIGAMES, 8797, 9051, 9052, 9053, 9054, 9309, 9563, 9565, 9821, 10074, 10075, 10077),
	MG_INFERNO("The Inferno", RegionBasedAreaType.MINIGAMES, 9043),
	MG_KELDAGRIM_RAT_PITS("Keldagrim Rat Pits", RegionBasedAreaType.MINIGAMES, 7753),
	MG_LAST_MAN_STANDING_DESERTED_ISLAND("LMS - Deserted Island", RegionBasedAreaType.MINIGAMES, 13658, 13659, 13660, 13914, 13915, 13916),
	MG_LAST_MAN_STANDING_WILD_VARROCK("LMS - Wild Varrock", RegionBasedAreaType.MINIGAMES, 13918, 13919, 13920, 14174, 14175, 14176, 14430, 14431, 14432),
	MG_MAGE_TRAINING_ARENA("Mage Training Arena", RegionBasedAreaType.MINIGAMES, 13462, 13463),
	MG_NIGHTMARE_ZONE("Nightmare Zone", RegionBasedAreaType.MINIGAMES, 9033),
	MG_PEST_CONTROL("Pest Control", RegionBasedAreaType.MINIGAMES, 10536),
	MG_PORT_SARIM_RAT_PITS("Port Sarim Rat Pits", RegionBasedAreaType.MINIGAMES, 11926),
	MG_PYRAMID_PLUNDER("Pyramid Plunder", RegionBasedAreaType.MINIGAMES, 7749),
	MG_ROGUES_DEN("Rogues' Den", RegionBasedAreaType.MINIGAMES, 11854, 11855, 12109, 12110, 12111),
	MG_SORCERESS_GARDEN("Sorceress's Garden", RegionBasedAreaType.MINIGAMES, 11605),
	MG_SOUL_WARS("Soul Wars", RegionBasedAreaType.MINIGAMES, 8493, 8748, 8749, 9005),
	MG_TEMPLE_TREKKING("Temple Trekking", RegionBasedAreaType.MINIGAMES, 8014, 8270, 8256, 8782, 9038, 9294, 9550, 9806),
	MG_TITHE_FARM("Tithe Farm", RegionBasedAreaType.MINIGAMES, 7222),
	MG_TROUBLE_BREWING("Trouble Brewing", RegionBasedAreaType.MINIGAMES, 15150),
	MG_TZHAAR_FIGHT_CAVES("Tzhaar Fight Caves", RegionBasedAreaType.MINIGAMES, 9551),
	MG_TZHAAR_FIGHT_PITS("Tzhaar Fight Pits", RegionBasedAreaType.MINIGAMES, 9552),
	MG_VARROCK_RAT_PITS("Varrock Rat Pits", RegionBasedAreaType.MINIGAMES, 11599),
	MG_VOLCANIC_MINE("Volcanic Mine", RegionBasedAreaType.MINIGAMES, 15263, 15262),

	// Raids
	RAIDS_CHAMBERS_OF_XERIC("Chambers of Xeric", RegionBasedAreaType.RAIDS, 12889, 13136, 13137, 13138, 13139, 13140, 13141, 13145, 13393, 13394, 13395, 13396, 13397, 13401),
	RAIDS_THEATRE_OF_BLOOD("Theatre of Blood", RegionBasedAreaType.RAIDS, 12611, 12612, 12613, 12867, 12869, 13122, 13123, 13125, 13379),

	// Other
	REGION_ABYSSAL_AREA("Abyssal Area", RegionBasedAreaType.REGIONS, 12108),
	REGION_ABYSSAL_NEXUS("Abyssal Nexus", RegionBasedAreaType.REGIONS, 12106),
	REGION_AGILITY_PYRAMID("Agility Pyramid", RegionBasedAreaType.REGIONS, 12105, 13356),
	REGION_AIR_ALTAR("Air Altar", RegionBasedAreaType.REGIONS, 11339),
	REGION_AL_KHARID_MINE("Al Kharid Mine", RegionBasedAreaType.REGIONS, 13107),
	REGION_APE_ATOLL("Ape Atoll" , RegionBasedAreaType.REGIONS, 10794, 10795, 10974, 11050),
	REGION_ARANDAR("Arandar", RegionBasedAreaType.REGIONS, 9266, 9267, 9523),
	REGION_ASGARNIA("Asgarnia", RegionBasedAreaType.REGIONS, 11825, 11829, 11830, 12085, 12086),
	REGION_BATTLEFIELD("Battlefield", RegionBasedAreaType.REGIONS, 10034),
	REGION_BATTLEFRONT("Battlefront", RegionBasedAreaType.REGIONS, 5433, 5434),
	REGION_BLAST_MINE("Blast Mine", RegionBasedAreaType.REGIONS, 5948),
	REGION_BODY_ALTAR("Body Altar", RegionBasedAreaType.REGIONS, 10059),
	REGION_CHAOS_ALTAR("Chaos Altar", RegionBasedAreaType.REGIONS, 9035),
	REGION_COSMIC_ALTAR("Cosmic Altar", RegionBasedAreaType.REGIONS, 8523),
	REGION_COSMIC_ENTITYS_PLANE("Cosmic Entity's Plane", RegionBasedAreaType.REGIONS, 8267),
	REGION_CRABCLAW_ISLE("Crabclaw Isle", RegionBasedAreaType.REGIONS, 6965),
	REGION_CRAFTING_GUILD("Crafting Guild", RegionBasedAreaType.REGIONS, 11571),
	REGION_CRANDOR("Crandor", RegionBasedAreaType.REGIONS, 11314, 11315),
	REGION_CRASH_ISLAND("Crash Island", RegionBasedAreaType.REGIONS, 11562),
	REGION_DARK_ALTAR("Dark Altar", RegionBasedAreaType.REGIONS, 6716),
	REGION_DEATH_ALTAR("Death Altar", RegionBasedAreaType.REGIONS, 8779),
	REGION_DEATH_PLATEAU("Death Plateau", RegionBasedAreaType.REGIONS, 11320),
	REGION_DENSE_ESSENCE("Dense Essence Mine", RegionBasedAreaType.REGIONS, 6972),
	REGION_DESERT_PLATEAU("Desert Plateau", RegionBasedAreaType.REGIONS, 13361, 13617),
	REGION_DIGSITE("Digsite", RegionBasedAreaType.REGIONS, 13365),
	REGION_DRAGONTOOTH("Dragontooth Island", RegionBasedAreaType.REGIONS, 15159),
	REGION_DRAYNOR_MANOR("Draynor Manor", RegionBasedAreaType.REGIONS, 12340),
	REGION_DRILL_SERGEANT("Drill Sergeant's Training Camp", RegionBasedAreaType.REGIONS, 12619),
	REGION_EAGLES_PEAK("Eagles' Peak", RegionBasedAreaType.REGIONS, 9270),
	REGION_EARTH_ALTAR("Earth Altar", RegionBasedAreaType.REGIONS, 10571),
	REGION_ENCHANTED_VALLEY("Enchanted Valley", RegionBasedAreaType.REGIONS, 12102),
	REGION_EVIL_TWIN("Evil Twin Crane Room", RegionBasedAreaType.REGIONS, 7504),
	REGION_EXAM_CENTRE("Exam Centre", RegionBasedAreaType.REGIONS, 13364),
	REGION_FALADOR_FARM("Falador Farm", RegionBasedAreaType.REGIONS, 12083),
	REGION_FARMING_GUILD("Farming Guild", RegionBasedAreaType.REGIONS, 4922),
	REGION_FELDIP_HILLS("Feldip Hills", RegionBasedAreaType.REGIONS, 9773, 9774, 10029, 10030, 10285, 10286, 10287, 10542, 10543),
	REGION_FENKENSTRAIN("Fenkenstrain's Castle", RegionBasedAreaType.REGIONS, 14135),
	REGION_FIGHT_ARENA("Fight Arena", RegionBasedAreaType.REGIONS, 10289),
	REGION_FIRE_ALTAR("Fire Altar", RegionBasedAreaType.REGIONS, 10315),
	REGION_FISHER_REALM("Fisher Realm", RegionBasedAreaType.REGIONS, 10569),
	REGION_FISHING_GUILD("Fishing Guild", RegionBasedAreaType.REGIONS, 10293),
	REGION_FISHING_PLATFORM("Fishing Platform", RegionBasedAreaType.REGIONS, 11059),
	REGION_FORSAKEN_TOWER("The Forsaken Tower", RegionBasedAreaType.REGIONS, 5435),
	REGION_FOSSIL_ISLAND("Fossil Island", RegionBasedAreaType.REGIONS, 14650, 14651, 14652, 14906, 14907, 14908, 15162, 15163, 15164),
	REGION_FREAKY_FORESTER("Freaky Forester's Clearing", RegionBasedAreaType.REGIONS, 10314),
	REGION_FREMENNIK("Fremennik Province", RegionBasedAreaType.REGIONS, 10296, 10552, 10808, 10809, 10810, 10811, 11064),
	REGION_FREMENNIK_ISLES("Fremennik Isles", RegionBasedAreaType.REGIONS, 9276, 9532),
	REGION_FROGLAND("Frogland", RegionBasedAreaType.REGIONS, 9802),
	REGION_GALVEK_SHIPWRECKS("Galvek Shipwrecks", RegionBasedAreaType.REGIONS, 6486, 6487, 6488, 6489, 6742, 6743, 6744, 6745),
	REGION_GORAKS_PLANE("Gorak's Plane", RegionBasedAreaType.REGIONS, 12115),
	REGION_GRAND_EXCHANGE("Grand Exchange", RegionBasedAreaType.REGIONS, 12598),
	REGION_GWD("God Wars Dungeon", RegionBasedAreaType.REGIONS, 11578),
	REGION_HARMONY("Harmony Island", RegionBasedAreaType.REGIONS, 15148),
	REGION_HAZELMERE("Hazelmere's Island", RegionBasedAreaType.REGIONS, 10544),
	REGION_ICE_PATH("Ice Path", RegionBasedAreaType.REGIONS, 11322, 11323),
	REGION_ICEBERG("Iceberg", RegionBasedAreaType.REGIONS, 10558, 10559),
	REGION_ICYENE_GRAVEYARD("Icyene Graveyard", RegionBasedAreaType.REGIONS, 14641, 14897, 14898),
	REGION_ISAFDAR("Isafdar", RegionBasedAreaType.REGIONS, 8497, 8753, 8754, 9009, 9010),
	REGION_ISLAND_OF_STONE("Island of Stone", RegionBasedAreaType.REGIONS, 9790),
	REGION_ISLE_OF_SOULS("Isle of Souls", RegionBasedAreaType.REGIONS, 8236, 8237, 8238, 8491, 8492, 8494, 8747, 8750, 9003, 9004, 9006, 9260, 9261, 9262),
	REGION_JIGGIG("Jiggig" , RegionBasedAreaType.REGIONS, 9775),
	REGION_KANDARIN("Kandarin", RegionBasedAreaType.REGIONS, 9268, 9269, 9014, 9263, 9264, 9519, 9524, 9527, 9776, 9783, 10037, 10290, 10294, 10546, 10551, 10805, 11062),
	REGION_KARAMJA("Karamja" , RegionBasedAreaType.REGIONS, 10801, 10802, 11054, 11311, 11312, 11313, 11566, 11567, 11568, 11569, 11822),
	REGION_KEBOS_LOWLANDS("Kebos Lowlands", RegionBasedAreaType.REGIONS, 4665, 4666, 4667, 4921, 5178),
	REGION_KEBOS_SWAMP("Kebos Swamp", RegionBasedAreaType.REGIONS, 4664, 4920, 5174, 5175, 5176, 5430, 5431),
	REGION_KHARAZI_JUNGLE("Kharazi Jungle", RegionBasedAreaType.REGIONS, 11053, 11309, 11565, 11821),
	REGION_KHARIDIAN_DESERT("Kharidian Desert", RegionBasedAreaType.REGIONS, 12587, 12844, 12845, 12846, 12847, 12848, 13100, 13101, 13102, 13103, 13104, 13357, 13359, 13360, 13614, 13615, 13616),
	REGION_KILLERWATT_PLANE("Killerwatt Plane", RegionBasedAreaType.REGIONS, 10577),
	REGION_KOUREND("Great Kourend", RegionBasedAreaType.REGIONS, 6201, 6457, 6713),
	REGION_KOUREND_WOODLAND("Kourend Woodland", RegionBasedAreaType.REGIONS, 5942, 6197, 6453),
	REGION_LAW_ALTAR("Law Altar", RegionBasedAreaType.REGIONS, 9803),
	REGION_LEGENDS_GUILD("Legends' Guild", RegionBasedAreaType.REGIONS, 10804),
	REGION_LIGHTHOUSE("Lighthouse", RegionBasedAreaType.REGIONS, 10040),
	REGION_LITHKREN("Lithkren", RegionBasedAreaType.REGIONS, 14142, 14398),
	REGION_LUMBRIDGE_SWAMP("Lumbridge Swamp", RegionBasedAreaType.REGIONS, 12593, 12849),
	REGION_MAX_ISLAND("Max Island", RegionBasedAreaType.REGIONS, 11063),
	REGION_MCGRUBORS_WOOD("McGrubor's Wood", RegionBasedAreaType.REGIONS, 10550),
	REGION_MIME_STAGE("Mime's Stage", RegionBasedAreaType.REGIONS, 8010),
	REGION_MIND_ALTAR("Mind Altar", RegionBasedAreaType.REGIONS, 11083),
	REGION_MISTHALIN("Misthalin", RegionBasedAreaType.REGIONS, 12594, 12595, 12851),
	REGION_MOLCH("Molch", RegionBasedAreaType.REGIONS, 5177),
	REGION_MOLCH_ISLAND("Molch Island", RegionBasedAreaType.REGIONS, 5432),
	REGION_MORYTANIA("Morytania", RegionBasedAreaType.REGIONS, 13619, 13620, 13621, 13622, 13876, 13877, 13879, 14133, 14134, 14389, 14390, 14391, 14645, 14647),
	REGION_MOUNT_QUIDAMORTEM("Mount Quidamortem", RegionBasedAreaType.REGIONS, 4662, 4663, 4918, 4919),
	REGION_MR_MORDAUTS_CLASSROOM("Mr. Mordaut's Classroom", RegionBasedAreaType.REGIONS, 7502),
	REGION_MUDSKIPPER("Mudskipper Point", RegionBasedAreaType.REGIONS, 11824),
	REGION_MYSTERIOUS_OLD_MAN_MAZE("Mysterious Old Man's Maze", RegionBasedAreaType.REGIONS, 11590, 11591, 11846, 11847),
	REGION_MYTHS_GUILD("Myths' Guild", RegionBasedAreaType.REGIONS, 9772),
	REGION_NATURE_ALTAR("Nature Altar", RegionBasedAreaType.REGIONS, 9547),
	REGION_NORTHERN_TUNDRAS("Northern Tundras", RegionBasedAreaType.REGIONS, 6204, 6205, 6717),
	REGION_OBSERVATORY("Observatory", RegionBasedAreaType.REGIONS, 9777),
	REGION_ODD_ONE_OUT("Odd One Out", RegionBasedAreaType.REGIONS, 7754),
	REGION_OTTOS_GROTTO("Otto's Grotto", RegionBasedAreaType.REGIONS, 10038),
	REGION_OURANIA_HUNTER("Ourania Hunter Area", RegionBasedAreaType.REGIONS, 9778),
	REGION_PIRATES_COVE("Pirates' Cove", RegionBasedAreaType.REGIONS, 8763),
	REGION_PISCATORIS_HUNTER_AREA("Piscatoris Hunter Area", RegionBasedAreaType.REGIONS, 9015, 9016, 9271, 9272, 9528),
	REGION_POH("Player Owned House", RegionBasedAreaType.REGIONS, 7513, 7514, 7769, 7770),
	REGION_POISON_WASTE("Poison Waste", RegionBasedAreaType.REGIONS, 8752, 9008),
	REGION_PORT_TYRAS("Port Tyras", RegionBasedAreaType.REGIONS, 8496),
	REGION_PURO_PURO("Puro Puro", RegionBasedAreaType.REGIONS, 10307),
	REGION_QUARRY("Quarry", RegionBasedAreaType.REGIONS, 12589),
	REGION_RANGING_GUILD("Ranging Guild", RegionBasedAreaType.REGIONS, 10549),
	REGION_RATCATCHERS_MANSION("Ratcatchers Mansion", RegionBasedAreaType.REGIONS, 11343),
	REGION_RUINS_OF_UNKAH("Ruins of Unkah", RegionBasedAreaType.REGIONS, 12588),
	REGION_RUNE_ESSENCE_MINE("Rune Essence Mine", RegionBasedAreaType.REGIONS, 11595),
	// The Beekeper, Pinball, and Gravedigger randoms share a region (7758), and although they are not technically ScapeRune, that name is most commonly
	// associated with random events, so those three have been denoted ScapeRune to avoid leaving multiple random event regions without an assigned name.
	REGION_SCAPERUNE("ScapeRune", RegionBasedAreaType.REGIONS, 10058, 7758, 8261),
	REGION_SEA_SPIRIT_DOCK("Sea Spirit Dock", RegionBasedAreaType.REGIONS, 12332),
	REGION_SHIP_YARD("Ship Yard", RegionBasedAreaType.REGIONS, 11823),
	REGION_SILVAREA("Silvarea", RegionBasedAreaType.REGIONS, 13366),
	REGION_SINCLAR_MANSION("Sinclair Mansion", RegionBasedAreaType.REGIONS, 10807),
	REGION_SLAYER_TOWER("Slayer Tower", RegionBasedAreaType.REGIONS, 13623, 13723),
	REGION_SOUL_ALTAR("Soul Altar", RegionBasedAreaType.REGIONS, 7228),
	REGION_TROLL_ARENA("Troll Arena", RegionBasedAreaType.REGIONS, 11576),
	REGION_TROLLHEIM("Trollheim", RegionBasedAreaType.REGIONS, 11577),
	REGION_TROLLWEISS_MTN("Trollweiss Mountain", RegionBasedAreaType.REGIONS, 11066, 11067, 11068),
	REGION_TUTORIAL_ISLAND("Tutorial Island", RegionBasedAreaType.REGIONS, 12079, 12080, 12335, 12336, 12436, 12592),
	REGION_UNDERWATER("Underwater", RegionBasedAreaType.REGIONS, 15008, 15264),
	REGION_WATER_ALTAR("Water Altar", RegionBasedAreaType.REGIONS, 10827),
	REGION_WATERBIRTH_ISLAND("Waterbirth Island", RegionBasedAreaType.REGIONS, 10042),
	REGION_WINTERTODT_CAMP("Wintertodt Camp", RegionBasedAreaType.REGIONS, 6461),
	REGION_WIZARDS_TOWER("Wizards' Tower", RegionBasedAreaType.REGIONS, 12337),
	REGION_WOODCUTTING_GUILD("Woodcutting Guild", RegionBasedAreaType.REGIONS, 6198, 6454),
	REGION_WRATH_ALTAR("Wrath Altar", RegionBasedAreaType.REGIONS, 9291);

	private static final Map<Integer, RegionBasedDefinition> FROM_REGION;

	static
	{
		ImmutableMap.Builder<Integer, RegionBasedDefinition> regionMapBuilder = new ImmutableMap.Builder<>();
		for (RegionBasedDefinition regionBasedDefinition : RegionBasedDefinition.values())
		{
			if (regionBasedDefinition.getRegionIds() == null)
			{
				continue;
			}

			for (int region : regionBasedDefinition.getRegionIds())
			{
				regionMapBuilder.put(region, regionBasedDefinition);
			}
		}
		FROM_REGION = regionMapBuilder.build();
	}

	@Nullable
	private String areaName;

	@Nullable
	private RegionBasedAreaType regionBasedAreaType;

	@Nullable
	private int[] regionIds;

	RegionBasedDefinition(String areaName, RegionBasedAreaType areaType, int... regionIds)
	{
		this.areaName = areaName;
		this.regionBasedAreaType = areaType;
		this.regionIds = regionIds;
	}

	public static RegionBasedDefinition fromRegion(final int regionId)
	{
		return FROM_REGION.get(regionId);
	}
}
