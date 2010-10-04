package com.subgraph.vega.internal.model.web;

import com.subgraph.vega.api.model.web.IWebEntity;
import com.subgraph.vega.api.model.web.IWebModelChangeEvent;

public class AddEntityEvent implements IWebModelChangeEvent {
	
	private final IWebEntity entity;
	
	AddEntityEvent(IWebEntity entity) {
		this.entity = entity;
	}
	
	@Override
	public boolean isEntityAddEvent() {
		return true;
	}

	@Override
	public IWebEntity getEntity() {
		return entity;
	}

}