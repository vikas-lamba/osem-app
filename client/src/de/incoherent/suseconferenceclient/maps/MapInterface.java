/*******************************************************************************
 * Copyright (c) 2012 Matt Barringer <matt@incoherent.de>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Matt Barringer <matt@incoherent.de> - initial API and implementation
 ******************************************************************************/

package de.incoherent.suseconferenceclient.maps;

import org.osmdroid.util.BoundingBoxE6;

import de.incoherent.suseconferenceclient.models.Venue;
import android.view.View;

/*
 * Both GoogleMap and OSMMap implement this interface so the user
 * can switch between online Google maps, and offline OSM maps.
 */

public interface MapInterface {
	public View getView();
	public void setupMap(Venue venue);
	public void enableLocation();
	public void disableLocation();
	public void setBoundingBox(BoundingBoxE6 box);
}
