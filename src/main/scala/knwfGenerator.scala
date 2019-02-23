import better.files._
import nodes.{TableCreator, TableToJSON}
import workflow.WorkflowBuilder

import scala.xml.XML

object knwfGenerator {
  def main(args: Array[String]): Unit = {
    val baseDir = "./generated"

    // create the Table Creator node
    val tableCreatorDir = baseDir + "/Table Creator (#1)"
    tableCreatorDir.toFile.createDirectoryIfNotExists()

    val tableCreatorFile = tableCreatorDir + "/settings.xml"
    XML.save(tableCreatorFile, TableCreator.create())

    // create the Table to JSON node
    val tableToJSONDir = baseDir + "/Table to JSON (#2)"
    tableToJSONDir.toFile.createDirectoryIfNotExists()

    val tableToJSONFile = tableToJSONDir + "/settings.xml"
    XML.save(tableToJSONFile, TableToJSON.create())

    // create workflow
    val workflowFile = baseDir + "/workflow.knime"
    XML.save(workflowFile, WorkflowBuilder.create())

    // zip files
    File("generated.knwf").zipIn(Iterator(File(baseDir)))

    // clean up
    File(baseDir).delete()
  }
}
