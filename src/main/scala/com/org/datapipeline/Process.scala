package com.org.datapipeline

import org.apache.spark.sql.{DataFrame, SparkSession}

object Process {

  def takesnapShotBackUp(tableName: String, sparkSession: SparkSession) = {
  }

  def updateHistory(tableName: String, snapShotBackUp: DataFrame, stagingDf: DataFrame, spark: SparkSession) = {

    writeUpdates("tableName", spark)
    writeInserts("tableName", spark)
    writeDeletes("tableName", spark)
  }

  def writeInserts(tableName:String, spark: SparkSession) = {}
  def writeDeletes(tableName:String, spark: SparkSession) = {}
  def writeUpdates(tableName:String, spark: SparkSession) = {}

}
