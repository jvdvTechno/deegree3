//$HeadURL$
/*----------------------------------------------------------------------------
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2009 by:
 - Department of Geography, University of Bonn -
 and
 - lat/lon GmbH -

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option)
 any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 details.
 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation, Inc.,
 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Contact information:

 lat/lon GmbH
 Aennchenstr. 19, 53177 Bonn
 Germany
 http://lat-lon.de/

 Department of Geography, University of Bonn
 Prof. Dr. Klaus Greve
 Postfach 1147, 53001 Bonn
 Germany
 http://www.geographie.uni-bonn.de/deegree/

 e-mail: info@deegree.org
 ----------------------------------------------------------------------------*/
package org.deegree.feature.persistence.postgis;

import javax.xml.namespace.QName;

import org.deegree.feature.FeatureCollection;
import org.deegree.feature.persistence.FeatureStore;
import org.deegree.feature.persistence.FeatureStoreException;
import org.deegree.feature.persistence.FeatureStoreTransaction;
import org.deegree.feature.persistence.StoredFeatureTypeMetadata;
import org.deegree.feature.persistence.lock.LockManager;
import org.deegree.feature.persistence.postgis.mapping.SchemaMapping;
import org.deegree.feature.types.ApplicationSchema;
import org.deegree.filter.Filter;
import org.deegree.filter.FilterEvaluationException;
import org.deegree.geometry.Envelope;
import org.deegree.protocol.wfs.getfeature.Query;

/**
 * {@link FeatureStore} implementation that uses a PostGIS/PostgreSQL database as backend.
 * 
 * @see FeatureStore
 * 
 * @author <a href="mailto:schneider@lat-lon.de">Markus Schneider</a>
 * @author last edited by: $Author$
 * 
 * @version $Revision$, $Date$
 */
public class PostGISFeatureStore implements FeatureStore {

    private ApplicationSchema schema;

    private SchemaMapping mapping;

    /**
     * Creates a new {@link PostGISFeatureStore} for the given {@link ApplicationSchema}.
     * 
     * @param schema
     *            application schema, must not be <code>null</code>
     * @param mapping
     *            mapping information, must not be <code>null</code>
     * @throws FeatureStoreException
     */
    public PostGISFeatureStore( ApplicationSchema schema, SchemaMapping mapping ) throws FeatureStoreException {
        this.schema = schema;
        this.mapping = mapping;
    }

    @Override
    public FeatureStoreTransaction acquireTransaction()
                            throws FeatureStoreException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public Envelope getEnvelope( QName ftName ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LockManager getLockManager()
                            throws FeatureStoreException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StoredFeatureTypeMetadata getMetadata( QName ftName ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getObjectById( String id )
                            throws FeatureStoreException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ApplicationSchema getSchema() {
        return schema;
    }

    @Override
    public void init()
                            throws FeatureStoreException {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean isAvailable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int performHitsQuery( Query query )
                            throws FeatureStoreException, FilterEvaluationException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public FeatureCollection performQuery( Query query )
                            throws FeatureStoreException, FilterEvaluationException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FeatureCollection query( QName featureType, Filter filter, Envelope bbox, boolean withGeometries,
                                    boolean exact )
                            throws FeatureStoreException, FilterEvaluationException {
        // TODO Auto-generated method stub
        return null;
    }
}
