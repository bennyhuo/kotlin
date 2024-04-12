// FIR_DISABLE_LAZY_RESOLVE_CHECKS
// ^Problem with FirCompilerLazyDeclarationResolverWithPhaseChecking

// MODULE: topmost
// FILE: topmost.kt
package org.example

interface Base {
    fun topmost()
}

typealias Alias = Base

interface Topmost : Alias

// MODULE: top(topmost)
// FILE: top.kt
package org.example

interface Base : <!CYCLIC_INHERITANCE_HIERARCHY!>TopAdditional<!> {
    fun top()
}

// FILE: TopAdditional.java
package org.example;

public interface TopAdditional extends Top {

}

// FILE: Top.java
package org.example;

public interface Top extends Topmost {

}

// MODULE: middle(top)
// FILE: middle.kt
package org.example

<!MISSING_DEPENDENCY_SUPERCLASS!>interface Base : MiddleAdditional {
    fun middle()
}<!>

<!MISSING_DEPENDENCY_SUPERCLASS!>interface MiddleAdditional : Middle<!>

<!MISSING_DEPENDENCY_SUPERCLASS!>interface Middle : Top<!>

// MODULE: bottom(middle)
// FILE: bottom.kt
package org.example

<!MISSING_DEPENDENCY_SUPERCLASS!>interface Base : BottomAdditional {
    fun bottom()
}<!>

<!MISSING_DEPENDENCY_SUPERCLASS!>interface BottomAdditional : Bottom<!>

<!MISSING_DEPENDENCY_SUPERCLASS!>interface Bottom : Middle<!>
