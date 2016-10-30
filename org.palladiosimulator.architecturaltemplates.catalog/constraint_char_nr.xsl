<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" encoding="utf-8"/>
    <xsl:template match="//ATs">
        <xsl:value-of select="@entityName"/>
        <xsl:text> AT

        </xsl:text>
        <xsl:apply-templates select="roles"/>
    </xsl:template>

    <xsl:template match="roles">
        <xsl:text>  </xsl:text>
        <xsl:value-of select="@entityName"/>
        <xsl:text> Constraints:
        </xsl:text>
        <xsl:apply-templates select="constraints"/>
        <xsl:text>    Total characters of role constraints: </xsl:text>
        <xsl:value-of select="sum(for $c in constraints 
                return string-length($c/@expression))"/>
        <xsl:text>
        </xsl:text>
    </xsl:template>

    <xsl:template match="constraints">
        <xsl:text>    </xsl:text>
        <xsl:value-of select="@entityName"/>
        <xsl:text>: </xsl:text>
        <xsl:value-of select="string-length(@expression)"/>
        <xsl:text> characters</xsl:text>
        <xsl:text>
        </xsl:text>
    </xsl:template>
</xsl:stylesheet>
