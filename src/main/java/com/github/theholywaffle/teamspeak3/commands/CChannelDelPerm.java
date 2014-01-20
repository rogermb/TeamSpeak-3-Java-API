/*******************************************************************************
 * Copyright (c) 2014 Bert De Geyter (https://github.com/TheHolyWaffle).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Bert De Geyter (https://github.com/TheHolyWaffle) - initial API and implementation
 ******************************************************************************/
package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.commands.parameter.KeyValueParam;

public class CChannelDelPerm extends Command {

	public CChannelDelPerm(int channelId, String permName) {
		super("channeldelperm");
		add(new KeyValueParam("cid",channelId));
		add(new KeyValueParam("permsid",permName));
	}

}
