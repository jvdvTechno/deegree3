//$HeadURL: svn+ssh://aionita@svn.wald.intevation.org/deegree/base/trunk/resources/eclipse/files_template.xml $
/*----------------    FILE HEADER  ------------------------------------------
 This file is part of deegree.
 Copyright (C) 2001-2008 by:
 Department of Geography, University of Bonn
 http://www.giub.uni-bonn.de/deegree/
 lat/lon GmbH
 http://www.lat-lon.de

 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.
 This library is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public
 License along with this library; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 Contact:

 Andreas Poth
 lat/lon GmbH
 Aennchenstr. 19
 53177 Bonn
 Germany
 E-Mail: poth@lat-lon.de

 Prof. Dr. Klaus Greve
 Department of Geography
 University of Bonn
 Meckenheimer Allee 166
 53115 Bonn
 Germany
 E-Mail: greve@giub.uni-bonn.de
 ---------------------------------------------------------------------------*/

package org.deegree.geometry.primitive.surfacepatches;

import org.deegree.geometry.primitive.surfacepatches.GriddedSurfacePatch.GriddedSurfaceType;

/**
 * The <code>Cone</code> class represents (according to GML-3.1 spec ) a gridded surface given as a family of 
 * conic sections whose control points vary linearly. 
 * A 5-point ellipse with all defining positions identical is a point. Thus, a truncated elliptical cone can be
 * given as a 2x5 set of control points <<P1, P1, P1, P1, P1>, <P2, P3, P4, P5, P6>>. P1 is the apex of the
 * cone. P2, P3, P4, P5 and P6 are any five distinct points around the base ellipse of the cone. If the horizontal
 * curves are circles as opposed to ellipses, the circular cone can be constructed using <<P1, P1, P1>, <P2, P3,
 * P4>>.
 * 
 * @author <a href="mailto:ionita@lat-lon.de">Andrei Ionita</a>
 * 
 * @author last edited by: $Author: ionita $
 * 
 * @version $Revision: $, $Date: $
 * 
 */
public interface Cone extends GriddedSurfacePatch {

    // nothing new here, this interface is only necessary for a type-based differentiation    
    
    /**
     * Must always return {@link GriddedSurfacePatch.GriddedSurfaceType#CONE}.
     * 
     * @return {@link GriddedSurfacePatch.GriddedSurfaceType#CONE}
     */
    @Override
    public GriddedSurfaceType getGriddedSurfaceType();
}
