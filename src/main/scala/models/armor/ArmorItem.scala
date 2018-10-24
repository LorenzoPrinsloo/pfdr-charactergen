package models.armor

trait ArmorItem {
  def enhance: Int
  def acBonus: Int
  def maxDex: Int
  def penalty: Int
  def spellFail: Option[Float]
  def tpe: String
  def material: String
}
