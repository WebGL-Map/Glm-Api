/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Tyler Bucher
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.reallifegames.glm.api.server;

import com.fasterxml.jackson.databind.JsonNode;
import org.java_websocket.WebSocket;

import javax.annotation.Nonnull;

/**
 * Handles a given web socket server command.
 *
 * @author Tyler Bucher
 */
public interface WsServerCommand {

    /**
     * Handles a given server command.
     *
     * @param connection  the {@link WebSocket} instance this event is occurring on.
     * @param commandNode the {@link JsonNode} for the command and parameters.
     */
    void handle(@Nonnull final WebSocket connection, @Nonnull final JsonNode commandNode);

    /**
     * @return time in milliseconds before this command should be allowed to be run again.
     */
    long getInterval();
}
