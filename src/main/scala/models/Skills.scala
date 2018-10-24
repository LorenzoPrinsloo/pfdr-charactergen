package models

import models.Ability._

object Skills {

  case class Skills(
                     acrobatics: SkillStat[Dex],
                     appraise: SkillStat[Intel],
                     bluff: SkillStat[Cha],
                     climb: SkillStat[Str],
                     craft: Array[SkillStat[Ability]],
                     diplomacy: SkillStat[Cha],
                     disableDevice: SkillStat[Dex],
                     disguise: SkillStat[Cha],
                     escapeArtist: SkillStat[Dex],
                     fly: SkillStat[Dex],
                     handleAnimal: SkillStat[Cha],
                     heal: SkillStat[Wis],
                     intimidate: SkillStat[Cha],
                     knowledge: Array[SkillStat[Intel]],
                     linguistics: SkillStat[Intel],
                     perception: SkillStat[Wis],
                     perform: SkillStat[Cha],
                     profession: SkillStat[Wis],
                     ride: SkillStat[Dex],
                     senseMotive: SkillStat[Wis],
                     sleightOfHand: SkillStat[Dex],
                     spellCraft: SkillStat[Intel],
                     stealth: SkillStat[Dex],
                     survival: SkillStat[Wis],
                     swim: SkillStat[Str],
                     userMagicDevice: SkillStat[Cha])

  case class SkillStat[A <: Ability](ability: A, ranks: Short, classSkill: Boolean, armorCheck: Boolean)
}
