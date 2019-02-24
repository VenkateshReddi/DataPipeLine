package com.org.datapipeline.util

import org.apache.spark.sql.SparkSession

trait SparkSessionProvider {

  val sparkSession = SparkSession
                    .builder()
                    .appName("DataPipeLine")
                   .enableHiveSupport()
                   .getOrCreate()

}
