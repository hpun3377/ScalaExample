package p

/**
 * Created by bagseong-won on 15. 10. 28..
 */
class Super {
  protected def f() { println("f")}
}
class Sub extends Super {
  f()
}
class Other {
  //(new Super).f()
}
