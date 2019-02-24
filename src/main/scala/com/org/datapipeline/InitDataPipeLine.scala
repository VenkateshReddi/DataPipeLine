package com.org.datapipeline

import com.org.datapipeline.util._

import com.org.datapipeline.Process

import org.apache.spark.storage.StorageLevel.MEMORY_AND_DISK

object InitDataPipeLine extends SparkSessionProvider {

  def main (args: Array[String]): Unit = {

    val driver = new Driver
    driver.loadTablePropertits("path")

    val loadStagingTable = sparkSession.sql("""select * from db.stage""").persist(MEMORY_AND_DISK)
    if(loadStagingTable.take(1).nonEmpty) {
      Process.takesnapShotBackUp()
      Process.UpdateHistory()
      Process.UpdateTarget()
    }


  }



}
