package com.github.hypfvieh.bluetooth;

import org.freedesktop.dbus.UInt16;

/**
 * Supported discovery filter values.
 */
public enum DiscoveryFilter {

    UUIDs(String[].class),RSSI(Short.class),Pathloss(UInt16.class),Transport(DiscoveryTransport.class); 
    
    private final Class<?> valueClass;

    private DiscoveryFilter(Class<?> _valueClass) {
        valueClass = _valueClass;
    }

    public Class<?> getValueClass() {
        return valueClass;
    }    
}


