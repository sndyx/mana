package net.aradiata

data class Item(val id: String, val name: String, val rarity: Rarity)

enum class Rarity {
    
    Common,
    Uncommon,
    Rare,
    Epic,
    Legendary,
    Divine
    
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