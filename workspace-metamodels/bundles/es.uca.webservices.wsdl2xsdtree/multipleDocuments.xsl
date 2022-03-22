<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:file="java:java.io.File"
                xmlns:tr="java:es.uca.webservices.wsdl.util.SingleWSDLTransformer"
                exclude-result-prefixes="file">

    <xsl:output method="xml" indent="yes"/>
    <xsl:param name="transformer" required="yes"/>
    <xsl:param name="wsdlFile" required="yes"/>

    <xsl:variable name="baseXSD" select="tr:getPathToXSDFromWSDLFile($transformer, $wsdlFile)"/>

    <xsl:template match="wsdl:definitions">
        <xs:schema>
            <!--
               To make the simplest cases cleaner, we inline the first schema with
               the same target namespace into the main schema for the .wsdl file,
               if it exists. The rest are extracted as separate files. We can't
               inline all schemas with the same TNS into the main schema, as they
               might have different values for attributeFormDefault or
               elementFormDefault, among others.
            -->
            <xsl:variable name="definitionsTNS" select="@targetNamespace"/>
            <xsl:variable name="firstSchemaWithSameTNS"
                          select="wsdl:types/xs:schema[@targetNamespace = $definitionsTNS][1]"/>

            <xsl:copy-of select="@targetNamespace | namespace::*[name(.) != '']"/>
            <xsl:copy-of select="$firstSchemaWithSameTNS/@*"/>

            <xsl:for-each select="wsdl:import">
                <xs:import namespace="{@namespace}"
                           schemaLocation="{tr:getPathToXSDFromImportLocation($transformer, @location)}"/>
            </xsl:for-each>

            <xsl:for-each select="wsdl:types/xs:schema[not(. is $firstSchemaWithSameTNS)]">
                <xsl:variable name="subDocPath" select="concat($baseXSD, '_', position(),'.xsd')"/>

                <!-- The helper .xsd file will be in the same directory as the main one -->
                <xs:import namespace="{@targetNamespace}" schemaLocation="{$subDocPath}"/>
                <xsl:result-document href="{$subDocPath}">
                    <xsl:apply-templates select="." mode="embedded-xsd"/>
                </xsl:result-document>
            </xsl:for-each>

            <xsl:apply-templates select="$firstSchemaWithSameTNS/node()" mode="embedded-xsd"/>
        </xs:schema>
    </xsl:template>

    <xsl:template match="xs:import[@schemaLocation]" mode="embedded-xsd">
        <xsl:copy>
            <xsl:copy-of select="@*[not(local-name() = 'schemaLocation')]"/>
            <xsl:attribute name="schemaLocation"
                           select="tr:resolveRelativeURI($transformer, $wsdlFile, @schemaLocation)"/>
            <xsl:copy-of select="node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="*" mode="embedded-xsd">
        <xsl:copy>
            <xsl:copy-of select="@*"/>
            <xsl:apply-templates mode="#current"/>
        </xsl:copy>
    </xsl:template>

</xsl:stylesheet>
