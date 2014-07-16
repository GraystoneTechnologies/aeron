/*
 * Copyright 2014 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.aeron.mediadriver.cmd;

import uk.co.real_logic.aeron.mediadriver.UdpDestination;

public class RemoveSubscriptionCmd
{
    private final UdpDestination udpDestination;
    private final long channelId;

    public RemoveSubscriptionCmd(final UdpDestination udpDestination, final long channelId)
    {
        this.udpDestination = udpDestination;
        this.channelId = channelId;
    }

    public UdpDestination destination()
    {
        return udpDestination;
    }

    public long channelId()
    {
        return channelId;
    }
}
