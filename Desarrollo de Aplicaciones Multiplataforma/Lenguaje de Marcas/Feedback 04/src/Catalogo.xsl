<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">    
    <xsl:template match="/">
        <html>
            <head>
                <title>XSL</title>
            </head>
            <body>
                <h1 align="center">Catalogo</h1>
                <table border="1" align="center">
                    <tr>
                        <th>Titulo</th>
                        <th>Grupo</th>
                        <th>Formato</th>
                        <th>Idioma</th>
                        <th>Año</th>
                        <th>Singles</th>
                    </tr>
                    <xsl:for-each select="//disco">
                    <tr>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="grupo"/></td>
                        <td><xsl:value-of select="@formato"/></td>
                        <td><xsl:value-of select="@idioma"/></td>
                        <td><xsl:value-of select="año"/></td>                        
                        <td><xsl:value-of select="singles/single"/></td>
                    </tr>
                    </xsl:for-each>
                </table>
                <h1 align="center">Grupos en Inglés</h1>
                <table align="center" border="1">
                    <tr>
                        <th>Titulo</th>
                        <th>Grupo</th>
                        <th>Formato</th>
                        <th>Idioma</th>
                        <th>Año</th>
                        <th>Singles</th>
                    </tr>
                    <xsl:for-each select="//disco">
                    <xsl:if test="@idioma='en'">
                    <tr>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="grupo"/></td>
                        <td><xsl:value-of select="@formato"/></td>
                        <td><xsl:value-of select="@idioma"/></td>
                        <td><xsl:value-of select="año"/></td>                        
                        <td><xsl:value-of select="singles/single"/></td>            
                    </tr>
                    </xsl:if>
                    </xsl:for-each>
                </table>
                <h1 align="center">Grupos en Español</h1>
                <table align="center" border="1">
                    <tr>
                        <th>Titulo</th>
                        <th>Grupo</th>
                        <th>Formato</th>
                        <th>Idioma</th>
                        <th>Año</th>
                        <th>Singles</th>
                    </tr>
                    <xsl:for-each select="//disco">
                    <xsl:if test="@idioma='es'">
                    <tr>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="grupo"/></td>
                        <td><xsl:value-of select="@formato"/></td>
                        <td><xsl:value-of select="@idioma"/></td>
                        <td><xsl:value-of select="año"/></td>                        
                        <td><xsl:value-of select="singles/single"/></td>            
                    </tr>
                    </xsl:if>
                    </xsl:for-each>
                </table>
				<h1 align="center">Grupos en Aleman</h1>
                <table align="center" border="1">
                    <tr>
                        <th>Titulo</th>
                        <th>Grupo</th>
                        <th>Formato</th>
                        <th>Idioma</th>
                        <th>Año</th>
                        <th>Singles</th>
                    </tr>
                    <xsl:for-each select="//disco">
                    <xsl:if test="@idioma='es'">
                    <tr>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="grupo"/></td>
                        <td><xsl:value-of select="@formato"/></td>
                        <td><xsl:value-of select="@idioma"/></td>
                        <td><xsl:value-of select="año"/></td>                        
                        <td><xsl:value-of select="singles/single"/></td>            
                    </tr>
                    </xsl:if>
                    </xsl:for-each>
                </table>
                <h1 align="center">Discos Publicados Después del Año 2000</h1>
                <table align="center" border="1">
                    <tr>
                        <th>Titulo</th>
                        <th>Grupo</th>
                        <th>Formato</th>
                        <th>Idioma</th>
                        <th>Año</th>
                        <th>Singles</th>
                    </tr>
                    <xsl:for-each select="//disco">
                    <xsl:if test="año &gt; '2000'">
                    <tr>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="grupo"/></td>
                        <td><xsl:value-of select="@formato"/></td>
                        <td><xsl:value-of select="@idioma"/></td>
                        <td><xsl:value-of select="año"/></td>                        
                        <td><xsl:value-of select="singles/single"/></td>            
                    </tr>
                    </xsl:if>
                    </xsl:for-each>
                </table>
				<h1 align="center">Discos Publicados Antes del Año 2000</h1>
                <table align="center" border="1">
                    <tr>
                        <th>Titulo</th>
                        <th>Grupo</th>
                        <th>Formato</th>
                        <th>Idioma</th>
                        <th>Año</th>
                        <th>Singles</th>
                    </tr>
                    <xsl:for-each select="//disco">
                    <xsl:if test="año &gt; '2000'">
                    <tr>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="grupo"/></td>
                        <td><xsl:value-of select="@formato"/></td>
                        <td><xsl:value-of select="@idioma"/></td>
                        <td><xsl:value-of select="año"/></td>                        
                        <td><xsl:value-of select="singles/single"/></td>            
                    </tr>
                    </xsl:if>
                    </xsl:for-each>
                </table>
                <h1 align="center">Titulo del álbum en Posicion 3</h1>
                <table align ="center" border="1">
                    <tr>
                        <th>Título</th>
                    </tr>
                    <xsl:for-each select="tabla/disco[3]">
                        <tr>
                            <td><xsl:value-of select="titulo"/></td>
                        </tr>
                    </xsl:for-each>
                    
                </table>
                <h1 align="center">Titulo del Penultimo Disco</h1>
                <table border="1" align="center">
					<tr>
						<th>Título</th>
					</tr>
					<xsl:for-each select="tabla/disco[last()-1]">
					<tr>
						<td><xsl:value-of select="titulo"/></td>
					</tr>
					</xsl:for-each>
            </table>
            <h1 align="center">Número de Discos</h1>
            <table border="1" align="center">
                    <tr>
                        <th>Numero de discos</th>
                    </tr>
                    <xsl:for-each select="tabla">
                    <tr>
                       <td><xsl:value-of select="count(disco)"/></td>
                    </tr>
              </xsl:for-each>
            </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>