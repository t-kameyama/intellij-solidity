package me.serce.solidity.lang.core.resolve

class SolMemberAccessResolveTest : SolResolveTestBase() {
  fun test() = Unit
  fun skipTestLocal1() = checkByCode("""
        contract B {
            struct Prop {
                uint8 prop;
                     //x
            }

            Prop[] aa;

            function B() {
                aa[0].prop;
                     //^
            }
        }
  """)
}