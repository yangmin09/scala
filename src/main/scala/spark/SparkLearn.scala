package spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * @author Hercules 
  * @mailto ym99929@alibaba-inc.com 
  * @date 2017/7/15 下午2:52
  * @description
  *
  */
object SparkLearn {


  def main(args: Array[String]): Unit = {


    val conf = new SparkConf().setMaster("local").setAppName("spark_learn")
    val sc = new SparkContext();

  }


}
