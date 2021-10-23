package net.aradiata.script

import net.aradiata.item.stats.ItemType
import net.aradiata.item.stats.Rarity

inline fun item(id: String, builder: ItemBuilder.() -> Unit): ItemBuilder {
    return ItemBuilder(id).apply(builder)
}

class ItemBuilder(val id: String) {

    var name: String = "null"
    var rarity: Rarity = Rarity.Common
    var type: ItemType = ItemType.Resource
}

fun test() {
    item("cool-item") {
        name = "Cool Item"
        rarity = Rarity.Divine
        type = ItemType.Weapon
    }
}