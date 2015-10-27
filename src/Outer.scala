/**
 * Created by bagseong-won on 15. 10. 28..
 */
class Outer {
  class Inner {
    def f() { println("f")}

    class InnerMost {
      f() //OK
    }
  }

  (new Inner).f()
}
