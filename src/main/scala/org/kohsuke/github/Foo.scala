package org.kohsuke.github

class Foo extends PagedIterator[GHAuthorization](???) {
  override private[github] def wrapUp(page: Array[GHAuthorization]): Unit = ???
}
