/*  
 *  Imixs-Workflow 
 *  
 *  Copyright (C) 2001-2020 Imixs Software Solutions GmbH,  
 *  http://www.imixs.com
 *  
 *  This program is free software; you can redistribute it and/or 
 *  modify it under the terms of the GNU General Public License 
 *  as published by the Free Software Foundation; either version 2 
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful, 
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You can receive a copy of the GNU General Public
 *  License at http://www.gnu.org/licenses/gpl.html
 *  
 *  Project: 
 *      https://www.imixs.org
 *      https://github.com/imixs/imixs-workflow
 *  
 *  Contributors:  
 *      Imixs Software Solutions GmbH - Project Management
 *      Ralph Soika - Software Developer
 */

package org.imixs.workflow.exceptions;

/**
 * The QueryException is thrown in case a search query can not be pased.
 * 
 * @see org.imixs.workflow.engine.lucene.LuceneSearchService
 * @author rsoika
 * 
 */
public class QueryException extends WorkflowException {

    public static final String QUERY_NOT_UNDERSTANDABLE = "QUERY_NOT_UNDERSTANDABLE";

    private static final long serialVersionUID = 1L;

    public QueryException(String aErrorCode, String message) {
        super(aErrorCode, message);
    }

    public QueryException(String aErrorCode, String message, Exception e) {
        super(aErrorCode, message, e);
    }

}
