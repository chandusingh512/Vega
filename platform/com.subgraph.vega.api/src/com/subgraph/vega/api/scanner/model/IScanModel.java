package com.subgraph.vega.api.scanner.model;

import java.net.URI;
import java.util.List;

import com.subgraph.vega.api.events.IEventHandler;

public interface IScanModel {
	void addDiscoveredURI(URI uri);
	void addAlert(IScanAlert alert);
	IScanAlert createAlert(String type);
	List<IScanAlert> getAlerts();
	void addAlertListenerAndPopulate(IEventHandler listener);
	void removeAlertListener(IEventHandler listener);

}