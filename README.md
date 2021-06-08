# nav-test

Sample project that reproduces the issue: https://issuetracker.google.com/issues/190265699
IllegalStateException when popping nested graph

The following exception is thrown during navigation back from nested graph

java.lang.IllegalStateException: popBackStack was called with androidx.navigation.NavBackStackEntry@c554768 which does not exist in back stack []

Reproduces with Navigation Component v2.4.0-alpha02 and can't be reproduced with v2.3.5 (can be changed in {root}/build.gradle.kts)
