package models

import enumeratum._
import squants.space.{Feet, Inches, Length}

object Enums {

  sealed trait Race extends EnumEntry

  object Race extends Enum[Race] {
    val values = findValues

    case object Human       extends Race
    case object Elf         extends Race
    case object Dwarf       extends Race
    case object HalfElf     extends Race
    case object HalfOrc     extends Race
    case object Gnome       extends Race
    case object Halfling    extends Race
  }

  sealed abstract class Size(val minHeight: Length, val maxHeight: Length) extends EnumEntry

  object Size extends Enum[Size] {
    val values = findValues

    case object Fine       extends Size(Inches(0.0), Inches(6.0))
    case object Diminutive extends Size(Inches(6.0), Feet(1.0))
    case object Tiny       extends Size(Feet(1.0), Feet(2.0))
    case object Small      extends Size(Feet(2.0), Feet(4.0))
    case object Medium     extends Size(Feet(4.0), Feet(8.0))
    case object Large      extends Size(Feet(8.0), Feet(16.0))
    case object Huge       extends Size(Feet(16.0), Feet(32.0))
    case object Gargantuan extends Size(Feet(32.0), Feet(100.00))
  }

  sealed trait Gender extends EnumEntry

  object Gender extends Enum[Gender] {
    val values = findValues

    case object Male   extends Gender
    case object Female extends Gender
  }

  sealed trait Alignment extends EnumEntry

  object Alignment extends Enum[Alignment] {
    val values = findValues

    case object LawfulGood     extends Alignment
    case object NeutralGood    extends Alignment
    case object ChaoticGood    extends Alignment
    case object LawfulNeutral  extends Alignment
    case object Neutral        extends Alignment
    case object ChaoticNeutral extends Alignment
    case object LawfulEvil     extends Alignment
    case object NeutralEvil    extends Alignment
    case object ChaoticEvil    extends Alignment
  }

  sealed trait Language extends EnumEntry

  object Language extends Enum[Language] {
    val values = findValues

    case object Common extends Language
  }
}
