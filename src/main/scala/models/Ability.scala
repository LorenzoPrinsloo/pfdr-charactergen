package models

object Ability {
  sealed trait Ability
  trait Str extends Ability
  trait Dex extends Ability
  trait Con extends Ability
  trait Intel extends Ability
  trait Wis extends Ability
  trait Cha extends Ability
}
