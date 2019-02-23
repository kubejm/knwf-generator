package workflow

object WorkflowBuilder {
  def create() = {
    <config xmlns="http://www.knime.org/2008/09/XMLConfig" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.knime.org/2008/09/XMLConfig http://www.knime.org/XMLConfig_2008_09.xsd" key="workflow.knime">
      <entry key="created_by" type="xstring" value="3.7.1.v201901281154"/>
      <entry key="created_by_nightly" type="xboolean" value="false"/>
      <entry key="version" type="xstring" value="3.7.0"/>
      <entry key="name" type="xstring" isnull="true" value=""/>
      <config key="authorInformation">
        <entry key="authored-by" type="xstring" value="mattkubej"/>
        <entry key="authored-when" type="xstring" value="2019-02-23 15:28:10 -0500"/>
        <entry key="lastEdited-by" type="xstring" value="mattkubej"/>
        <entry key="lastEdited-when" type="xstring" value="2019-02-23 15:54:20 -0500"/>
      </config>
      <entry key="customDescription" type="xstring" isnull="true" value=""/>
      <entry key="state" type="xstring" value="CONFIGURED"/>
      <config key="workflow_credentials"/>
      <config key="nodes">
        <config key="node_1">
          <entry key="id" type="xint" value="1"/>
          <entry key="node_settings_file" type="xstring" value="Table Creator (#1)/settings.xml"/>
          <entry key="node_is_meta" type="xboolean" value="false"/>
          <entry key="node_type" type="xstring" value="NativeNode"/>
          <entry key="ui_classname" type="xstring" value="org.knime.core.node.workflow.NodeUIInformation"/>
          <config key="ui_settings">
            <config key="extrainfo.node.bounds">
              <entry key="array-size" type="xint" value="4"/>
              <entry key="0" type="xint" value="264"/>
              <entry key="1" type="xint" value="257"/>
              <entry key="2" type="xint" value="78"/>
              <entry key="3" type="xint" value="76"/>
            </config>
          </config>
        </config>
        <config key="node_2">
          <entry key="id" type="xint" value="2"/>
          <entry key="node_settings_file" type="xstring" value="Table to JSON (#2)/settings.xml"/>
          <entry key="node_is_meta" type="xboolean" value="false"/>
          <entry key="node_type" type="xstring" value="NativeNode"/>
          <entry key="ui_classname" type="xstring" value="org.knime.core.node.workflow.NodeUIInformation"/>
          <config key="ui_settings">
            <config key="extrainfo.node.bounds">
              <entry key="array-size" type="xint" value="4"/>
              <entry key="0" type="xint" value="424"/>
              <entry key="1" type="xint" value="257"/>
              <entry key="2" type="xint" value="82"/>
              <entry key="3" type="xint" value="76"/>
            </config>
          </config>
        </config>
      </config>
      <config key="connections">
        <config key="connection_0">
          <entry key="sourceID" type="xint" value="1"/>
          <entry key="destID" type="xint" value="2"/>
          <entry key="sourcePort" type="xint" value="1"/>
          <entry key="destPort" type="xint" value="1"/>
          <entry key="ui_classname" type="xstring" value="org.knime.core.node.workflow.ConnectionUIInformation"/>
          <config key="ui_settings">
            <entry key="extrainfo.conn.bendpoints_size" type="xint" value="0"/>
          </config>
        </config>
      </config>
      <config key="workflow_editor_settings">
        <entry key="workflow.editor.snapToGrid" type="xboolean" value="true"/>
        <entry key="workflow.editor.ShowGrid" type="xboolean" value="true"/>
        <entry key="workflow.editor.gridX" type="xint" value="20"/>
        <entry key="workflow.editor.gridY" type="xint" value="20"/>
        <entry key="workflow.editor.zoomLevel" type="xdouble" value="1.0"/>
        <entry key="workflow.editor.curvedConnections" type="xboolean" value="false"/>
        <entry key="workflow.editor.connectionWidth" type="xint" value="1"/>
      </config>
    </config>
  }
}
