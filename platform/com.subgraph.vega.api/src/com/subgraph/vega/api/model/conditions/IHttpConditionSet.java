/*******************************************************************************
 * Copyright (c) 2011 Subgraph.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Subgraph - initial API and implementation
 ******************************************************************************/
package com.subgraph.vega.api.model.conditions;

import java.util.List;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

import com.subgraph.vega.api.model.requests.IRequestLogRecord;

public interface IHttpConditionSet {
	String getName();
	boolean matchesAll(IRequestLogRecord record);
	boolean matchesAll(HttpRequest request, HttpResponse response);
	boolean matchesAny(IRequestLogRecord record);
	boolean matchesAny(HttpRequest request, HttpResponse response);
	/**
	 * Add a temporary condition to this set.  Temporary conditions are not persisted in the database.
	 * @param condition The temporary condition to add.
	 */
	void appendTemporaryCondition(IHttpCondition condition);
	void removeTemporaryCondition(IHttpCondition condition);
	void clearTemporaryCondition(IHttpCondition condition);
	List<IHttpCondition> getAllTemporaryConditions(boolean includeInternal);
	
	void appendCondition(IHttpCondition condition);
	void removeCondition(IHttpCondition condition);
	void clearConditions();
	List<IHttpCondition> getAllConditions();
	List<IHttpCondition> getAllConditions(boolean includeInternal);
	IHttpConditionManager getConditionManager();
	void setMatchOnEmptySet(boolean flag);
}
