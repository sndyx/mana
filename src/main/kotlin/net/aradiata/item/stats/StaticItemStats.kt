package net.aradiata.item.stats

import org.bukkit.ChatColor

enum class Rarity(val color: ChatColor) {
    Common(ChatColor.WHITE),
    Uncommon(ChatColor.YELLOW),
    Rare(ChatColor.GREEN),
    Epic(ChatColor.DARK_PURPLE),
    Legendary(ChatColor.DARK_AQUA),
    Divine(ChatColor.LIGHT_PURPLE)
}

sealed class ItemType {
    object Resource         : ItemType()
    sealed class Consumable : ItemType()
    sealed class Equipment  : ItemType()

    object Food             : Consumable()
    object Potion           : Consumable()

    object Weapon           : Equipment()
    object Helmet           : Equipment()
    object Chestplate       : Equipment()
    object Leggings         : Equipment()
    object Boots            : Equipment()
}