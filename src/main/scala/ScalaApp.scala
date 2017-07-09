/**
  * @author Hercules 
  * @mailto ym99929@alibaba-inc.com 
  * @date 2017/7/9 下午4:59
  * @description
  *
  */
class ScalaApp() {

  def hello() {
    println("you are invoking the hello method of ScalaApp");
  }
}

object ScalaApp{


  def main(args: Array[String]): Unit = {
    val javaApp=new JavaApp();
    javaApp.hello();
  }


}
