package gwt.material.design.client.type;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
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

import com.google.gwt.dom.client.Style;
import gwt.material.design.client.custom.Type;

/**
 * Types of Icon
 * - CIRCLE
 * @author kevzlou7979
 */
public enum IconType implements Type, Style.HasCssName {
	CIRCLE("circle");

	private final String cssClass;

	IconType(final String cssClass) {
		this.cssClass = cssClass;
	}

	@Override
	public String getCssName() {
		return cssClass;
	}

	/**
	 * Get Type from String.
	 */
	public static IconType fromString(String text) {
		if (text != null) {
			for (IconType b : IconType.values()) {
				if (text.equalsIgnoreCase(b.getCssName())) {
					return b;
				}
			}
		}
		return null;
	}
}
