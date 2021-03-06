/*
 * This file is part of spyNet Camera, the Android IP camera
 *
 * Copyright (C) 2016-2017 Paolo Dematteis
 *
 * spyNet Camera is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * spyNet Camera is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Paolo Dematteis - spynet314@gmail.com
 */

package com.spynet.camera.network.DDNS;

import android.content.Context;

import org.jetbrains.annotations.NotNull;

/**
 * Implements the Free DNS client (http://freedns.afraid.org/dynamic).
 */
public class FreeDNSDClient extends DDNSClient {
    /**
     * Creates a new DNSdynamicClient object.
     *
     * @param context  the context where the NoIpClient is used
     * @param hostname the public hostname handled by the DDNS service
     * @param username the DDNS service username
     * @param password the DDNS service password
     */
    public FreeDNSDClient(@NotNull Context context, String hostname, String username, String password) {
        super(context, hostname, username, password);
        mURL = "https://sync.afraid.org/nic/update";
    }
}
