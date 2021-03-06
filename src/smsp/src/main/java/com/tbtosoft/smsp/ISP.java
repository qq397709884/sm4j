/**
 * Copyright(C) 2012-2015 chun.cheng TBTOSOFT
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 */
package com.tbtosoft.smsp;

import java.util.Collection;

/**
 * @author chengchun
 *
 */
public interface ISP {
	public boolean start();
	public boolean send(String message, Collection<String> terminals);
	public void setListener(ISPListener listener);
	public void stop();
}
