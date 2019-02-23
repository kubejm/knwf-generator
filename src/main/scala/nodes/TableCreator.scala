package nodes

object TableCreator {
  def create() = {
    <config xmlns="http://www.knime.org/2008/09/XMLConfig" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.knime.org/2008/09/XMLConfig http://www.knime.org/XMLConfig_2008_09.xsd" key="settings.xml">
      <entry key="node_file" type="xstring" value="settings.xml"/>
      <config key="flow_stack"/>
      <config key="internal_node_subsettings">
        <entry key="memory_policy" type="xstring" value="CacheSmallInMemory"/>
      </config>
      <config key="model">
        <config key="rowIndices">
          <entry key="array-size" type="xint" value="6"/>
          <entry key="0" type="xint" value="0"/>
          <entry key="1" type="xint" value="0"/>
          <entry key="2" type="xint" value="1"/>
          <entry key="3" type="xint" value="1"/>
          <entry key="4" type="xint" value="2"/>
          <entry key="5" type="xint" value="2"/>
        </config>
        <config key="columnIndices">
          <entry key="array-size" type="xint" value="6"/>
          <entry key="0" type="xint" value="0"/>
          <entry key="1" type="xint" value="1"/>
          <entry key="2" type="xint" value="0"/>
          <entry key="3" type="xint" value="1"/>
          <entry key="4" type="xint" value="0"/>
          <entry key="5" type="xint" value="1"/>
        </config>
        <config key="values">
          <entry key="array-size" type="xint" value="6"/>
          <entry key="0" type="xstring" value="red"/>
          <entry key="1" type="xstring" value="1"/>
          <entry key="2" type="xstring" value="blue"/>
          <entry key="3" type="xstring" value="2"/>
          <entry key="4" type="xstring" value="yellow"/>
          <entry key="5" type="xstring" value="3"/>
        </config>
        <entry key="rowIdPrefix" type="xstring" value="Row"/>
        <entry key="rowIdSuffix" type="xstring" value=""/>
        <entry key="rowIdStartValue" type="xint" value="0"/>
        <entry key="highlightOutputTable" type="xboolean" value="false"/>
        <config key="columnProperties">
          <config key="0">
            <entry key="UserSetValues" type="xboolean" value="true"/>
            <entry key="MissValuePattern" type="xstring" value=""/>
            <entry key="FormatParameter" type="xstring" isnull="true" value=""/>
            <entry key="ReadPossValsFromFile" type="xboolean" value="false"/>
            <entry key="SkipThisColumn" type="xboolean" value="false"/>
            <entry key="ColumnName" type="xstring" value="Color"/>
            <config key="ColumnClass">
              <entry key="cell_class" type="xstring" value="org.knime.core.data.def.StringCell"/>
              <entry key="is_null" type="xboolean" value="false"/>
            </config>
          </config>
          <config key="1">
            <entry key="UserSetValues" type="xboolean" value="true"/>
            <entry key="MissValuePattern" type="xstring" value=""/>
            <entry key="FormatParameter" type="xstring" isnull="true" value=""/>
            <entry key="ReadPossValsFromFile" type="xboolean" value="false"/>
            <entry key="SkipThisColumn" type="xboolean" value="false"/>
            <entry key="ColumnName" type="xstring" value="Value"/>
            <config key="ColumnClass">
              <entry key="cell_class" type="xstring" value="org.knime.core.data.def.StringCell"/>
              <entry key="is_null" type="xboolean" value="false"/>
            </config>
          </config>
        </config>
      </config>
      <entry key="customDescription" type="xstring" isnull="true" value=""/>
      <entry key="state" type="xstring" value="CONFIGURED"/>
      <entry key="factory" type="xstring" value="org.knime.base.node.io.tablecreator.TableCreator2NodeFactory"/>
      <entry key="node-name" type="xstring" value="Table Creator"/>
      <entry key="node-bundle-name" type="xstring" value="KNIME Base Nodes"/>
      <entry key="node-bundle-symbolic-name" type="xstring" value="org.knime.base"/>
      <entry key="node-bundle-vendor" type="xstring" value="KNIME AG, Zurich, Switzerland"/>
      <entry key="node-bundle-version" type="xstring" value="3.7.1.v201901291053"/>
      <entry key="node-feature-name" type="xstring" value="KNIME Core"/>
      <entry key="node-feature-symbolic-name" type="xstring" value="org.knime.features.base.feature.group"/>
      <entry key="node-feature-vendor" type="xstring" value="KNIME AG, Zurich, Switzerland"/>
      <entry key="node-feature-version" type="xstring" value="3.7.1.v201901291053"/>
      <config key="factory_settings"/>
      <entry key="name" type="xstring" value="Table Creator"/>
      <entry key="hasContent" type="xboolean" value="false"/>
      <entry key="isInactive" type="xboolean" value="false"/>
      <config key="ports">
        <config key="port_1">
          <entry key="index" type="xint" value="1"/>
          <entry key="port_dir_location" type="xstring" isnull="true" value=""/>
        </config>
      </config>
      <config key="filestores">
        <entry key="file_store_location" type="xstring" isnull="true" value=""/>
        <entry key="file_store_id" type="xstring" isnull="true" value=""/>
      </config>
    </config>
  }
}
