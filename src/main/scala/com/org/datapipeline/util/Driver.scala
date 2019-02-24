package com.org.datapipeline.util

case class TableProperties(tableName: String)

class Driver extends SparkSessionProvider {

  def loadTablePropertits(propConfigPath: String) = {

    val loadProperties = sparkSession.read.json(propConfigPath)
    loadProperties



  }

}
