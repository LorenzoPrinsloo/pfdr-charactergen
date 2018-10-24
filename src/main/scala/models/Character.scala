package models

import models.Enums._
import models.Statistics.Statistics
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
    languages: List[Language],
    stats: Statistics,
    skills: Skills)
