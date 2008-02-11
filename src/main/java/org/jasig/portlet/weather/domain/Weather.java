/* Copyright 2008 The JA-SIG Collaborative. All rights reserved.
 *  See license distributed with this file and
 *  available online at http://www.uportal.org/license.html
 */

package org.jasig.portlet.weather.domain;

import java.io.Serializable;
import java.util.Collection;

/**
 * This class models general weather for a certain location including the
 * current weather and optional forecast weather.
 * 
 * @author Dustin Schultz
 * @version $Id$
 */
public class Weather implements Serializable {

	private static final long serialVersionUID = -3036893410887609714L;
	private Current currentWeather = null;
	private Location location = null;
	private Collection<Forecast> forecast = null;
	private Boolean metric = null;

	public Current getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(Current currentWeather) {
		this.currentWeather = currentWeather;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Collection<Forecast> getForecast() {
		return forecast;
	}

	public void setForecast(Collection<Forecast> forecast) {
		this.forecast = forecast;
	}

	public Boolean getMetric() {
		return metric;
	}

	public void setMetric(Boolean metric) {
		this.metric = metric;
	}
}
