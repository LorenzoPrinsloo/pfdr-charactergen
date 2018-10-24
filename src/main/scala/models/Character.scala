package models

import models.Enums._
import models.Skills.Skills
import models.Statistics.Statistics
import models.armor.{Armor, ArmorItem}
import squants.mass.Mass
import squants.space.Length

case class Character(
    characterName: String,
    playerName: String,
    race: Race,
    size: Size,
    gender: Gender,
    height: Length,
    weight: Mass,
    age: Integer,
    alignment: Alignment,
    deity: String,
    backGroundOccupation: Option[String],
    languages: Array[Language],
    stats: Statistics,
    skills: Skills,
    armor: Option[ArmorItem],
    shield: Option[ArmorItem])
