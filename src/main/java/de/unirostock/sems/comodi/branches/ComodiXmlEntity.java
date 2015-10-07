/**
 * This file is part of jCOMODI - a library for the COMODI ontology.
 * Copyright (c) 2015, Martin Scharm <jcomodi-code@binfalse.de>
 * 
 * jCOMODI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * jCOMODI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with jCOMODI. If not, see <http://www.gnu.org/licenses/>.
 * 
 * @see <a href="http://purl.org/net/comodi">COMODI</a>
 */
package de.unirostock.sems.comodi.branches;

import de.unirostock.sems.comodi.ComodiBranchTerm;


/**
 * The Class ComodiXmlEntity creating terms of COMODI's XmlEntity branch.
 *
 * @author Martin Scharm
 */
public class ComodiXmlEntity
extends ComodiBranchTerm
{
	
	/**
	 * The Constructor -- just to call the constructor of the super class.
	 *
	 * @param term the term
	 */
	protected ComodiXmlEntity (String term)
	{
		super (term);
	}
	
	/**
	 * Gets the term representing an XML node.
	 * 
	 * <pre>
	 * Node -> XmlEntity
	 * </pre>
	 *
	 * @return the node term
	 */
	public static ComodiXmlEntity getNode ()
	{
		return new ComodiXmlEntity ("Node");
	}
	
	/**
	 * Gets the term representing an XML attribute.
	 * 
	 * <pre>
	 * Attribute -> XmlEntity
	 * </pre>
	 * 
	 * @return the attribute term
	 */
	public static ComodiXmlEntity getAttribute ()
	{
		return new ComodiXmlEntity ("Attribute");
	}
	
	/**
	 * Gets the term representing an XML entity identifier, typically the <code>id</code> attribute.
	 *
	 * <pre>
	 * Attribute -> XmlEntity
	 * </pre>
	 * 
	 * @return the entity identifier term
	 */
	public static ComodiXmlEntity getEntityIdentifier ()
	{
		return new ComodiXmlEntity ("EntityIdentifier");
	}
	
	/**
	 * Gets the term representing a change in the model identifier.
	 * For example the <code>&lt;model id=".."</code> in SBML models.
	 *
	 * <pre>
	 * ModelId -> Attribute -> XmlEntity
	 * </pre>
	 * 
	 * @return the model id term
	 */
	public static ComodiXmlEntity getModelId ()
	{
		return new ComodiXmlEntity ("ModelId");
	}
	
	/**
	 * Gets the resenting an XML entity name, typically the <code>name</code> attribute.
	 *
	 * <pre>
	 * EntityName -> Attribute -> XmlEntity
	 * </pre>
	 * 
	 * @return the entity name term
	 */
	public static ComodiXmlEntity getEntityName ()
	{
		return new ComodiXmlEntity ("EntityName");
	}
	
	/**
	 * Gets the representing a change in the model name.
	 * For example the <code>&lt;model name=".."</code> in SBML models.
	 *
	 * <pre>
	 * ModelName -> Attribute -> XmlEntity
	 * </pre>
	 * 
	 * @return the model name term
	 */
	public static ComodiXmlEntity getModelName ()
	{
		return new ComodiXmlEntity ("ModelName");
	}
	
	/**
	 * Gets the term representing an XML text node.
	 *
	 * <pre>
	 * Text -> XmlEntity
	 * </pre>
	 * 
	 * @return the text node term
	 */
	public static ComodiXmlEntity getText ()
	{
		return new ComodiXmlEntity ("Text");
	}
}
