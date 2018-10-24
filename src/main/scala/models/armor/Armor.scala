package models.armor

case class Armor(
  enhance: Int,
  acBonus: Int,
  maxDex: Int,
  penalty: Int,
  spellFail: Option[Float],
  tpe: String,
  material: String) extends ArmorItem
