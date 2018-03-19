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
package net.reallifegames.glm.api;

import javax.annotation.Nonnull;

/**
 * A compressed chunk representation for the client side WebGl map.
 *
 * @author Tyler Bucher
 */
public interface GlmChunk {

    /**
     * @return the time in milliseconds when this snapshot was taken.
     */
    long getChunkGenerationTime();

    /**
     * @return the chunk data which the client will render. This data should be compressed using Gzip.
     */
    @Nonnull
    String getChunkData();

    /**
     * @return The chunk height data which the client can use for positioning.
     * This data should be compressed using Gzip.
     */
    @Nonnull
    String getChunkHeightData();
}
