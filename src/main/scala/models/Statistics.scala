package models

 object Statistics {

   case class Statistics(
      strength:         AbilityScore,
      dexterity:        AbilityScore,
      constitution:     AbilityScore,
      intelligence:     AbilityScore,
      wisdom:           AbilityScore,
      charisma:         AbilityScore,
      hitPoints:        HitPoints,
      combatStats: CombatStatistics)

   case class AbilityScore(
       base: Int,
       mod: Int,
       inherent: Option[Int],
       enhance: Option[Int],
       misc: Option[Int])

   case class HitPoints(currentHP: Int, temporaryModifier: Int)

   case class CombatStatistics(
       baseAttackBonus: Int,
       armorClass: ArmorClass,
       savingThrows: SavingThrows,
       attackStats: AttackStatistics,
       armorPenalty: Int,
       spellFailure: Float)

   case class ArmorClass(base: BaseArmorClass, touch: TouchArmorClass, flatFooted: FlatFootedArmorClass)

   case class BaseArmorClass(
       total: Int = 10,
       armor: Int,
       shield: Int,
       dexModifier: Int,
       sizeModifier: Int,
       dodge: Int,
       natural: Option[Integer],
       deflect: Option[Integer])

   case class TouchArmorClass(
       total: Int = 10,
       dexModifier: Int,
       sizeModifier: Int,
       dodge: Int,
       deflect: Option[Integer])

   case class FlatFootedArmorClass(
       total: Int = 10,
       armor: Int,
       shield: Int,
       sizeModifier: Int,
       natural: Option[Integer],
       deflect: Option[Integer])

   case class SavingThrows(fortitude: SavingThrow, reflex: SavingThrow, willPower: SavingThrow)

   case class SavingThrow(total: Int, classBase: Int, abilityModifier: Int, enhance: Option[Int])

   case class AttackStatistics(
       melee: AttackModifier,
       ranged: AttackModifier,
       combatManeuverBonus: AttackModifier,
       combatManeuverDefense: CombatManeuverDefense)

   case class AttackModifier(total: Int, baseAttackBonus: Int, abilityModifier: Int, size: Int)

   case class CombatManeuverDefense(
       total: Int = 10,
       baseAttackBonus: Int,
       dexModifier: Int,
       strengthModifier: Int,
       size: Int)

 }
