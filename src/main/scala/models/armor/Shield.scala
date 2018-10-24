package models.armor

case class Shield(
  enhance: Int,
  acBonus: Int,
  maxDex: Int,
  penalty: Int,
  spellFail: Option[Float],
  tpe: String,
  material: String) extends ArmorItem
