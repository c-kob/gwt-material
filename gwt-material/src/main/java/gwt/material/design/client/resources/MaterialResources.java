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
package gwt.material.design.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface MaterialResources extends ClientBundle {
    MaterialResources INSTANCE = GWT.create(MaterialResources.class);

    @Source("js/animation.min.js")
    TextResource animationJs();

    @Source("js/materialize-0.97.5.min.js")
    TextResource materializeJs();

    @Source("js/app-installer.min.js")
    TextResource appInstallerJs();

    @Source("js/focus-visible.min.js")
    TextResource focusVisibleJs();
}
