/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.base;

public interface HasErrorText {

    /**
     * Errors occur when an app fails to complete what is expected, such as:
     * - The app does not understand user input
     * - The system or app fails
     * - A user intends to run incompatible operations concurrently
     */
    void setErrorText(String errorText);

    /**
     * Is the error text applied and visible.
     */
    boolean isErrorTextVisible();

    /**
     * Clear the error states.
     */
    void clearErrorText();
}
