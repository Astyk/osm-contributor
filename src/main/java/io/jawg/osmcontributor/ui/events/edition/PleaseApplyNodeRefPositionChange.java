/**
 * Copyright (C) 2016 eBusiness Information
 *
 * This file is part of OSM Contributor.
 *
 * OSM Contributor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OSM Contributor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OSM Contributor.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.jawg.osmcontributor.ui.events.edition;


import com.mapbox.mapboxsdk.geometry.LatLng;

public class PleaseApplyNodeRefPositionChange {
    private final LatLng poiPosition;
    private final Long poiId;

    public PleaseApplyNodeRefPositionChange(LatLng poiPosition, Long poiId) {
        this.poiPosition = poiPosition;
        this.poiId = poiId;
    }

    public Long getPoiId() {
        return poiId;
    }

    public LatLng getPoiPosition() {
        return poiPosition;
    }
}
