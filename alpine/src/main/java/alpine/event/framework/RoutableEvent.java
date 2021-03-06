/*
 * This file is part of Alpine.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package alpine.event.framework;

/**
 * The RoutableEvent interface defines methods necessary to support
 * an unbounded chain of callbacks and event between different
 * {@link IEventService} implementations.
 *
 * @author Steve Springett
 * @since 1.2.0
 */
public interface RoutableEvent extends Event {

    /**
     * Returns the optional callback event that should be processed if this event is successful.
     * @since 1.2.0
     * @return an EventCallback
     */
    EventCallback onSuccess();

    /**
     * Returns the optional callback event that should be processed if this event is not successful.
     * @since 1.2.0
     * @return an EventCallback
     */
    EventCallback onFailure();

    /**
     * Fluent method that sets the onSuccess EventCallBack and returns this object.
     * @since 1.2.0
     * @return the current object
     */
    RoutableEvent onSuccess(EventCallback onSuccessCallback);

    /**
     * Fluent method that sets the onFailure EventCallBack and returns this object.
     * @since 1.2.0
     * @return the current object
     */
    RoutableEvent onFailure(EventCallback onFailureCallback);

}
