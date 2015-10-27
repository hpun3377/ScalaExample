package society.professional

/**
 * Created by bagseong-won on 15. 10. 28..
 */
class Executive {
  private[professional] var workDetails = null
  private[society] var friends = null
  private[this] var secrets = null // To run success, remove "[this]" or private[this]

  def help(another : Executive): Unit = {
    println(another.workDetails)
    //println(another.secrets)
  }
}
