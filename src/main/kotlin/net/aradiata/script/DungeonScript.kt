package net.aradiata.script

import org.bukkit.Location

inline fun dungeonPiece(pos1: Location, pos2: Location, builder: DungeonPieceBuilder.() -> Unit): Unit {
    //return Dunge(id).apply(builder)
}

class DungeonPieceBuilder {

}

fun DungeonPieceBuilder.tags(vararg tags: Tag) {

}

/**
 * Ensures [amount] pieces ahead of this piece have [tags].
 */
fun DungeonPieceBuilder.sharedTags(amount: Int, vararg tags: Tag) {

}

enum class Tag {
    
    Enemies,
    Treasure,
    Traps,
    Parkour,
    Ascent,
    Descent,
    DeadEnd,
    Small,
    Medium,
    Large,
    Filler,
    End;
    
}