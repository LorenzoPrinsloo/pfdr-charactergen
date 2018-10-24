package models

import models.Ability._

object Statistics {

   case class Statistics(
      strength:         AbilityScore[Str],
      dexterity:        AbilityScore[Dex],
      constitution:     AbilityScore[Con],
      intelligence:     AbilityScore[Intel],
      wisdom:           AbilityScore[Wis],
      charisma:         AbilityScore[Cha],
      hitPoints:        HitPoints,
      combatStats: CombatStatistics)

   case class AbilityScore[A <: Ability](
      `type`: A,
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
      spellFailure: Float,
      initiative: Short,
      damageReduction: Option[Int],
      spellResist: Option[Int],
      actionPoints: Option[Int])

   case class ArmorClass(base: BaseArmorClass, touch: TouchArmorClass, flatFooted: FlatFootedArmorClass)

   case class BaseArmorClass(
      total: Int = 10,
      armor: Int,
      shield: Int,
      dexModifier: Int,
      sizeModifier: Int,
      dodge: Int,
      natural: Option[Int],
      deflect: Option[Int])

   case class TouchArmorClass(
       total: Int = 10,
       dexModifier: Int,
       sizeModifier: Int,
       dodge: Int,
       deflect: Option[Int])

   case class FlatFootedArmorClass(
      total: Int = 10,
      armor: Int,
      shield: Int,
      sizeModifier: Int,
      natural: Option[Int],
      deflect: Option[Int])

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
